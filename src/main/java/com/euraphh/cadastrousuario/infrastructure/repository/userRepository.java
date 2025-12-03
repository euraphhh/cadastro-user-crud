package com.euraphh.cadastrousuario.infrastructure.repository;

import com.euraphh.cadastrousuario.infrastructure.entitys.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user,Integer> {

    Optional<User> findByEmail(String email);

}
