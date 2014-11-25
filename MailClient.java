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
    public MailClient(MailServer newServer, String newUser)
    {
        server = newServer;
        user = newUser;
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
}
