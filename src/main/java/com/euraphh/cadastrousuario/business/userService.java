package com.euraphh.cadastrousuario.business;

import com.euraphh.cadastrousuario.infrastructure.repository.userRepository;
import org.springframework.stereotype.Service;

@Service
public class userService {

    private final userRepository repository;

    public userService(userRepository repository) {
        this.repository = repository;
    }

    public void save(User user) {
        repository.save(user);
    }

    public ser findByEmail(String email) {
        return.findByEmail(email).orElseThrow(
                () ->
        );
    }
}
