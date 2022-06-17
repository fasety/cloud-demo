package com.cl.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.user.entity.User;
import com.cl.user.mapper.UserMapper;
import com.cl.user.service.UserService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import javax.annotation.Resource;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-06-16 10:55:25
 */
@Service("userService")
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
