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
public class Status {

    private final boolean success;
    private final String message;

    public Status(boolean b, String m) {
        success = b;
        message = m;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
