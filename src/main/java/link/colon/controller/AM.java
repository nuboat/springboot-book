package link.colon.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
class AM {

    @GetMapping(value = "/verify/{token}")
    private String verify(@PathVariable("token") final String token) {
        log.info("Authoen by {}", token);
        return "123".equals(token) ? "pass" : "unauthorized";
    }

}
