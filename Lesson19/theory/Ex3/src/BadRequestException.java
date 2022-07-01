import java.io.IOException;

public class BadRequestException extends IOException {
    public BadRequestException(String str) {
        super(str);
    }

    public static void main(String[] args) {
        BadRequestException bad = new BadRequestException("This error");
        System.out.println(bad.getMessage());
    }
}
