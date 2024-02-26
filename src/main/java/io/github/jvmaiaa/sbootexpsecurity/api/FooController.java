package io.github.jvmaiaa.sbootexpsecurity.api;

import io.github.jvmaiaa.sbootexpsecurity.domain.entity.Grupo;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FooController {

    @GetMapping("/public")
    public ResponseEntity<String> publicRoute() {
        return ResponseEntity.ok("Public route ok!");
    }

    @GetMapping("/private")
    public ResponseEntity<String> privateRoute(Authentication authentication) {
        return ResponseEntity.ok("Private route ok! \nUsuário logado: " + authentication.getName());
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> adminRoute() {
        return ResponseEntity.ok("Admin route ok!");
    }

}
