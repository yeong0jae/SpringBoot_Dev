package com.example.springboot_dev.User.Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequestDTO {

    private String userName;

    private String password;

    private String email;

    private LocalDateTime createdAt;

}
