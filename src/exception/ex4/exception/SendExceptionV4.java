package exception.ex4.exception;


public class SendExceptionV4 extends NetworkClientExceptionV4 {

    private final String sendData;
    public SendExceptionV4(String message, String sendData) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
