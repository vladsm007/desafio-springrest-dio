package com.vtorres.cadastro_cliente_dio.services;

import com.vtorres.cadastro_cliente_dio.model.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserService {

    User findById(Long id);
    User create(User user);
    void delete(Long id);
}
