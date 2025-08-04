package programmerzamannow.spring.core.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentGatewayClient {

    private String endpoint;

    private String privateKey;

    private String publicKey;
}
