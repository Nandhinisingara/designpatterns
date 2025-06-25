package designpatterns.factory_abstract;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		PaymentPlatformFactory pm = PaymentPlatformFactoryProvider.getGateway("stripe5");
		pm.createPurchaseGateway().pay();
	}

}
