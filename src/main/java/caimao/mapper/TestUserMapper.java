package caimao.mapper;


import caimao.domain.TestUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    TestUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);

    List<TestUser> queryUserList();
}