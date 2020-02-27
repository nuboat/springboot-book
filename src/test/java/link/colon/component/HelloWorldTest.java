package link.colon.component;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
class HelloWorldTest {

    @Autowired
    private HelloWorld h;

    @Test
    void testSayHi() {
        assert "Hello World".equals(h.sayHi());
    }
}