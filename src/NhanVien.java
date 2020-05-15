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
public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }
    
}
