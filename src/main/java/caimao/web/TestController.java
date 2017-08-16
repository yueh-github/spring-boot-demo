package caimao.web;

import caimao.domain.TestUser;
import caimao.service.TestUserService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuehao on 2017/8/16.
 */
@RestController
public class TestController {

    @Autowired
    private TestUserService testUserService;

    @RequestMapping("/index")
    public String getTestIndex(@RequestParam(required = false) Integer id) throws Exception {
        TestUser testUser = this.testUserService.queryUserById(id);
        return JSON.toJSONString(testUser);
    }

    @RequestMapping("/save")
    public String saveTestUser(@RequestParam(required = false) String name, @RequestParam(required = false) Integer age) throws Exception {
        this.testUserService.saveTestUser(name, age);
        return "true";
    }
}
