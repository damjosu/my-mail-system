/**
 * Emulates an email display with sender, recipient and message.
 */
public class MailItem
{
    // The sender.
    private String from;
    // The recipient.
    private String to;
    // The message.
    private String message;
    // The subject of the message.
    private String subject;

    /**
     * Creates a mail from the given sender, to the given recipient with the given message.
     */  
    public MailItem(String from, String to, String subject, String message)
    {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }
    
    /**
     * Returns the mail's sender.
     */
    public String getFrom()
    {
        return from;
    }
    
    /**
     * Returns the mail's recipient.
     */
    public String getTo()
    {
        return to;
    }

    /**
     * Returns the mail's message.
     */
    public String getMessage()
    {
        return message;
    }
    
     /**
     * Returns the mail's subject.
     */
    public String getSubject()
    {
        return subject;
    }
    
    /**
     * Prints mail's info: sender, recipient and message.
     */
    public void show()
    {
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);
    }
}
