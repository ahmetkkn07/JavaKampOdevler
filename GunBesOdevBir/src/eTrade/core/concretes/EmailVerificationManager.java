package eTrade.core.concretes;

import eTrade.core.abstracts.EmailService;
import eTrade.core.abstracts.VerificationService;
import eTrade.entities.concretes.User;

public class EmailVerificationManager implements VerificationService {
    private EmailService emailService;

    public EmailVerificationManager(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public boolean verificate(User user) {
        emailService.send(user.getEmail());
        // gelen emaili yakalama işlemleri
        return true;
    }
}
