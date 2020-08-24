package online.luffyk.springboot24restfulcrud.dao;

import online.luffyk.springboot24restfulcrud.domain.User;

import java.util.List;

public interface UserMapper {
    /**
     *
     * @return 获取所有用户的信息
     */
    List<User> showAllUser();
}
