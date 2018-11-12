package demo.base.op;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		SqlSession session = Op.openSession();
		mapper = session.getMapper(BaseTbMapper.class);
        //调用查询方法
		BaseTB tb =mapper.getBaseTB(1);
		System.out.println(tb.getTbName());
		session.close();
		
	}
	
	public void getColumns() throws IOException
	{
		SqlSession session = Op.openSession();
		Map map =new HashMap();
		map.put("columns", "id,disName,bName");
		List<BaseTB> list = session.selectList("getColumns",map);
		
		for(BaseTB tb :list)
		{
			System.out.println(tb.getTbId() +"..." +tb.getTbName());
		}
	}
	
	
	public void getBaseTBAll() throws IOException
	{
		SqlSession session = Op.openSession();
		List<BaseTB> list = session.selectList("getBaseTBAll");
		
		for(BaseTB tb :list)
		{
			System.out.println(tb.getTbId() +"..." +tb.getTbName());
			System.out.println(tb.getAttch().size());
		}
		session.close();
	}
	
	
	public void getItem() throws IOException
	{
		SqlSession session = Op.openSession();
		List<BaseTB> list = session.selectList("getTBItem");
		
		for(BaseTB tb :list)
		{
			System.out.println(tb.getTbId() +"..." +tb.getTbName());
			System.out.println(tb.getItem().getTb_i_content());
		}
		session.close();
	}
}
