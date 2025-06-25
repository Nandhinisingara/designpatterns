package designpatterns.builder;

public class PurchaseRequest {

	private final String cardNumber;
	private final String cardHolder;
	private final String cvv;  //no optional
	private final String token;
	private final String configName;
	

	public PurchaseRequest(Builder builder) {
		this.cardNumber = builder.cardNumber;
		this.cardHolder = builder.cardHolder;
		this.configName = builder.configName;
		this.cvv = builder.cvv;
		this.token = builder.token;
	}
	
	public static class Builder {
		private final String cardNumber;
		private final String cardHolder;

		private String cvv;
		private String token;
		private String configName;

		public Builder(String cardNumber, String cardHolder) {
			this.cardNumber = cardNumber;
			this.cardHolder = cardHolder;
		}

		public Builder cvv(String cvv) {
			this.cvv = cvv;
			return this;
		}

		public Builder token(String token) {
			this.token = token;
			return this;
		}

		public Builder configName(String configName) {
			this.configName = configName;
			return this;
		}

		public PurchaseRequest build() {
			return new PurchaseRequest(this);
		}
	}
	
	@Override
	public String toString() {
		return "PurchaseRequest {" + "cardNumber='" + cardNumber + '\'' + ", cardHolder='" + cardHolder + '\''
				+ ", cvv='" + cvv + '\'' + ", token='" + token + '\'' + ", configName='" + configName + '\'' + '}';
	}

}
