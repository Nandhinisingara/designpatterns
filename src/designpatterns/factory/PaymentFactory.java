package designpatterns.factory;

public class PaymentFactory {

	public static  PaymentGateway getGateway(String type) {
		if (type.equals("stripe")) {
			return new StripePaymentGateway();
		}
		if (type.equals("adyen")) {
			return new AdyenPaymentGateway();
		} else {
			throw new IllegalArgumentException("Invalid payment gateway");
		}

	}

}
