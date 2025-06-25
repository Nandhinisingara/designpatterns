package designpatterns.factory_abstract;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentPlatformFactoryProvider {

	private static Map<String, Supplier<PaymentPlatformFactory>> factorySupplier = new HashMap<>();
	static {
		factorySupplier.put("stripe", StripeFactory::new);
		factorySupplier.put("paypal", PaypalFactory::new);
	}

	public static PaymentPlatformFactory getGateway(String type) {
		/*
		 * if (type.equals("stripe")) { return new StripeFactory(); } if
		 * (type.equals("paypal")) { return new PaypalFactory(); } else { throw new
		 * IllegalArgumentException("Invalid payment gateway"); }
		 */
		Supplier<PaymentPlatformFactory> paymentPlatformFactory = factorySupplier.get(type);
		if (paymentPlatformFactory == null) {
			throw new IllegalArgumentException("Invalid payment gateway");
		}
		return paymentPlatformFactory.get();
	}

}
