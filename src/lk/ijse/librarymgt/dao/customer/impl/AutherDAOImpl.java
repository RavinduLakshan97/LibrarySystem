/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.dao.customer.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.librarymgt.dao.CrudUtill;
import lk.ijse.librarymgt.dao.customer.AutherDAO;
import lk.ijse.librarymgt.entity.Auther;

/**
 *
 * @author Ravindu
 */
public class AutherDAOImpl implements AutherDAO {

    @Override
    public boolean add(Auther ref) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("Insert into Auther values(?,?,?,?,?)", ref.getAID(), ref.getAname(), ref.getGender(), ref.getCountry(), ref.getEmail());
    }

    @Override
    public boolean update(Auther ref) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("update Auther set Aname=?,Gender=?,Country=?,Email=? where AID=?", ref.getAname(), ref.getGender(), ref.getCountry(), ref.getEmail());
    }

    @Override
    public boolean delete(String AID) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from Auther where AID=?", AID);
    }

    @Override
    public ArrayList<Auther> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("select * from Auther");
        ArrayList<Auther> allAuthers = new ArrayList();
        while (rst.next()) {
            allAuthers.add(new Auther(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5)));
        }
        return allAuthers;
    }

    @Override
    public void getLastAID() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void test() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crudTest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getLastAuther() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Auther search(String t) throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("select * from Auther where Aname=?", t);
        Auther auther=null;
        while (rst.next()) {
            auther=new Auther(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5));
        }
        return auther;
    }

   
}
