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
public class NewsPaper extends Document {

    private int dayIssue;

    public NewsPaper(String id, String nxb, int number, int dayIssue) {
        super(id, nxb, number);
        this.dayIssue = dayIssue;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString() {
        return "Newspaper{"
                + "dayIssue=" + dayIssue
                + ", id='" + id + '\''
                + ", nxb='" + nxb + '\''
                + ", number='" + number + '\''
                + '}';
    }

}
