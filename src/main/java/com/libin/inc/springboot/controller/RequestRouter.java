package com.libin.inc.springboot.controller;

import com.libin.inc.springboot.dao.UserRepository;
import com.libin.inc.springboot.model.Address;
import com.libin.inc.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Libin on 7/17/2017.
 */
@RestController
public class RequestRouter {

    @Autowired
    UserRepository dao;

    @PostMapping(value = "user")
    public void load(@RequestBody User user ){
        System.out.println("called load "+user);
        dao.save(user);
    }

    @GetMapping(value = "users")
    public List<User> findAll(){
        /*System.out.println("called findall");
        User user = new User();
        Address add1 = new Address();
        add1.setCity("anc");
        add1.setState("TX");
        Address add2 = new Address();
        add2.setCity("buffalo");
        add2.setState("NY");*/

       return dao.findAll();
    }

    @GetMapping(value = "user/{name}")
    public User getByname(@PathVariable(value = "name") String name){
        return dao.findByName(name);

    }


}
