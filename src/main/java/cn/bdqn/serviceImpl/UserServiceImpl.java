package cn.bdqn.serviceImpl;

import cn.bdqn.dao.UserResposity;
import cn.bdqn.pojo.Oauser;
import cn.bdqn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserResposity userResposity;

    @Override
    public List<Oauser> selAll() {
        return userResposity.findAll();
    }
}
