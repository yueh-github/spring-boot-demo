package caimao.web;

import caimao.domain.TestUser;
import caimao.service.TestUserService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yuehao on 2017/8/16.
 */
@Slf4j
@RestController
public class TestController {

    @Autowired
    private TestUserService testUserService;

    @Value("${realName}")
    private String realName;

    @RequestMapping("/index")
    public String getTestIndex() throws Exception {
        log.info("开始查询用户列表数据~~~~~");
        log.info("真实姓名：" + realName);
        List<TestUser> testUser = this.testUserService.queryUserList();
        return JSON.toJSONString(testUser);
    }

    @RequestMapping("/save")
    public String saveTestUser(@RequestParam(required = false) String name, @RequestParam(required = false) Integer age) throws Exception {
        this.testUserService.saveTestUser(name, age);
        return "true";
    }

    @RequestMapping("detail")
    public String getDetailById(@RequestParam(required = false) Integer id) throws Exception {
        log.info("开始查询单个用户~~~~~");
        TestUser testUser = this.testUserService.queryUserById(id);
        return JSON.toJSONString(testUser);
    }
}
