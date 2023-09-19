import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type;
        boolean validInput = false;

        do {
            System.out.print("Nhập đối tượng (sinh vien/cong nhan): ");
            type = scanner.nextLine().toLowerCase();

            // Check if the input is valid
            if (type.equals("sinh vien") || type.equals("cong nhan")) {
                validInput = true;
            } else {
                System.out.println("Đối tượng không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!validInput);

        System.out.print("Nhập năm sinh sống: ");

        double year = scanner.nextDouble();

        double price = countPrice(type, year);

        System.out.printf("Giá tiền trọ: %.1f triệu%n", price);

        scanner.close();
    }

    public static double countPrice(String type, double year) {
        double price;
        if (type.equals("sinh vien")) {
            if (year < 1) {
                price = 5000000;
            } else if (year <= 3) {
                price = 4500000;
            } else {
                price = 3500000;
            }
            return price;
        } else if (type.equals("cong nhan")) {
            if (year < 1) {
                price = 6500000;
            } else if (year <= 3) {
                price = 6000000;
            } else {
                price = 5000000;
            }
            return price;
        }
        return -1;
    }
}
