package demo.base.op;

import java.io.IOException;
import java.io.Reader;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBAccess {
	
	public SqlSession getSqlSession() throws IOException
    {
        //1、通过配置文件获取数据库连接相关信息
        Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
        //2、通过配置信息构建SqlSessionFactory
        SqlSessionFactory SSF=new SqlSessionFactoryBuilder().build(reader);
        //3、通过SqlSessionFactory打开数据库会话
        SqlSession sqlSession=SSF.openSession();
        return sqlSession;
    }
}
