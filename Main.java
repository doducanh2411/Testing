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
