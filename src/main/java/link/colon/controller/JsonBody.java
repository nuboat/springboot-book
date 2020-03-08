package link.colon.controller;

import link.colon.module.signin.SigninFacade;
import link.colon.module.signin.SigninForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
class JsonBody {

    private final SigninFacade facade;

    @PostMapping(value = "/signin", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    private boolean postParams(final SigninForm form) {

        log.info("form {}", form.toString());
        return facade.exe(form);
    }

    @PostMapping(value = "/signin", consumes = MediaType.APPLICATION_JSON_VALUE)
    private boolean postJosn(@RequestBody final SigninForm form) {

        log.info("form {}", form.toString());
        return facade.exe(form);
    }

}
