package com.jhsystems.colosseum.controller;

import com.jhsystems.colosseum.model.User;
import com.jhsystems.colosseum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

/**
 * Created by LeeJangHyeop on 2017. 7. 14..
 */
@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){
        User user1 = new User();
        user1.setId("powerfirebat");
        user1.setAge(29);
        user1.setName("이장협");
        userRepository.save(user1);
    }

    @RequestMapping(path = "/")
    public String layout() {
        return "layout";
    }
}
