package programmerzamannow.spring.core;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerzamannow.spring.core.configuration.BarConfiguration;
import programmerzamannow.spring.core.configuration.FooConfiguration;

@Configuration
@ComponentScan(basePackages = {
        "programmerzamannow.spring.core.configuration"
})
@Slf4j
public class ScanConfiguration {

    @PostConstruct
    public void start() {
        log.info("Start Server");
    }

    @PreDestroy
    public void stop() {
        log.info("Stop Server");
    }
}
