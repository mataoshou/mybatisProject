package demo.base.op;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

public class UpdateOp extends Op{
	public void update() throws IOException
	{
		String sql = " UPDATE `range` set ids ='1,2,3'";
		
		SqlSession session = getSession();
		session.update("base.update",sql);
		session.commit();
		session.close();
	}
}
