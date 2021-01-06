package com.luban.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
	public ModelAndView handleRequest(HttpServletRequest request,
									  HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("message", "默认的映射处理器示例");
		System.out.println("this is demo controller~");
		response.getWriter().write("this is my demo controller~");
		return null;//返回null告诉视图渲染
	}
}
