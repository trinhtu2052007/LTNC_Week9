import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilePathTest {

    @Test
    public void testHardcodedPathFailsOnLinuxAndMac() {
//        String filePath = "config\\settings.xml";
//        File file = new File(filePath);
//        assertEquals("config", file.getParent());


        // Sử dụng File.separator
        String filePath = "config" + File.separator + "settings.xml";
        File file = new File(filePath);
        assertEquals("config", file.getParent());
    }
}