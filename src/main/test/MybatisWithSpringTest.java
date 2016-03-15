import com.zhi.dao.impl.UserDaoImpl;
import com.zhi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by HUANGZHIJIANG416 on 2016/3/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springConfig.xml")
public class MybatisWithSpringTest {
    @Resource
    private UserService userService;
    @Resource
    private UserDaoImpl userDaoImpl;

    @Test
    public void setUserServiceTest(){
//        userService.getUser(2);
        userService.getUser(5);
//        System.out.println(userDaoImpl.selectUserById(5));
    }

}
