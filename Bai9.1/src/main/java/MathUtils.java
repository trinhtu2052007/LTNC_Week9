import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(MathUtils.class) ;

    public int add(int a, int b) {
        int result = a + b ;
        LOGGER.info("add({}, {}) = {}", a, b, result) ;
        return result ;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            LOGGER.error("Chia cho 0 không hợp lệ!") ;
            throw new IllegalArgumentException("b không được bằng 0") ;
        }
        return a / b ;
    }
}