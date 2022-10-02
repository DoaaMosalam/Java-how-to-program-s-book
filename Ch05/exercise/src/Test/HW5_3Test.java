import com.company.HW5_3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HW5_3Test {
    private HW5_3 hw;

    @BeforeEach
    void setUp() throws Exception {
        hw = new  HW5_3();
    }

    @Test
    void testOne() {
        hw.TestOne();
    }

    @Test
    void testTwo() {
        hw.TestTwo();
    }

    @Test
    void testThree() {
        hw.TestThree();
    }

    @Test
    void testFour() {
        hw.TestFour();
    }
}