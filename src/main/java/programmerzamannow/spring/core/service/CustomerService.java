package programmerzamannow.spring.core.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.repository.CustomerRepository;


//@Scope("prototype")
//@Lazy
@Component
@Getter
public class CustomerService {

    @Autowired
    @Qualifier(value = "normalCustomerRepository")
    private CustomerRepository normalCustomerRepository;

    @Autowired
    @Qualifier(value = "premiumCustomerRepository")
    private CustomerRepository premiumCustomerRepository;
}
