/**
 * Emulates a client program to send and receive emails.
 */
public class MailClient
{
    // The server used.
    private MailServer server;
    // The user who runs the client.
    private String user;

    /**
     * Creates a mail client of an specific mail server runned by the given user.
     */
    public MailClient(MailServer server, String user)
    {
        this.server = server;
        this.user = user;
    }  
    
    /**
     * Returns the last mail in the inbox (if it isn't empty).
     */
    public MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }
    
    /**
     * Prints the last mail in the inbox. If empty a message will show.
     */
    public void printNextMailItem()
    {
        MailItem inbox = server.getNextMailItem(user);
        if(inbox != null) {
            inbox.show();
        }
        else {
            System.out.println("The inbox is empty");
        }
    }
    
    /**
     * Prints how many emails left you have.
     */
    public void printHowManyEmails()
    {
        System.out.println("You have " + server.howManyMailItems(user) + " new messages");
    }
    
    /**
     * Sends the given message to the given recipient from the given sender.
     */
    public void sendMailItem(String to, String subject, String message)
    {
       MailItem mail = new MailItem(user, to, subject, message);
       server.post(mail);
    }
}
