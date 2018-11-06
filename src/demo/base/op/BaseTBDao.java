package demo.base.op;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import demo.base.op.dao.BaseTbMapper;
import demo.base.op.pojo.BaseTB;

public class BaseTBDao {
	
	BaseTbMapper mapper = null;
	
	{
//		try {
//			SqlSession session = Op.single();
//			mapper = session.getMapper(BaseTbMapper.class);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	public void getBaseTB() throws IOException
	{
		SqlSession session = Op.single();
		mapper = session.getMapper(BaseTbMapper.class);
        //调用查询方法
		BaseTB tb =mapper.getBaseTB(1);
		System.out.println(tb.getbName());
		session.close();
		
	}
}
