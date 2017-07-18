package com.libin.inc.springboot.dao;

import com.libin.inc.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Libin on 7/17/2017.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByName(String name);
}
