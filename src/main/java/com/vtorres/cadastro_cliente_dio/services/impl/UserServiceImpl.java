package com.vtorres.cadastro_cliente_dio.services.impl;

import com.vtorres.cadastro_cliente_dio.model.User;
import com.vtorres.cadastro_cliente_dio.repository.UserRepository;
import com.vtorres.cadastro_cliente_dio.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);

    }
}
