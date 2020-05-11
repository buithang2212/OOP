/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duc Thang
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        managerDoccument dcm = new managerDoccument();
        while (true) {
            System.out.println("quan ly ung dung tai lieu");
            System.out.println("1. them moi tai lieu");
            System.out.println("2. xoa tai lieu theo id");
            System.out.println("3. hien thi thong tin");
            System.out.println("4. tim kiem tai kieu theo id");
            System.out.println("5. thoat");
            System.out.println("moi ban nhap tu 1 -> 5");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("nhap a: in du lieu");
                    System.out.println("nhap b; in bao");
                    System.out.println("nhap c: in tap chi");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.println("nhap id:");
                            String id = sc.nextLine();
                            System.out.print("nhap nxb:");
                            String nxb = sc.nextLine();
                            System.out.print("nhap ma: ");
                            int number = sc.nextInt();
                            System.out.print("nhap tac gia: ");
                            sc.nextLine();
                            String author = sc.nextLine();
                            System.out.print("nhap so trang: ");
                            int pageNumber = sc.nextInt();
                            Document book = new Book(id, nxb, number, author, pageNumber);
                            //managerDoccument.addDoccument(book);
                            System.out.println(book.toString());
                            sc.nextLine();
                            break;
                        }
                    }
                }
            }
        }
    }

}
