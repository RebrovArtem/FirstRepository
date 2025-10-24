import java.io.IOException;

public class MyIOException extends RuntimeException {
    public MyIOException(){
        super("Ошибка при работе с файлом");
    }
}
