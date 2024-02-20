package com.pragma.powerup.infrastructure.out.jpa.adapter;

import com.pragma.powerup.domain.model.User;
import com.pragma.powerup.domain.spi.IUserPersistencePort;
import com.pragma.powerup.infrastructure.exception.UserAlreadyExistsException;
import com.pragma.powerup.infrastructure.out.jpa.mapper.UserEntityMapper;
import com.pragma.powerup.infrastructure.out.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {

    private final IUserRepository userRepository;

    private final UserEntityMapper userEntityMapper;

    @Override
    public void saveUser(User user) {

        LocalDate birthDate = user.getBirthDate();
        LocalDate fechaActual = LocalDate.now();
        Period period = Period.between(birthDate, fechaActual);
        int age = period.getYears();

        if (userRepository.findById(user.getId()).isPresent()) {
            throw new UserAlreadyExistsException();
        }
        userRepository.save(userEntityMapper.toUser(user));
    }



}