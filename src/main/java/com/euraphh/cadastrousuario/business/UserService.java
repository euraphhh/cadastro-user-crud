package com.euraphh.cadastrousuario.business;

import com.euraphh.cadastrousuario.infrastructure.entitys.User;
import com.euraphh.cadastrousuario.infrastructure.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.save(user);
    }

    public User findByEmail(String email) {
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado.")
        );
    }

    @Transactional
    public void deleteByEmail(String email) {
        repository.deleteByEmail(email);
    }

    public void updateByEmail(User user, String email) {
        User userEntity = findByEmail(email);
        User updatedUser = User.builder()
                .id(userEntity.getId())
                .email(user.getEmail() != null ? user.getEmail() : userEntity.getEmail())
                .nome(user.getNome() != null ? user.getNome() : userEntity.getNome())
                .build();
        repository.saveAndFlush(updatedUser);
    }
}
