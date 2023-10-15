package com.basanta.userservice.controllers;


import com.basanta.userservice.entity.User;
import com.basanta.userservice.response.GlobalResponseApi;
import com.basanta.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;


    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<GlobalResponseApi> createUser(@Validated @RequestBody User user, BindingResult bindingResult) {


        User saveUser = userService.saveUser(user);
        return ResponseEntity.ok(successResponse(customMessageHandler.get("crud.create"), saveUser));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
       List<User> getAllUser = userService.getAllUser();
        return ResponseEntity.ok(getAllUser);
    }


    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable Long userId) {
        User getUser = userService.getUser(userId);
        return ResponseEntity.ok(getUser);
    }



}
