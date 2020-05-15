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
public class CongNhan extends CanBo{
    private int bac;

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
    
}
