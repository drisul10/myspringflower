package dev.andrisul.myspringflower.client;

import lombok.Data;

@Data
public class PaymentGatewayClient {

    public String endpoint;

    public String privateKey;

    public String publicKey;
}
