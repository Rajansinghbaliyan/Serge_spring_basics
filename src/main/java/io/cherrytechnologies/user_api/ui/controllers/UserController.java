package io.cherrytechnologies.user_api.ui.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping("/")
    public ResponseEntity<String> getUser() {
        return ResponseEntity
                .ok("Get User");
    }

    @PostMapping("/")
    public ResponseEntity<String> postUser(@RequestParam String name) {
        return ResponseEntity
                .ok(String.format("Hello, %s", name));
    }
}
