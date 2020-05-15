/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.pkg1;

/**
 *
 * @author Duc Thang
 */
import java.util.Scanner;

public class Bai11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        while (true) {
            System.out.println("ung dung quan ly");
            System.out.println("nhap 1: them moi can bo");
            System.out.println("nhap 2: tim kiem ho ten ");
            System.out.println("nhap 3: hien thi danh sach can bo ");
            System.out.println("nhap 4: thoat");
            System.out.println("moi ban chon tu 1 -> 4: ");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println(" nhap a: them ky su:");
                    System.out.println(" nhap b: them cong nhan:");
                    System.out.println(" nhap c: them nhan vien:");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("nhap ten: ");
                            String hoTen = sc.nextLine();
                            System.out.print("nhap tuoi:");
                            int tuoi = sc.nextInt();
                            System.out.print("nhap gioi tinh: ");
                            sc.nextLine();
                            String gioiTinh = sc.nextLine();
                            System.out.print("nhap dia chi: ");
                            String diaChi = sc.nextLine();
                            System.out.print("nhap nganh dao tao: ");
                            String nganhDaoTao = sc.nextLine();
                            CanBo kysu = new KySu (hoTen, gioiTinh, tuoi, diaChi, nganhDaoTao);
                            QLCB.addCanBo(kysu);
                            System.out.println(kysu.toString());
                            break;
                        }
                    }
                }
            }
        }
    }

}
