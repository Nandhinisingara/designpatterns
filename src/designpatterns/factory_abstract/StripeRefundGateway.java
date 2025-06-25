package designpatterns.factory_abstract;

public class StripeRefundGateway implements RefundGateway{

	@Override
	public void refund() {
		System.out.println("stripe refund");
		
	}

}
