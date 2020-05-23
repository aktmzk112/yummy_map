package com.yummymap.www.SQL;

public class JoinSQL {
	public final int CHECK_LOGIN = 1001;
	public final int ADD_MEMB = 1002;
	
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case CHECK_LOGIN:
			buff.append("SELECT ");
			buff.append("	COUNT(*) cnt ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	mid = ? ");
			buff.append("	AND mpw = ? ");
		break;
		case ADD_MEMB:
			buff.append("INSERT INTO ");
			buff.append("	member(mno, mname, mid, mpw, mtel, memail, birth, gen) ");
			buff.append("VALUES( " );
			buff.append("	getmno.nextval, ");
			buff.append("	?,?,?,?,?,TO_DATE(?, 'YY/MM/DD'),?");
			buff.append(")");
			break;
		}
		return buff.toString();
	}
}
