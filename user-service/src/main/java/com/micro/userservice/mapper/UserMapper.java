package com.micro.userservice.mapper;

import com.micro.userservice.dto.CreateUserDto;
import com.micro.userservice.dto.ResponseUserDto;
import com.micro.userservice.entities.User;
import org.mapstruct.Mapper;

@Mapper()
public interface UserMapper {

//  @Mapping(target = "id", ignore = true)
  User toEntity(CreateUserDto createUserDto);
  ResponseUserDto toDto(User user);
}
