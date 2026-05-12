package io.github.Sipriano_Dev.sbootexp_security.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @GetMapping("/public")
    public ResponseEntity<String> publicRout() {
        return ResponseEntity.ok("public route ok");
    }

    @GetMapping("/private")
    public ResponseEntity<String> privateRout() {
        return ResponseEntity.ok("private route ok");
    }

}
