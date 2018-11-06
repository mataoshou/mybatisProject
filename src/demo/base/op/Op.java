package demo.base.op;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

public class Op {
	
	public static Op one = null;
	
	DBAccess access =new DBAccess();
	public static SqlSession single() throws IOException
	{
		if(one==null)
		{
			one =new Op();
		}
		
		return one.getSession();
	}
	
	SqlSession getSession() throws IOException
	{
		
		return access.getSqlSession();
	}
}
