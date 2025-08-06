package programmerzamannow.spring.core.application;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import programmerzamannow.spring.core.data.Foo;
import programmerzamannow.spring.core.listener.AppStartingListener;

import java.util.List;

@SpringBootApplication
public class FooApplication {


    @Bean
    public Foo foo() {
        return new Foo();
    }

//    public static void main(String[] args) {
//        ConfigurableApplicationContext run = SpringApplication.run(FooApplication.class, args);
//
//        Foo foo = run.getBean(Foo.class);
//
//        System.out.println(foo);
//    }

//    public static void main(String[] args) {
//        SpringApplication springApplication = new SpringApplication(FooApplication.class);
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.setListeners(List.of(new AppStartingListener()));
//        ConfigurableApplicationContext context = springApplication.run(args);
//
//        Foo foo = context.getBean(Foo.class);
//
//        System.out.println(foo);
//
//    }
}
