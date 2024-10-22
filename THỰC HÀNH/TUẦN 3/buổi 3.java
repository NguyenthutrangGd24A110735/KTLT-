
package ThongTinSinhVien;

import java.util.Scanner;

public class ThongTinSinhVien {

    private static final boolean NAM = false;
    private static final boolean NU = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String MaSinhVien = "110735"; 
        String Lop = "GD24A";
        String Hovaten = "Nguyễn Thu Trang";
        String Ngaysinh = "19/08/2005";
        String Khoa = "Khoa công nghệ thông tin";
        String DiaChi = "234 Ngô Quyền";
        boolean gioitinh = true; 
        int tuoi = 19;

        System.out.println("Họ và tên: " + Hovaten);
        System.out.println("Mã Sinh Viên: " + MaSinhVien);
        System.out.println("Lớp: " + Lop);
        System.out.println("Ngày Sinh: " + Ngaysinh);
        System.out.println("Khoa: " + Khoa);
        System.out.println("Địa Chỉ: " + DiaChi);
        System.out.println("Giới tính: " + (gioitinh ? "Nữ" : "Nam"));
        System.out.println("Tuổi: " + tuoi);
    }
}