package io.github.jvmaiaa.sbootexpsecurity.api.dto;

import io.github.jvmaiaa.sbootexpsecurity.api.UsuarioController;
import io.github.jvmaiaa.sbootexpsecurity.domain.entity.Usuario;
import lombok.Data;

import java.util.List;

@Data
public class CadastroUsuarioDTO {

    private Usuario usuario;
    private List<String> permissoes;
}
