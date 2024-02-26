package io.github.jvmaiaa.sbootexpsecurity.domain.repository;

import io.github.jvmaiaa.sbootexpsecurity.domain.entity.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GrupoRepository extends JpaRepository<Grupo, String> {
    Optional<Grupo> findByNome(String nome);
}
