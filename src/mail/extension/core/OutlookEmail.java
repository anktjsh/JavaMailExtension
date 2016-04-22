/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail.extension.core;

import java.util.Properties;

/**
 *
 * @author Aniket
 */
public class OutlookEmail extends Email {

    public OutlookEmail(String us, String p) {
        super(us, p);
        Properties pro = getProperties();
        pro.put("mail.smtp.host", "smtp-mail.outlook.com");
        pro.put("mail.smtp.starttls.enable", "true");
        pro.put("mail.smtp.auth", "true");
        pro.put("mail.smtp.port", "587");
    }

    @Override
    public void beforeSend() {

    }

}
