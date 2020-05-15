/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Duc Thang
 */
public class QLCB {

    List<QLCB> qlcb;

    public QLCB() {
        this.qlcb = new ArrayList<>();
    }

    public void addCanBo( QLCB qlcb) {
        this.qlcb.add(qlcb);
    }
    public void seachHoTen(String name){
//          return this.qlcb.stream().filter(o -> o.getHoTen().contains(HoTen)).collect(Collectors.toList());
    }
    public void showDanhSach(){
        this.qlcb.forEach(o -> System.out.println(o.toString()));
    }
}
