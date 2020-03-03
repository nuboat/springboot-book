package generated.protobuf.form;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.jupiter.api.Test;

@Slf4j
class FormTest {

    @Test
    void testBuild() throws Exception {
        val form = Form.SigninForm.newBuilder()
                .setUsername("peerapat a")
                .setPassword("P@ssw0rd")
                .build();

        log.info("Message size {}", form.toByteString().size());

        val bean = Form.SigninForm.parseFrom(form.toByteArray());
        log.info("B {}", bean);
    }

}