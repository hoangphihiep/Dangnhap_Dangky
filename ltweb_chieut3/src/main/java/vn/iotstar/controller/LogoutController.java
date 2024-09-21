package vn.iotstar.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Lấy session hiện tại, nếu có
        HttpSession session = req.getSession(false);
        
        if (session != null) {
            // Invalidate session để xóa toàn bộ thông tin session của người dùng
            session.invalidate();
        }
        
        // Xóa cookie "username"
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    // Thiết lập giá trị rỗng và thời gian sống bằng 0 để xóa cookie
                    cookie.setValue("");
                    cookie.setMaxAge(0);
                    resp.addCookie(cookie);  // Ghi đè lại cookie đã xóa vào response
                }
            }
        }

        // Chuyển hướng người dùng về trang đăng nhập hoặc trang chủ
        resp.sendRedirect(req.getContextPath() + "/login");
	}
}
