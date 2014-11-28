/**
 * Emulates a client program to send and receive emails.
 */
public class MailClient
{
    // The server used.
    private MailServer server;
    // The user who runs the client.
    private String user;
    // The last mail in the inbox.
    private MailItem lastMail;

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
        lastMail = server.getNextMailItem(user);
        return lastMail;        
    }

    /**
     * Gets the last email and sends an automatic reply to the user who send it to you.
     */
    public void getNextMailItemAndAutorespond()
    {
        MailItem last = server.getNextMailItem(user);
        if (last != null) {            
            String from = last.getFrom();
            String subject = "RE: " + last.getSubject();
            String message = "Estoy de vacaciones" + "\n" + last.getMessage();
            MailItem automaticReply = new MailItem(user, from, subject, message);
            server.post(automaticReply);           
        }
    }
    
    /**
     * Prints the last mail received
     */
    public void printLastMailItem()
    {
        if (lastMail != null) {
            lastMail.show();
        }
        else {
            System.out.println("There aren't new messages");
        }
    }
    
    /**
     * Prints the last mail in the inbox. If empty a message will show.
     */
    public void printNextMailItem()
    {
        lastMail = server.getNextMailItem(user);
        String spam = lastMail.getMessage();
        if(lastMail != null)  {
            if (!(lastMail.contains("proyecto")) && (((spam.contains("viagra"))) || ((spam.contains("oferta"))))) {
                System.out.println("Spam");
            }    
            else {
                lastMail.show();
            }    
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
