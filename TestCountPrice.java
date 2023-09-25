import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCountPrice {
    @Test
    void checkCountPrice() {
        //Dành cho đối tượng là sinh viên
        assertEquals(-1, Main.countPrice("sinh vien", -10));
        assertEquals(5000000, Main.countPrice("sinh vien", 2));
        assertEquals(4500000, Main.countPrice("sinh vien", 6));
        assertEquals(3500000, Main.countPrice("sinh vien", 37));
        assertEquals(-1, Main.countPrice("sinh vien", 100));

        //Dành cho đối tượng là công nhân
        assertEquals(-1, Main.countPrice("cong nhan", 0));
        assertEquals(6500000, Main.countPrice("cong nhan", 1));
        assertEquals(6000000, Main.countPrice("cong nhan", 4));
        assertEquals(5000000, Main.countPrice("cong nhan", 30));
        assertEquals(-1, Main.countPrice("cong nhan", 500));
    }
}