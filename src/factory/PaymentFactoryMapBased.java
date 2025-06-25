package designpatterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentFactoryMapBased {

	private static Map<String, Supplier<PaymentGateway>> paymentGateway = new HashMap<>();
	
	static {
		paymentGateway.put("stripe", StripePaymentGateway::new);
		paymentGateway.put("adyen", AdyenPaymentGateway::new);
		paymentGateway.put("acpature", AcapturePaymentGateway::new);
	}
	
	public static PaymentGateway getGateway(String type) {
		Supplier<PaymentGateway> pg = paymentGateway.get(type);
		if (pg == null) {
			throw new IllegalArgumentException("Invalid payment gateway");
		}
		return pg.get();
		
	}

}
