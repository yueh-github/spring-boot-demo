package caimao.mapper;


import caimao.domain.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by yuehao on 2017/8/16.
 */
@Mapper
public interface UserDao {
    UserEntity getOne(Long id);
}
