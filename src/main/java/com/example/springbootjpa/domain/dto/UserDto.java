package com.example.springbootjpa.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String password;

    public UserDto(Long id, String username) {
        this.id = id;
        this.username = username;
    }
}
