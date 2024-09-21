package vn.iotstar.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.iotstar.services.IUserServices;
import vn.iotstar.services.impl.UserServiceImpl;

@WebServlet(urlPatterns = "/forgot-password")
public class ForgotPasswordController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/views/forgot-password.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usernameOrEmail = req.getParameter("usernameOrEmail");
		IUserServices service = new UserServiceImpl();
		String alertMsg = "";
		if (service.checkExistUsername(usernameOrEmail) || service.checkExistEmail(usernameOrEmail)) {
			req.setAttribute("usernameOrEmail", usernameOrEmail);
			req.getRequestDispatcher("/views/reset-password.jsp").forward(req, resp);
		} else {
			alertMsg = "Tên hoặc Email không tồn tại!";
			req.setAttribute("alert", alertMsg);
			req.getRequestDispatcher("/views/forgot-password.jsp").forward(req, resp);
		}
	}
}
