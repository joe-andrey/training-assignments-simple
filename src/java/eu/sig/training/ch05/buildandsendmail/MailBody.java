package eu.sig.training.ch05.buildandsendmail;

public class MailBody {
	public String subject;
	public MailFont font;
	public Message mailMessage;

	public MailBody(String subject, MailFont font, Message mailMessage) {
		this.subject = subject;
		this.font = font;
		this.mailMessage = mailMessage;
	}
	
	
}