public class Facade {
    public Email sendMail() {
        Email email = new Email();
        EmailSubject.getSEmailSubject(email);
        EmailContent.getEmailContent(email);
        EmailTo.getEmailSentTo(email);
        EmailAttachment.getEmailAttachment(email);
        return email;
    }
}
