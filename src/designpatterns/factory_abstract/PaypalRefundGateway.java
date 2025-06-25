package designpatterns.factory_abstract;

public class PaypalRefundGateway implements RefundGateway {

	@Override
	public void refund() {
		System.out.println("refund pay");

	}

}
