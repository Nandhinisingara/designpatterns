package designpatterns.factory_abstract;

public class StripePurchaseGateway implements PurchaseGateway  {

	@Override
	public void pay() {
		System.out.println("stripe pay");
		
	}

}
