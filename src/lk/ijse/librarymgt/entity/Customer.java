
package lk.ijse.librarymgt.entity;


public class Customer {
    private String MID;
    private String Mname;
    private String Maddress;
    private String Tel;
    private String Email;
    private String Gender;
//    private Date DOB;

    public Customer() {
    }

    public Customer(String MID, String Mname, String Maddress, String Tel, String Email, String Gender) {
        this.MID = MID;
        this.Mname = Mname;
        this.Maddress = Maddress;
        this.Tel = Tel;
        this.Email = Email;
        this.Gender = Gender;
    }

    public String getMID() {
        return MID;
    }

    public void setMID(String MID) {
        this.MID = MID;
    }

    public String getMname() {
        return Mname;
    }

    public void setMname(String Mname) {
        this.Mname = Mname;
    }

    public String getMaddress() {
        return Maddress;
    }

    public void setMaddress(String Maddress) {
        this.Maddress = Maddress;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

   
    
    
}
