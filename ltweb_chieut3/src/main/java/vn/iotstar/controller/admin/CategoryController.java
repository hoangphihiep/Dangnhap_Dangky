package vn.iotstar.controller.admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import vn.iotstar.models.CategoryModel;
import vn.iotstar.services.ICategoryService;
import vn.iotstar.services.impl.CategoryServiceImpl;
import vn.iotstar.utils.Constant;

@MultipartConfig
@WebServlet(urlPatterns = {"/admin/categories", "/admin/category/add", "/admin/category/insert" , "/admin/category/edit", "/admin/category/update" , "/admin/category/delete"})
public class CategoryController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public ICategoryService cateService = new CategoryServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url  = req.getRequestURI();
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		if (url.contains("/admin/categories"))
		{
			List<CategoryModel> list  = cateService.findAll();
			req.setAttribute("listcate", list);
			req.getRequestDispatcher("/views/admin/category-list.jsp").forward(req, resp);
		}
		else if (url.contains("/admin/category/add"))
		{
			req.getRequestDispatcher("/views/admin/category-add.jsp").forward(req, resp);
		}
		else if (url.contains("/admin/category/edit"))
		{
			int id = Integer.parseInt(req.getParameter("id"));
			CategoryModel category = cateService.findById(id);
			req.setAttribute("cate", category);
			req.getRequestDispatcher("/views/admin/category-edit.jsp").forward(req, resp);
		}
		else
		{
			int id = Integer.parseInt(req.getParameter("id"));
			cateService.delete(id);
			resp.sendRedirect("/views/user/home.jsp");
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url  = req.getRequestURI();
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		if (url.contains("/admin/category/insert"))
		{
			String categoryname = req.getParameter("categoryname");
			int status = Integer.parseInt(req.getParameter("status"));
			String images = req.getParameter("images");
			String images1 = req.getParameter("images1");
			
			CategoryModel category = new CategoryModel();
			category.setCategoryname(categoryname);
			category.setStatus(status);
			
			String fname ="";
			String uploadPath = Constant.DIR;
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists())
				uploadDir.mkdir();
			
			try
			{
				Part part = req.getPart("images1");
				if (part.getSize() > 0)
				{
					String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
					int index = filename.lastIndexOf(".");
					String ext = filename.substring(index + 1);
					fname = System.currentTimeMillis() + "." + ext;
					
					part.write(uploadPath + "/" + fname);
					
					category.setImages(fname);
				}else if (images != null)
				{
					category.setImages(images);
				}
				else
				{
					category.setImages("avatar.png");
				}
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			cateService.insert(category);
			
			resp.sendRedirect(req.getContextPath() + "/admin/categories");
		}
		if (url.contains("/admin/category/update"))
		{
			int categoryid = Integer.parseInt(req.getParameter("categoryid"));
			String categoryname = req.getParameter("categoryname");
			int status = Integer.parseInt(req.getParameter("status"));
			String images = req.getParameter("images");
			
			CategoryModel category = cateService.findById(categoryid);
			String fileold = category.getImages();
			category.setCategoryname(categoryname);
			category.setStatus(status);
			
			String fname ="";
			String uploadPath = Constant.DIR;
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists())
				uploadDir.mkdir();
			
			try
			{
				Part part = req.getPart("images1");
				if (part.getSize() > 0)
				{
					String filename = Paths.get(part.getSubmittedFileName()).getFileName().toString();
					int index = filename.lastIndexOf(".");
					String ext = filename.substring(index + 1);
					fname = System.currentTimeMillis() + "." + ext;
					
					//xoa file cu tren thu muc
					part.write(uploadPath + "/" + fname);
					
					category.setImages(fname);
				}else if (images != null)
				{
					category.setImages(images);
				}
				else
				{
					category.setImages(fileold);
				}
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			cateService.update(category);
			
			resp.sendRedirect(req.getContextPath() + "/admin/categories");
		}
	}
	

}
