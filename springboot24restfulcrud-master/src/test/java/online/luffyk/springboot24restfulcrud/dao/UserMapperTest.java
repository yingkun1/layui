package online.luffyk.springboot24restfulcrud.dao;

import online.luffyk.springboot24restfulcrud.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testShowAllUser(){
        System.out.println(userMapper);
        List<User> users = userMapper.showAllUser();
        for(User user:users){
            System.out.println(user);
        }
    }
}
