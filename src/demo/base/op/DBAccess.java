package demo.base.op;

import java.io.IOException;
import java.io.Reader;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBAccess {
	
	public SqlSessionFactory ssf = null;
	
	public void getSqlFactory() throws IOException
    {
        //1、通过配置文件获取数据库连接相关信息
        Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
        //2、通过配置信息构建SqlSessionFactory
        ssf=new SqlSessionFactoryBuilder().build(reader);
    }
	
	public SqlSession getSqlSession() throws IOException
	{
		if(ssf ==null)
		{
			getSqlFactory();
		}
		return ssf.openSession();
	};
}
