package com.micro.userservice.service;

import com.micro.userservice.dto.CreateUserDto;
import com.micro.userservice.dto.ResponseUserDto;
import com.micro.userservice.mapper.UserMapper;
import com.micro.userservice.mapper.UserMapperImpl;
import com.micro.userservice.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  private final UserMapper userMapper = new UserMapperImpl();

  public void createUser(CreateUserDto userDto) {
    userRepository.save(userMapper.toEntity(userDto));
  }

  public List<ResponseUserDto> getAllUsers() {
    return userRepository.findAll().stream().map(userMapper::toDto).toList();
  }
}
