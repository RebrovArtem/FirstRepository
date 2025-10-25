import java.io.Serial;

public class MyIOException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -4485933467358737598L;

    public MyIOException(){
        super("Ошибка при работе с файлом");
    }
}
