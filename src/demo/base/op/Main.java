package demo.base.op;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import demo.base.op.pojo.Range;

public class Main {
	public static void main(String [] args) throws IOException
	{
//		DeleteOp delete =new DeleteOp();
//		delete.delete();
		
//		InsertOp insert = new InsertOp();
//		insert.insert();
		
//		QueryOp query =new QueryOp();
//		query.query();
		
//		UpdateOp update =new UpdateOp();
//		update.update();
		
//		int count =0;
//		while(true)
//		{
//			BaseTBDao dao =new BaseTBDao();
//			dao.getBaseTB();
//			System.out.println(".........."+(count++));
//		}
		
		BaseTBDao dao =new BaseTBDao();
		dao.getColumns();
	}

}
