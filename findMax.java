import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        // khai báo n:hàng, m:cột trong mảng 2 chiều
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng : ");
        int n = scanner.nextInt();
        System.out.print("Nhập số cột :");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        //vòng lặp duyệt mảng 2 chiều để ghi từng giá trị i j
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("nhập giá trị " + i + "," + j + " :");
                array[i][j] = scanner.nextInt();
            }
        }
        // gán max = phần tử đầu mảng
        int max = array[0][0];
        int u = 0;
        int k = 0;
        //duyệt max qua mảng 2 chiều
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    u = i;
                    k = j;
                    max = array[i][j];
                }
            }
        }
        // in kết quả max tại vị trí
        System.out.println("max = " + max + " Tại vị trí " + u + "," + k);

    }
}