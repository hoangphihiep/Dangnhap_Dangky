package vn.iotstar.controller.manager;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/manager/home"})
public class HomeController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession(false);
		if (session != null && session.getAttribute("account") != null) {
			req.getRequestDispatcher("/views/manager/home.jsp").forward(req, resp);
			return;
		}
		else {
			resp.sendRedirect(req.getContextPath()+"/login");
		}
	}

}
