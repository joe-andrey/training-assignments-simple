package eu.sig.training.ch05.buildandsendmail;

public class Message {
	public String message1;
	public String message2;
	public String message3;

	public Message(String message1, String message2, String message3) {
		this.message1 = message1;
		this.message2 = message2;
		this.message3 = message3;
	}
	
	public String getMessage(){
		return this.message1 + this.message2 + this.message3;
	}
}