package com.yummymap.www.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yummymap.www.controller.MmyController;
import com.yummymap.www.vo.admin.MemberInfoVO;

public class RememberProc implements MmyController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		String view = "main.mmy";
		
		String name = req.getParameter("name");
		String pw = req.getParameter("pw");
		String tel = req.getParameter("tel");
		String mailid = req.getParameter("mail");
		String domain = req.getParameter("domain");
		String issues = req.getParameter("issue");
		String mail = mailid + "@" + domain;
//		System.out.println("악성 : " + issue + "비밀번호 : " + pw + "tel" + tel + "mail" + mail);
		
		MemberInfoVO mvo = new MemberInfoVO();
		mvo.setMname(name);
		mvo.setPass(pw);
		mvo.setMtel(tel);
		
		return view;
	}

}
