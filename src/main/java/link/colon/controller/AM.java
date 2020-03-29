package link.colon.controller;

import link.colon.authorize.AccessCRUD;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
class AM {

    private final AccessCRUD crud;

    @GetMapping(value = "/verify/{token}")
    private String verify(@PathVariable("token") final String token) throws Exception {
        log.info("Authoen by {}", token);

        Thread.sleep(300);
        return crud.findByToken(token).map(a -> a.accessName)
                .orElse(null);
    }

}
