package designpatterns.factory_abstract;

public class PaypalFactory implements PaymentPlatformFactory {

	@Override
	public PurchaseGateway createPurchaseGateway() {
		return new PaypalPurchaseGateway();
	}

	@Override
	public RefundGateway createRefundGateway() {
		return new PaypalRefundGateway();
	}

}
