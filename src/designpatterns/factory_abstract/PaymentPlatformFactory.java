package designpatterns.factory_abstract;

public interface PaymentPlatformFactory {

	PurchaseGateway createPurchaseGateway();

	RefundGateway createRefundGateway();

}
