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
public class Publisher {
    private String pname;
    private String pid;
    private String telephone;
    private String country;
    private String email;

    public Publisher() {
    }

    public Publisher(String pname, String pid, String telephone, String country, String email) {
        this.pname = pname;
        this.pid = pid;
        this.telephone = telephone;
        this.country = country;
        this.email = email;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    
    
}
