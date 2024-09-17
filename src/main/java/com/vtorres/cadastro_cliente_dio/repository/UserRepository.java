package com.vtorres.cadastro_cliente_dio.repository;

import com.vtorres.cadastro_cliente_dio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
