import java.util.Scanner;

public class Main {
    public static int countPrice(String type, double year) {
        int price;
        if (type.equals("sinh vien")) {
            if (year <= 3) {
                price = 5000000;
            } else if (year < 7) {
                price = 4500000;
            } else {
                price = 3500000;
            }
            return price;
        } else if (type.equals("cong nhan")) {
            if (year <= 3) {
                price = 6500000;
            } else if (year < 7) {
                price = 6000000;
            } else {
                price = 5000000;
            }
            return price;
        }
        return -1;
    }
}


    //Dành cho đối tượng là sinh viên
    //assertEquals(-1, Main.countPrice("sinh vien", -10));
//assertEquals(5000000, Main.countPrice("sinh vien", 2));
//assertEquals(4500000, Main.countPrice("sinh vien", 6));
//assertEquals(3500000, Main.countPrice("sinh vien", 37));
//assertEquals(-1, Main.countPrice("sinh vien", 100));

//Dành cho đối tượng là công nhân
//assertEquals(-1, Main.countPrice("cong nhan", 0));
//assertEquals(6500000, Main.countPrice("cong nhan", 1));
//assertEquals(6000000, Main.countPrice("cong nhan", 4));
//assertEquals(5000000, Main.countPrice("cong nhan", 30));
//assertEquals(-1, Main.countPrice("cong nhan", 500));