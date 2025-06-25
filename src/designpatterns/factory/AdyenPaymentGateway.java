package designpatterns.factory;

public class AdyenPaymentGateway implements  PaymentGateway {

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		System.out.println("payment using adyen");
	}

	@Override
	public void Refund() {
		// TODO Auto-generated method stub
		
	}

}
