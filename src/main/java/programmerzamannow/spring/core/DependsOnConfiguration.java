package programmerzamannow.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.*;
import programmerzamannow.spring.core.data.Bar;
import programmerzamannow.spring.core.data.Foo;
import programmerzamannow.spring.core.data.FooBar;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Bean
    @Lazy
    @DependsOn({
            "bar"
    })
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }
}
