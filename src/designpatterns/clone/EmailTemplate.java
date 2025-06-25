package designpatterns.clone;

public class EmailTemplate implements Cloneable {

	private String subject;
	private String body;

	public EmailTemplate(String subject, String body) {
		super();
		this.subject = subject;
		this.body = body;
	}

	@Override
	public EmailTemplate clone() {

		try {
			return (EmailTemplate) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException("Clone failed");
		}
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void print() {
		System.out.println("Subject: " + subject + ", body: " + body);
	}

}
