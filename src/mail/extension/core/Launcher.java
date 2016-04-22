/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail.extension.core;

/**
 *
 * @author Aniket
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Status sent = EmailFactory.newEmailFactory().setCredentials(EmailFactory.GMAIL,
                "username",
                "password")
                .addRecipient("recipient-email")
                .setSubject("subject")
                .setMessage("message")
                .setAttachments(null)
                .construct().
                send();
        System.out.println(sent.isSuccess());
        System.out.println(sent.getMessage());
    }

}
