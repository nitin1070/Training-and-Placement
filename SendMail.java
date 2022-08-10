
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



 class MyAuthenticator extends Authenticator{
     
      private final String username;
      private final String password;
      public MyAuthenticator(String username,String password){
        this.username=username;
        this.password=password;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        PasswordAuthentication pwdAuth=new PasswordAuthentication(this.username,this.password);        
        return pwdAuth;
    }
 
    
 }
     
public class SendMail {
    public static void main(String[] args) {
        final String username="nitinmaran59@gmail.com";
        final String password="tqjkxftqokernnny";
        
        
        Properties prop=new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        
        MyAuthenticator Myauth=new MyAuthenticator(username,password);
        Session session=Session.getInstance(prop, Myauth);
        
         try {

            Message message = new MimeMessage(session);
            InternetAddress[]recipients=InternetAddress.parse("nitinmeena1070@gmail.com ,pawankhandwe@gmail.com");
            message.setRecipients(
                    Message.RecipientType.TO,
                    recipients
            );
            message.setSubject("Email Testing");
            message.setText("Hii Friend!!");

            Transport.send(message);

            System.out.println("Mail Sent Successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
        
        
    }
    
}
