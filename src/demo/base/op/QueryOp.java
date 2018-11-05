package demo.base.op;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import demo.base.op.mapper.Range;

public class QueryOp  extends Op {
	public void query() throws IOException
	{
		SqlSession session = getSession();
		List<Range> list = session.selectList("base.query");
		System.out.println(list.size());
		session.close();
	}
}
