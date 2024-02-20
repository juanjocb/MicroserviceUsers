package com.pragma.powerup.application.dto.request;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Setter
@Getter
public class UserRequestDto {

    private Long id;
    private String name;
    private String lastname;
    private String idUser;
    private String number;
    private LocalDate birthDate;
    private String email;
    private String password;
    private String role;
}