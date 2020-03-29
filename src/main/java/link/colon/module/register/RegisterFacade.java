package link.colon.module.register;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class RegisterFacade {

    private final RegisterCRUD crud;

    @Transactional
    public String save(final String citizenId
            , final String name
            , final String surName
            , final String dob
            , final String laserCode) {

        val id = UUID.randomUUID().toString();
        val s = crud.save(new RegisterEntity(id
                , citizenId
                , name
                , surName
                , dob
                , laserCode
                , 0L
                , ""
                , ""
                , ""
                , 0
                , ""
                , ""
                , true));

        return s.id;
    }

    @Transactional
    public String save(final RegisterForm form) {
        val id = UUID.randomUUID().toString();
        crud.save(new RegisterEntity(id
                , form.citizenId
                , form.name
                , form.surName
                , form.dob
                , form.laserCode
                , form.income
                , form.email
                , form.mobileNo
                , form.lineId
                , form.receiveFrom
                , form.contactAddress()
                , form.docAddress()
                , true));

        return id;
    }

}
