package exception.basic.checked;

// Exception을 상속받은 예외는 체크예외가 된다
public class MyCheckedException extends Exception{
    public MyCheckedException(String message) {
        super(message);
    }
}
