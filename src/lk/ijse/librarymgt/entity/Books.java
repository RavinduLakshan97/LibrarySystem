/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.entity;

/**
 *
 * @author Ravindu
 */
public class Books {

    private String BID;
    private String Bname;
//    private String Auther;
    private String AID;
    private String Isbn;
    private String Publisher;
    private String PID;
    private String Catogory;

    public Books() {
    }

    public Books(String BID, String Bname, String AID, String Isbn, String Publisher, String PID, String Catogory) {
        this.BID = BID;
        this.Bname = Bname;
//        this.Auther = Auther;
        this.AID = AID;
        this.Isbn = Isbn;
        this.Publisher = Publisher;
        this.PID = PID;
        this.Catogory = Catogory;
    }

    public String getBID() {
        return BID;
    }

    public void setBID(String BID) {
        this.BID = BID;
    }

    public String getBname() {
        return Bname;
    }

    public void setBname(String Bname) {
        this.Bname = Bname;
    }

//    public String getAuther() {
//        return Auther;
//    }
//
//    public void setAuther(String Auther) {
//        this.Auther = Auther;
//    }

    public String getAID() {
        return AID;
    }

    public void setAID(String AID) {
        this.AID = AID;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String Isbn) {
        this.Isbn = Isbn;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getCatogory() {
        return Catogory;
    }

    public void setCatogory(String Catogory) {
        this.Catogory = Catogory;
    }

}
