package ru.netology.data;


import lombok.AllArgsConstructor;
import lombok.Value;
import java.util.Random;

public class DataHelper {
    private DataHelper(){
    }
    
    public static VerificationCode getVerificationCode() {
        VerificationCode verificationCode = new VerificationCode("12345");
        return verificationCode;
    }

    public static AuthInfo getAuthInfo() {
        AuthInfo authInfo = new AuthInfo("vasya", "qwerty123");
        return authInfo;
    }

    public static CardInfo getFirstCardInfo() {
        CardInfo cardInfo;
        cardInfo = new CardInfo("5559 0000 0000 0001", "92df3f1c-a033-48e6-8390-206f6b1f56c0");
        return cardInfo;
    }

    public static CardInfo getSecondCardInfo() {
        return new CardInfo("5559 0000 0000 0002", "0f3f5c2a-249e-4c3d-8287-09f7a039391d");
    }

    public static int generateValidAmount(int balance) {
        return new Random().nextInt(balance)+1;
    }

    public static int generateInvalidAmount(int balance) {
        return Math.abs(balance)+new Random().nextInt(10000);
    }



  @Value
    public static class VerificationCode{
        String code;
    }

    @Value
    public static class CardInfo {
        String cardNumber;
        String testId;
    }

    @Value
    public static class AuthInfo {
        String login;
        String password;
    }
}
