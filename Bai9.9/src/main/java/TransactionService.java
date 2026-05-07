import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransactionService {
    private static final Logger logger = LoggerFactory.getLogger(TransactionService.class);

    public void processTransaction(String accountId, double amount) {
//       System.out.println("Bắt đầu giao dịch cho " + accountId + " với số tiền " + amount);

        logger.info("Bắt đầu xử lý giao dịch cho tài khoản: {}, Số tiền: {}", accountId, amount);

        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Số tiền giao dịch phải lớn hơn 0");
            }

            logger.info("Giao dịch thành công cho tài khoản: {}", accountId);

        } catch (Exception e) {
            logger.error("Giao dịch thất bại cho tài khoản: {}. Lý do lỗi: {}", accountId, e.getMessage(), e);
        }
    }
}