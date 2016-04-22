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
public class CustomEmail extends Email {

    private boolean authorized;
    private String host;
    private boolean enableSSl;
    private boolean enableTTLS;
    private int port;

    public CustomEmail(String us, String p) {
        super(us, p);
        port = -1;
    }

    public void setPort(int p) {
        port = p;
    }

    public void setAuth(boolean b) {
        authorized = b;
    }

    public void setHost(String sh) {
        host = sh;
    }

    public void setSSL(boolean b) {
        enableSSl = b;
    }

    public void setTTLS(boolean b) {
        enableTTLS = b;
    }

    @Override
    public void beforeSend() {
        Properties pro = getProperties();
        if (enableSSl) {
            pro.put("mail.smtp.ssl.enable", "true");
        }
        if (authorized) {
            pro.put("mail.smtp.auth", "true");
        }
        if (enableTTLS) {
            pro.put("mail.smtp.starttls.enable", "true");
        }
        pro.put("mail.smtps.host", host);
        if (port != -1) {
            pro.put("mail.smtp.port", "" + port);
        }
    }

}
