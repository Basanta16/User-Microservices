package com.basanta.userservice.services.impl;

import com.basanta.userservice.entity.Ratings;
import com.basanta.userservice.entity.User;
import com.basanta.userservice.exceptions.ResourceNotFoundException;
import com.basanta.userservice.repo.UserRepo;
import com.basanta.userservice.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Autowired
    private RestTemplate restTemplate;

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);


    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User getUser(Long Id) {


        User getUser = userRepo.findById(Id).orElseThrow(()-> new ResourceNotFoundException("User with given id not found in server!!"+ Id));

//        http://localhost:8084/ratings/user/1

       ArrayList<Ratings> arrayList = restTemplate.getForObject("http://localhost:8084/ratings/user/"+getUser.getId(), ArrayList.class);
       logger.info("{}",arrayList);

       getUser.setRatings(arrayList);
        return getUser;
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }
}
