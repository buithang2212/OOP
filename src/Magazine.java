/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

/**
 *
 * @author Duc Thang
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duc Thang
 */
public class Magazine extends Document{
    private int issnumber;
    private int monthIssue;

    public Magazine(String id, String nxb, int number) {
        super(id, nxb, number);
        this.issnumber = issnumber;
        this.monthIssue = monthIssue;
    }

    public int getIssnumber() {
        return issnumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setIssnumber(int issnumber) {
        this.issnumber = issnumber;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }
        @Override
    public String toString() {
        return "tapChi{" +
                "issueNumber=" + issnumber +
                ", monthIssue=" + monthIssue +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    
}

