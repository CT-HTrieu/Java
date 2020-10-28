
package tuan1;

import java.util.*;

public class Bai2 {
    public static void main(String[] args, Scanner scanner) {
        String name;
        int year;
        String address;

        System.out.print("Nhập vào họ tên của sinh viên: ");
        name = scanner.nextLine();
        System.out.print("Nhập vào năm sinh của sinh viên: ");
        year = scanner.nextInt();
        System.out.print("Nhập vào địa chỉ của sinh viên: ");
        address = scanner.nextLine();

        System.out.print("Họ tên của sinh viên: " + name);
        System.out.print("Tuổi của sinh viên =  " + year);
        System.out.print("Địa chỉ của sinh viên: " + address);
    }
}
