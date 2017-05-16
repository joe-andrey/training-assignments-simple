package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, EmployeInfo employeInfo, MailBody mailBody) {
        // Format the email address
        String mId = employeInfo.getMailAddress();
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(mailBody.font,
            mailBody.mailMessage.message1 + mailBody.mailMessage.message2 + mailBody.mailMessage.message3);
        // Send message
        m.send(mId, mailBody.subject, mMessage);
    }
    // end::buildAndSendMail[]

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    
    private class MailMessage {

    }

}