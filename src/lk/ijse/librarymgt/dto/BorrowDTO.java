/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.dto;

/**
 *
 * @author Ravindu
 */
public class BorrowDTO {
    private String boid;
    private String mid;
    private String mname;
    private String bid;
    private String bname;
    private String bdate;
    private String rdate;
    private String exdate;

    public BorrowDTO() {
    }

    public BorrowDTO(String boid, String mid, String mname, String bid, String bname, String bdate, String rdate, String exdate) {
        this.boid = boid;
        this.mid = mid;
        this.mname = mname;
        this.bid = bid;
        this.bname = bname;
        this.bdate = bdate;
        this.rdate = rdate;
        this.exdate = exdate;
    }

    public String getBoid() {
        return boid;
    }

    public void setBoid(String boid) {
        this.boid = boid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public String getExdate() {
        return exdate;
    }

    public void setExdate(String exdate) {
        this.exdate = exdate;
    }

   

   
   
    
   
    
    
}
