import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCountPrice {
    @Test
    void checkCountPrice() {
        assertEquals(-1, Main.countPrice("cong nhan", 500));
    }
}