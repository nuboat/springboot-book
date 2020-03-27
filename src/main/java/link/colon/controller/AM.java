package link.colon.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
class AM {

    private final Map<String, String> store;

    AM() {
        store = Map.of("123", "นบ.", "124", "บน.");
    }

    @GetMapping(value = "/verify/{token}")
    private String verify(@PathVariable("token") final String token) {
        log.info("Authoen by {}", token);
        return store.getOrDefault("token", null);
    }

}
