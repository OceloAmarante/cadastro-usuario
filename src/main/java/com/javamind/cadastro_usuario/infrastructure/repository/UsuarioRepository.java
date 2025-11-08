package com.javamind.cadastro_usuario.infrastructure.repository;

import com.javamind.cadastro_usuario.infrastructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);

    //usando @Transactional pois caso ocorra algum erro o email não pode ser deletado
    @Transactional
    void deleteByEmail(String email);

}
