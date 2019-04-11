package cn.bdqn.dao;

import cn.bdqn.pojo.Oauser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserResposity extends JpaRepository<Oauser,Long> {
}
