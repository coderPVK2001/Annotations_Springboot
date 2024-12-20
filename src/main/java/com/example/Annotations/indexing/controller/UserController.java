package com.example.Annotations.indexing.controller;

import com.example.Annotations.indexing.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/indexing")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/getuser")
    public ResponseEntity<?> get(@RequestParam String username){

        userService.testByUserName(username);

        return new ResponseEntity<>("hogaya!!", HttpStatus.OK);
    }
}
