package link.colon.controller;

import link.colon.JSResponse;
import link.colon.module.register.RegisterFacade;
import link.colon.module.register.RegisterForm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
class RaoMaiTingGun {

    private final RegisterFacade facade;

    @GetMapping(value ="/register/light/{citizenId}/{name}/{surName}/{dob}/{laserCode}")
    private JSResponse<String> postParamsLight(@PathVariable("citizenId") final String citizenId
            , @PathVariable("name") final String name
            , @PathVariable("surName") final String surName
            , @PathVariable("dob") final String dob
            , @PathVariable("laserCode") final String laserCode) {

        val r = facade.save(citizenId, name, surName, dob, laserCode);
        return new JSResponse<>("0", "success", r);
    }

    @PostMapping(value = "/register", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    private JSResponse<String> postParams(final RegisterForm form) {

        val r = facade.save(form);
        return new JSResponse<>("0", "success", r);
    }

    @PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    private JSResponse<String> postJson(@RequestBody final RegisterForm form) {

        val r = facade.save(form);
        return new JSResponse<>("0", "success", r);
    }

}
