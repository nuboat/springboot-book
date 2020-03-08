package link.colon.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HelloWorld {

    private final HelloLocale h;

    public String sayHi() {
        return h.eng();
    }

}
