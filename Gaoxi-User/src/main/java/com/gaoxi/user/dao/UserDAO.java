package com.gaoxi.user.dao;

import com.gaoxi.entity.user.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author: Qin
 * @createTime: 2024/1/27 16:31
 */
@Mapper
public interface UserDAO {

    UserEntity queryUserInfo(UserEntity userEntity);
}
