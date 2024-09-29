import java.util.Scanner;

public class TinhTrungBinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print("Vui long nhap so thu " + i + ": ");
            int number = scanner.nextInt();
            s += number;
        }
        double average = (double) s / n;

        System.out.println("Trung binh cua nam so nhap la: " + average);
    }
}