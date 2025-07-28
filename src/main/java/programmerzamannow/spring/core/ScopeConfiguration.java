package programmerzamannow.spring.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import programmerzamannow.spring.core.data.Bar;
import programmerzamannow.spring.core.data.Foo;
import programmerzamannow.spring.core.scope.DoubletonScope;

@Configuration
@Slf4j
public class ScopeConfiguration {

    @Bean
    @Scope("prototype")
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }

}
