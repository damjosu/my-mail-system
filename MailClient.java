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
}
