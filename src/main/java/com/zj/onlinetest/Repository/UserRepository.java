package com.zj.onlinetest.Repository;

import com.zj.onlinetest.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: zj
 * @Date: 2019/4/17 10:08
 * @Description:
 */

public interface UserRepository extends JpaRepository<User,String>{

    User findOneByUsername(String username);

    User findOneById(String id);

    Page<User> findAll(Pageable pageable);

    List<User> findAllByOrderByCreateTimeDesc();
}
