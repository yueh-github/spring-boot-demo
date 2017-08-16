package caimao.service;


import caimao.domain.TestUser;

/**
 * Created by yuehao on 2017/8/16.
 */
public interface TestUserService {

    TestUser queryUserById(Integer id) throws Exception;


    void saveTestUser(String name, Integer age) throws Exception;
}
