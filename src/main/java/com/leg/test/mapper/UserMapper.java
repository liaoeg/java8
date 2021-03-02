package com.leg.test.mapper;

import com.leg.test.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 廖恩光
 * @since 2021-01-22
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    List<User> query();
}
