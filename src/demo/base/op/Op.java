package demo.base.op;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

public class Op {
	
	public SqlSession getSession() throws IOException
	{
		DBAccess access =new DBAccess();
		
		return access.getSqlSession();
	}
}
