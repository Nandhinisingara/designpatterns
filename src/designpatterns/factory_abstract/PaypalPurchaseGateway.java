package designpatterns.factory_abstract;

public class PaypalPurchaseGateway implements PurchaseGateway  {

	@Override
	public void pay() {
		System.out.println("paypal pay");
		
	}

}

