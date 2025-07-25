package programmerzamannow.spring.core.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
@AllArgsConstructor
public class FooBar {

    private Foo foo;

    private Bar bar;
}
