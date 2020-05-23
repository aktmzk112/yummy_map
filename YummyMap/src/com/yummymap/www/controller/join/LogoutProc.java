package com.yummymap.www.controller.join;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yummymap.www.controller.MmyController;

public class LogoutProc implements MmyController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		req.getSession().removeAttribute("sid");
		String view = "/YummyMap/main.mmy";
		return view;
	}

}
