package cn.bdqn;

import cn.bdqn.pojo.Oauser;
import cn.bdqn.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OasysApplicationTests {

    @Test
    public void contextLoads() {
        UserServiceImpl biz = new UserServiceImpl();
        List<Oauser> list =biz.selAll();
        for (Oauser oauser:list) {
            System.out.println(oauser.getUsername());
        }
    }

}
