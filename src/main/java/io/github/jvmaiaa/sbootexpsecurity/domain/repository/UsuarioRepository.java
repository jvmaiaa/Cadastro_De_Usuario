package io.github.jvmaiaa.sbootexpsecurity.domain.repository;

import io.github.jvmaiaa.sbootexpsecurity.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
