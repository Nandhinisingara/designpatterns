package designpatterns.factory;

public class StripePaymentGateway implements  PaymentGateway {

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		System.out.println("payment using stripe");
	}

	@Override
	public void Refund() {
		// TODO Auto-generated method stub
		
	}

}
