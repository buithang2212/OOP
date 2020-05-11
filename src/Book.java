/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duc Thang
 */

public class Book extends Document {

    private String outhor;
    private int numerPage;

    public Book(String id, String nxb, int number, String author, int numberPage) {
        super(id, nxb, number);
        this.outhor = outhor;
        this.numerPage = numberPage;
    }
// khoi tao get set
    public String getOuthor() {
        return outhor;
    }

    public int getNumerPage() {
        return numerPage;
    }

    public void setOuthor(String outhor) {
        this.outhor = outhor;
    }

    public void setNumerPage(int numerPage) {
        this.numerPage = numerPage;
    }
    @Override
    public String toString() {
        return "Book{" +
                "author='" + outhor + '\'' +
                ", numerPage=" + numerPage +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number='" + number + '\'' +
                '}';
    }


}
