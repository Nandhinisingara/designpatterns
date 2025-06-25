package designpatterns.builder;

public class BuilderMain {
	public static void main(String[] args) {
		// Stripe gateway (requires CVV)
		PurchaseRequest stripeRequest = new PurchaseRequest
				.Builder("4111-xxxx", "Nandhini")
				.cvv("123")
				.configName("StripeConfig").build();

		System.out.println(stripeRequest);

		// WorldPay gateway (no CVV)
		PurchaseRequest worldpayRequest = new PurchaseRequest
				.Builder("5500-xxxx", "Nandhini")
				.token("tok_worldpay_xyz")
				.configName("WorldPayConfig").build();

		System.out.println(worldpayRequest.toString());
	}

}
