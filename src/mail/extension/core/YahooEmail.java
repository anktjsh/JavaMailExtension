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
public class YahooEmail extends Email {

    public YahooEmail(String us, String p) {
        super(us, p);
        Properties pro = getProperties();
        pro.put("mail.smtps.auth", "true");
        pro.put("mail.smtps.host", "smtp.mail.yahoo.com");
    }

    @Override
    public void beforeSend() {
    }

}
