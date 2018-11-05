package demo.base.op;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class InsertOp  extends Op {
	public void insert() throws IOException
	{
		String sql = "INSERT INTO `range` (id,RangeName,`type`) VALUES(22,'123',4) ";
		
		SqlSession session = getSession();
		Map map =new HashMap();
		map.put("RangeName", "123");
		map.put("type", 5);
		session.insert("base.insert",map);
		session.commit();
		session.close();
	}
}
