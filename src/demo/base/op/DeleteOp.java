package demo.base.op;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

public class DeleteOp extends Op {

	
	public void delete() throws IOException
	{
		SqlSession session = getSession();
		String sql = "DELETE FROM `range` WHERE id =10";
		session.delete("base.delete",sql);//删除数据
		session.commit();//提交操作
		session.close();
	}
}
