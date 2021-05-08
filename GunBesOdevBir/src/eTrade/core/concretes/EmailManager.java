package eTrade.core.concretes;

import eTrade.core.abstracts.EmailService;

public class EmailManager implements EmailService {
    @Override
    public void send(String message) {
        System.out.println("Email gönderildi: " + message);
    }
}
