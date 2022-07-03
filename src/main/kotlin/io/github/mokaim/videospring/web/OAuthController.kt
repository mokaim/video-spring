package io.github.mokaim.videospring.web

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/oauth")
class OAuthController {

    @GetMapping("/redirect")
    fun redirectUri() : ResponseEntity<String> {
        return ResponseEntity.ok("Success");
    }
}