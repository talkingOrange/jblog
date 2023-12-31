package com.poscodx.jblog.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import com.poscodx.jblog.service.UserService;
import com.poscodx.jblog.vo.UserVo;


public class LoginInterceptor implements HandlerInterceptor {

	@Autowired
	private UserService userService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		// new로 객체생성하는 것은 위험!! autowired로 이용하기!! UserService userService = new
		// UserService();
		UserVo authUser = userService.getUser(id, password);

		if (authUser == null) {
			request.setAttribute("id", id);
			request.getRequestDispatcher("/WEB-INF/views/user/login.jsp").forward(request, response);

			return false;
		}

		
		System.out.println("auth success: " + authUser);
		HttpSession session = request.getSession(true);
		session.setAttribute("authUser", authUser);
		response.sendRedirect(request.getContextPath());
		
		return false;
	}

}
