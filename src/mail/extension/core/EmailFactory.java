/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail.extension.core;

import java.util.List;

/**
 *
 * @author Aniket
 */
public class EmailFactory {

    public final static int GMAIL = 0;
    public final static int HOTMAIL = 1;
    public final static int OUTLOOK = 2;
    public final static int YAHOO = 3;
    public final static int CUSTOM = 4;

    private Email email;

    private EmailFactory() {
    }

    public static EmailFactory newEmailFactory() {
        return new EmailFactory();
    }

    public EmailFactory setCredentials(int flag, String us, String pas) {
        switch (flag) {
            case GMAIL:
                email = new GmailEmail(us, pas);
                break;
            case HOTMAIL:
                email = new HotmailEmail(us, pas);
                break;
            case OUTLOOK:
                email = new OutlookEmail(us, pas);
                break;
            case YAHOO:
                email = new YahooEmail(us, pas);
                break;
            case CUSTOM:
                email = new CustomEmail(us, pas);
            default:
                throw new RuntimeException("Invalid Email Type");
        }
        return this;
    }

    public EmailFactory addRecipient(String s) {
        email.addRecipient(s);
        return this;
    }

    public EmailFactory setRecipients(List<String> al) {
        for (String s : al) {
            email.addRecipient(s);
        }
        return this;
    }

    public EmailFactory setAttachments(List<String> al) {
        if (al != null) {
            for (String f : al) {
                email.addAttachment(f);
            }
        }
        return this;
    }

    public EmailFactory setSubject(String s) {
        email.setSubject(s);
        return this;
    }

    public EmailFactory setMessage(String s) {
        email.setMessage(s);
        return this;
    }

    public Email construct() {
        return email;
    }
}
