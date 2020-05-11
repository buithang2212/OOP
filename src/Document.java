/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duc Thang
 */
public class Document {
    protected String id;
    protected String nxb;
    protected  int number;
    
    //ham khoi tao

    public Document(String id, String nxb, int number) {
        this.id = id;
        this.nxb = nxb;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public String getNxb() {
        return nxb;
    }

    public int getNumber() {
        return number;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}
