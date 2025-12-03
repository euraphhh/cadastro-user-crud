package com.euraphh.cadastrousuario.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

// Classe para criação de entidade usuário. Inclui ID, email e nome.

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
@Entity
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;

}
