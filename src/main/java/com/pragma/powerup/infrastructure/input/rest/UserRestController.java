package com.pragma.powerup.infrastructure.input.rest;

import com.pragma.powerup.application.dto.request.UserRequestDto;
import com.pragma.powerup.application.handler.IUserHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("user")
public class UserRestController {

    private final IUserHandler userHandler;

    @PostMapping("/")
    public ResponseEntity<String> saveUser(@Valid @RequestBody UserRequestDto userRequestDto) {
            userHandler.saveOwner(userRequestDto);
            return ResponseEntity.status(HttpStatus.CREATED).build();


    }
}