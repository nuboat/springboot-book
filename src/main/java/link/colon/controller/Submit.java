package link.colon.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
class Submit {

    @PostMapping(value = "/submit")
    private String post(@CookieValue("session_id") final String sessionId
            , @RequestHeader("x-req-uuid") final String reqId
            , @RequestParam("username") final String username
            , @RequestParam("password") final String password) {

        log.info("sessionId {}, reqId {}, username {}, password {}", sessionId, reqId, username, password);
        return "OK";
    }

}
