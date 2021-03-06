package com.yummymap.www.controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yummymap.www.DAO.AdminDAO;
import com.yummymap.www.controller.MmyController;
import com.yummymap.www.vo.admin.MemberInfoVO;

public class RememberProc implements MmyController {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		
		String smno = req.getParameter("mno");
		String nowpage = req.getParameter("nowPage");
		String name = req.getParameter("name");
		String pw = req.getParameter("pw");
		String tel = req.getParameter("tel");
		String mailid = req.getParameter("mail");
		String domain = req.getParameter("domain");
		String issues = req.getParameter("issue");
		String mail = mailid + "@" + domain;
		String issue="N";
		String isshow="Y";
		
		
		try {
			if(issues.equals("ok")){
				isshow="N";
				issue = "X";
			}
		} catch (Exception e) {	}
		
		int mno = 0;
		try {
			mno = Integer.parseInt(smno);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	 if(pw.length() != 0) {
		MemberInfoVO mvo = new MemberInfoVO();
		mvo.setMno(mno);
		mvo.setMname(name);
		mvo.setPass(pw);
		mvo.setMtel(tel);
		mvo.setMemail(mail);
		mvo.setIssue(issue);
		mvo.setIsshow(isshow);
		
		AdminDAO adao = new AdminDAO();
		int cnt = adao.reMember(mvo);
		if(cnt ==1 ) {
			System.out.println("정상 수정 완료");
		}
	 }else {
			MemberInfoVO mvo = new MemberInfoVO();
			mvo.setMno(mno);
			mvo.setMname(name);
			mvo.setMtel(tel);
			mvo.setMemail(mail);
			mvo.setIssue(issue);
			mvo.setIsshow(isshow);
			
			AdminDAO adao = new AdminDAO();
			int cnt = adao.reMemberNopass(mvo);
			if(cnt ==1 ) {
				System.out.println("정상 수정 완료");
			}
		 }
	 
		try {
			resp.sendRedirect("/YummyMap/admin/main.mmy?nowpage=" + nowpage);
		} catch (Exception e) {}
		String view = null;	
		return view;
	}

}
