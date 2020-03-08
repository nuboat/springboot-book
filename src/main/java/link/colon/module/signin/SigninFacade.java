package link.colon.module.signin;

import org.springframework.stereotype.Component;

@Component
public class SigninFacade {

    public boolean exe(final SigninForm f) {
        return "aa".equals(f.username) && "bb".equals(f.password);
    }
}
