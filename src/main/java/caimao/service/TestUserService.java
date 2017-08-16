package caimao.service;


import caimao.domain.TestUser;

import java.util.List;

/**
 * Created by yuehao on 2017/8/16.
 */
public interface TestUserService {

    TestUser queryUserById(Integer id) throws Exception;


    void saveTestUser(String name, Integer age) throws Exception;


    List<TestUser> queryUserList() throws Exception;
}
