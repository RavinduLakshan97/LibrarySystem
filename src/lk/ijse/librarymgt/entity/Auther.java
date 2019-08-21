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
public class Auther {
    
    private String Aname;
    private String AID;
    private String Gender;
    private String Country;
    private String Email;

    public Auther() {
    }

    public Auther(String Aname, String AID, String Gender, String Country, String Email) {
        this.Aname = Aname;
        this.AID = AID;
        this.Gender = Gender;
        this.Country = Country;
        this.Email = Email;
    }

    public String getAname() {
        return Aname;
    }

    public void setAname(String Aname) {
        this.Aname = Aname;
    }

    public String getAID() {
        return AID;
    }

    public void setAID(String AID) {
        this.AID = AID;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
}
