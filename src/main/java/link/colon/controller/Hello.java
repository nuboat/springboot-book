package link.colon.controller;

import link.colon.component.HelloWorld;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
class Hello {

    private final HelloWorld c;

    @GetMapping(value = "/hi")
    private String hi() {
        return "Yo !";
    }

    @GetMapping(value = "/helloWorld")
    private String helloWorld() {
        return c.sayHi();
    }

    @GetMapping(value = "/echo/{msg}")
    private String echo(@PathVariable("msg") final String msg) {
        return msg;
    }

}
