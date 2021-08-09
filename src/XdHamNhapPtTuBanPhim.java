import java.util.Scanner;

public class XdHamNhapPtTuBanPhim {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("nhập số phần tử trong mảng");
        inputNubers(arr);
    }

    public static void inputNubers(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[10];
        int size;
        size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử" + (i) + ":");
            number[i] = scanner.nextInt();
        }
    }

}
