package com.micro.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseUserDto {
    private UUID id;
    private String username;
    private String lastname;
    private Date birthday;
    private String passport;
}
