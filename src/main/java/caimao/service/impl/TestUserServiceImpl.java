package caimao.service.impl;

import caimao.domain.TestUser;
import caimao.mapper.TestUserMapper;
import caimao.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yuehao on 2017/8/16.
 */
@Service
public class TestUserServiceImpl implements TestUserService {


    @Autowired
    private TestUserMapper testUserMapper;

    public TestUser queryUserById(Integer id) throws Exception {
        return this.testUserMapper.selectByPrimaryKey(id);
    }

    public void saveTestUser(String name, Integer age) throws Exception {
        TestUser testUser = new TestUser();
        testUser.setName(name);
        testUser.setAge(age);
        this.testUserMapper.insert(testUser);
    }
}
