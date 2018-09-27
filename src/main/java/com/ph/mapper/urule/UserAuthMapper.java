package com.ph.mapper.urule;

import com.ph.entity.urule.UserAuth;
import com.ph.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserAuthMapper extends BaseMapper<UserAuth> {

    @Select("select * from user_auth")
    List<UserAuth> findAllUserAuth();

    @Select("select * from user_auth where username=#{username}")
    UserAuth findByUsername(String username);

}