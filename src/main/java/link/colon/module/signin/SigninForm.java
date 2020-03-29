package link.colon.module.signin;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

@Data
public class SigninForm {

    @JsonCreator
    public SigninForm(final String username
            , final String password) {
        this.username = username;
        this.password = password;
    }

    public final String username;
    public final String password;

}
