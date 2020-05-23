package com.yummymap.www.SQL;

public class AdminSQL {
 public final int SEL_AD = 1001;
 public final int SEL_ALL_USER = 1002;
 public final int SEL_USER = 1003;
 public final int SEL_ID_USER = 1004;
 public final int SEL_NAME_USER = 1005;
 public final int USER_INFO = 1006;
 
 
 
 public final int USER_CNT = 2001;
 public final int USER_ID_CNT = 2002;
 public final int USER_NAME_CNT = 2003;
 public String getSQL(int code) {
	 StringBuffer buff = new StringBuffer();
	 
	 switch(code) {
	 case SEL_AD : 
		 buff.append("SELECT ");
		 buff.append(" count(*) cnt ");
		 buff.append("FROM ");
		 buff.append(" member ");
		 buff.append("WHERE ");
		 buff.append(" grade = 'A' ");
		 buff.append(" AND mid = ? ");
		 buff.append(" AND mpw = ? ");
		 break;
	 case SEL_ALL_USER : 
		 buff.append("SELECT  "); 
		 buff.append("    mno , mname , mid, mtel ,memail "); 
		 buff.append("FROM  "); 
		 buff.append("    member "); 
		 buff.append("WHERE "); 
		 buff.append("    grade = 'M' "); 
		 buff.append("    and isshow = 'Y' ");
		 break;
	 case SEL_USER : 
		 buff.append("select "); 
		 buff.append("    rno , mno , mid , mname, mtel , memail  "); 
		 buff.append("from "); 
		 buff.append(" (SELECT  "); 
		 buff.append("        rownum rno , mno , mid , mname , mtel, memail "); 
		 buff.append("    FROM  "); 
		 buff.append("        member "); 
		 buff.append("    WHERE "); 
		 buff.append("        grade = 'M' "); 
		 buff.append("    and isshow = 'Y' "); 
		 buff.append("  )  "); 
		 buff.append("WHERE "); 
		 buff.append("    rno BETWEEN ? and ? ");
		 break;
	 case SEL_ID_USER : 
		 buff.append("select "); 
		 buff.append("    rno , mno , mid , mname, mtel , memail  "); 
		 buff.append("from "); 
		 buff.append(" (SELECT  "); 
		 buff.append("        rownum rno , mno , mid , mname , mtel, memail "); 
		 buff.append("    FROM  "); 
		 buff.append("        member "); 
		 buff.append("    WHERE "); 
		 buff.append("        grade = 'M' "); 
		 buff.append("    and isshow = 'Y' "); 
		 buff.append("  )  "); 
		 buff.append("WHERE "); 
		 buff.append("    rno BETWEEN ? and ? ");
		 buff.append("    and mid = ?  ");
		 break;
	 case SEL_NAME_USER : 
		 buff.append("select "); 
		 buff.append("    rno , mno , mid , mname, mtel , memail  "); 
		 buff.append("from "); 
		 buff.append(" (SELECT  "); 
		 buff.append("        rownum rno , mno , mid , mname , mtel, memail "); 
		 buff.append("    FROM  "); 
		 buff.append("        member "); 
		 buff.append("    WHERE "); 
		 buff.append("        grade = 'M' "); 
		 buff.append("    and isshow = 'Y' "); 
		 buff.append("  )  "); 
		 buff.append("WHERE "); 
		 buff.append("    rno BETWEEN ? and ? ");
		 buff.append("    and mname = ? ");
		 break;
	 case USER_CNT: 
		 buff.append("SELECT  "); 
		 buff.append("   COUNT(*) cnt "); 
		 buff.append("FROM  "); 
		 buff.append("    member "); 
		 buff.append("WHERE "); 
		 buff.append("    grade = 'M' "); 
		 buff.append("    and isshow = 'Y' ");
		 break;
	 case USER_ID_CNT: 
		 buff.append("SELECT  "); 
		 buff.append("   COUNT(*) cnt "); 
		 buff.append("FROM  "); 
		 buff.append("    member "); 
		 buff.append("WHERE "); 
		 buff.append("    grade = 'M' "); 
		 buff.append("    and isshow = 'Y' ");
		 buff.append("    and mid = ? ");
		 break;
	 case USER_NAME_CNT: 
		 buff.append("SELECT  "); 
		 buff.append("   COUNT(*) cnt "); 
		 buff.append("FROM  "); 
		 buff.append("    member "); 
		 buff.append("WHERE "); 
		 buff.append("    grade = 'M' "); 
		 buff.append("    and isshow = 'Y' ");
		 buff.append("    and mname = ? ");
		 break;
	 case USER_INFO : 
		 buff.append("SELECT  "); 
		 buff.append("    mno , mname , mid, mtel ,memail "); 
		 buff.append("FROM  "); 
		 buff.append("    member "); 
		 buff.append("WHERE "); 
		 buff.append("    grade = 'M' "); 
		 buff.append("    and isshow = 'Y' ");
		 buff.append("    and mno = ? ");
		 break;	 
	 
	 }
	 return buff.toString();
	 
 }
}
