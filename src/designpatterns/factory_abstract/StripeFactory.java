package designpatterns.factory_abstract;

public class StripeFactory implements PaymentPlatformFactory {

	@Override
	public PurchaseGateway createPurchaseGateway() {
		return new StripePurchaseGateway();
	}

	@Override
	public RefundGateway createRefundGateway() {
		return new StripeRefundGateway();
	}

}
