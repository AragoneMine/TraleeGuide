import Activity.Contains;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsTest {

    @Test
    void addActivity() {
        Contains.addActivity("ta","fe","","","");
    }

    @Test
    void findActivity() {
        Contains.addActivity("ta","fe","","","");
        Contains.findActivity("");
    }

    @Test
    void showAllActivity() {
        Contains.findActivity("");
    }
}