import com.zhi.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by HUANGZHIJIANG416 on 2016/3/14.
 */
public class MybatisTest {
    private static SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("MybatisConfig.xml");
         sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void dataSourceTest() throws IOException {

    }

    @Test
    public void insetTest(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            User user = new User();
            user.setAge(18);
            user.setUserAddress("shanghai");
            user.setUserName("Tom");
            sqlSession.insert("com.zhi.entity.UserMapper.insertUser",user);
            System.out.println("Insert successful!");
        }finally {
            sqlSession.close();
        }
    }
}
