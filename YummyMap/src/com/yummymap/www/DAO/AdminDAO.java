package com.yummymap.www.DAO;

import java.sql.*;
import java.util.*;
import com.yummymap.www.DB.*;
import com.yummymap.www.SQL.*;
import com.yummymap.www.vo.admin.*;


public class AdminDAO {
	WebDBCP db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	AdminSQL asql;
	
	public AdminDAO() {
		db = new WebDBCP();
		asql = new AdminSQL();
	}
	
	//관리자 계정 조회 전담 함수
	public int selAdmin(String id , String pw) {
		int cnt = 0;
		
		con = db.getConnection();
		
		String sql = asql.getSQL(asql.SEL_AD);
		
		pstmt = db.getPreparedStatement(con, sql);
		
		try {
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt("cnt");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		
		return cnt;
	}
	
	//사용중인 유저 검색 전담 함수 
	public ArrayList<MemberInfoVO> allMember(){
		ArrayList<MemberInfoVO> list = new ArrayList<MemberInfoVO>();
		
		con = db.getConnection();
		
		String sql = asql.getSQL(asql.SEL_ALL_USER);
		
		stmt = db.getStatement(con);
		
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				MemberInfoVO mvo = new MemberInfoVO();
				mvo.setMno(rs.getInt("mno"));
				mvo.setMname(rs.getString("mname"));
				mvo.setMid(rs.getString("mid"));
				mvo.setMtel(rs.getString("mtel"));
				mvo.setMemail(rs.getString("memail"));
				list.add(mvo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		
		return list;
	}
	
	//회원 카운트 전담 함수 
	public int userCnt() {
		int cnt = 0;
		con = db.getConnection();
		String sql = asql.getSQL(asql.USER_CNT);
		stmt = db.getStatement(con);
		
		try {
			rs = stmt.executeQuery(sql);
			rs.next();
			cnt = rs.getInt("cnt");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return cnt;
	}
	
	//유저 ID 검색 카운트 전담 함수
	public int userIdCnt(String id) {
		int cnt = 0;
		con = db.getConnection();
		String sql = asql.getSQL(asql.USER_ID_CNT);
		pstmt = db.getPreparedStatement(con, sql);
		
		try {
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt("cnt");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return cnt;
	}
	
	//유저 NAME 검색 카운트 전담 함수
	public int userNameCnt(String name) {
		int cnt = 0;
		con = db.getConnection();
		String sql = asql.getSQL(asql.USER_NAME_CNT);
		pstmt = db.getPreparedStatement(con, sql);
		
		try {
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt("cnt");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return cnt;
	}
	
	//페이징한 유저 목록 전담 함수 
	public  ArrayList<MemberInfoVO> pageUser(int start , int end){
		ArrayList<MemberInfoVO> list = new ArrayList<MemberInfoVO>();
		con = db.getConnection();
		String sql = asql.getSQL(asql.SEL_USER);
		pstmt = db.getPreparedStatement(con, sql);
		try {
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberInfoVO mvo = new MemberInfoVO();
				mvo.setMno(rs.getInt("mno"));
				mvo.setMname(rs.getString("mname"));
				mvo.setMid(rs.getString("mid"));
				mvo.setMtel(rs.getString("mtel"));
				mvo.setMemail(rs.getString("memail"));
				list.add(mvo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}	
		return list;
	}
	//아이디 검색 유저 목록 전담 함수 
	public  ArrayList<MemberInfoVO> idUser(int start , int end , String id){
		ArrayList<MemberInfoVO> list = new ArrayList<MemberInfoVO>();
		con = db.getConnection();
		String sql = asql.getSQL(asql.SEL_ID_USER);
		pstmt = db.getPreparedStatement(con, sql);
		try {
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			pstmt.setString(3, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberInfoVO mvo = new MemberInfoVO();
				mvo.setMno(rs.getInt("mno"));
				mvo.setMname(rs.getString("mname"));
				mvo.setMid(rs.getString("mid"));
				mvo.setMtel(rs.getString("mtel"));
				mvo.setMemail(rs.getString("memail"));
				list.add(mvo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}	
		return list;
	}
	//이름 검색 유저 목록 전담 함수 
	public  ArrayList<MemberInfoVO> nameUser(int start , int end , String name){
		ArrayList<MemberInfoVO> list = new ArrayList<MemberInfoVO>();
		con = db.getConnection();
		String sql = asql.getSQL(asql.SEL_NAME_USER);
		pstmt = db.getPreparedStatement(con, sql);
		try {
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			pstmt.setString(3, name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberInfoVO mvo = new MemberInfoVO();
				mvo.setMno(rs.getInt("mno"));
				mvo.setMname(rs.getString("mname"));
				mvo.setMid(rs.getString("mid"));
				mvo.setMtel(rs.getString("mtel"));
				mvo.setMemail(rs.getString("memail"));
				list.add(mvo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}	
		return list;
	}
	
	//유저 수정 페이지 전담 함수 
	public MemberInfoVO reUser(int mno) {
		MemberInfoVO mvo = new MemberInfoVO();
		con = db.getConnection();
		
		String sql = asql.getSQL(asql.USER_INFO);
		
		pstmt = db.getPreparedStatement(con, sql);
		
		try {
			pstmt.setInt(1, mno);
			rs = pstmt.executeQuery();
			rs.next();
			mvo.setMid(rs.getString("mid"));
			mvo.setMname(rs.getString("mname"));
			mvo.setMtel(rs.getString("mtel"));
			String mail = rs.getString("memail");
			String idMail = mail.substring(0,mail.indexOf("@"));
			String domin = mail.substring(mail.indexOf("@")+1);
			mvo.setMemail(idMail);
			mvo.setMdomain(domin);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return mvo;
	}
	
}
