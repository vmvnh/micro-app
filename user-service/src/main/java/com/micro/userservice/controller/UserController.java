package com.micro.userservice.controller;

import com.micro.userservice.dto.CreateUserDto;
import com.micro.userservice.dto.ResponseUserDto;
import com.micro.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

  @Autowired
  private final UserService userService;

  @PostMapping("/user")
  public void createUser(CreateUserDto userDto) {
    userService.createUser(userDto);
  }

  @GetMapping("/")
  public List<ResponseUserDto> getAllUsers() {
    return userService.getAllUsers();
  }
}
