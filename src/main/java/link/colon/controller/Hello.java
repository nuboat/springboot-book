package link.colon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Hello {

    @GetMapping(value = "/hi")
    String hi() {
        return "Yo !";
    }

    @GetMapping(value = "/echo/{msg}")
    String echo(@PathVariable("msg") final String msg) {
        return msg;
    }

}
