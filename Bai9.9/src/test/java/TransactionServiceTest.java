import org.junit.jupiter.api.Test;

public class TransactionServiceTest {

    @Test
    public void testLogging() {
        TransactionService service = new TransactionService();

        service.processTransaction("ACC_9999", 500000);

        service.processTransaction("ACC_ERROR", -100);
    }
}