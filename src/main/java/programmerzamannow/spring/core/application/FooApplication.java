package programmerzamannow.spring.core.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import programmerzamannow.spring.core.data.Foo;

@SpringBootApplication
public class FooApplication {

    public Foo foo() {
        return new Foo();
    }
}
