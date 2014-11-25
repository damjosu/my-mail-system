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

    /**
     * Creates a mail from the given sender, to the given recipient with the given message.
     */  
    public MailItem(String newFrom, String newTo, String newMessage)
    {
        from = newFrom;
        to = newTo;
        message = newMessage;
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
}
