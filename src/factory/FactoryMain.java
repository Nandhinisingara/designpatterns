package designpatterns.factory;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaymentGateway paymentGateway = PaymentFactory.getGateway("adyen");
		paymentGateway.purchase();
		paymentGateway.purchase();
		
		
		PaymentGateway paymentGateway1 = PaymentFactoryMapBased.getGateway("stripe");
		paymentGateway1.purchase();
		paymentGateway1.Refund();
	}

}
