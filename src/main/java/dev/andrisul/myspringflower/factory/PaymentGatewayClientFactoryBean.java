package dev.andrisul.myspringflower.factory;

import dev.andrisul.myspringflower.client.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {

    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient paymentGatewayClient = new PaymentGatewayClient();
        paymentGatewayClient.setEndpoint("xyz.io");
        paymentGatewayClient.setPrivateKey("kculemhs1w");
        paymentGatewayClient.setPublicKey("w1shmeluck");
        return paymentGatewayClient;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}
