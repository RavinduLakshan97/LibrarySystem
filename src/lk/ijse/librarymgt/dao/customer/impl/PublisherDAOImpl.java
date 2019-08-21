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
import lk.ijse.librarymgt.dao.customer.PublisherDAO;
import lk.ijse.librarymgt.entity.Publisher;

/**
 *
 * @author Ravindu
 */
public class PublisherDAOImpl implements PublisherDAO {

    @Override
    public boolean add(Publisher ref) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("Insert into Publisher values(?,?,?,?,?)",ref.getPid(),ref.getPname(),ref.getTelephone(),ref.getCountry(),ref.getEmail());
    }

    @Override
    public boolean update(Publisher ref) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("update Publisher set Pname=?,Telephone=?,Country=?,Email=? where PID",ref.getPname(),ref.getTelephone(),ref.getCountry(),ref.getEmail());
    }

    @Override
    public boolean delete(String PID) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from Auther where PID=?", PID);
    }

    @Override
    public ArrayList<Publisher> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("select * from Publisher");
        ArrayList<Publisher> allPublishers = new ArrayList();
        while (rst.next()) {
            allPublishers.add(new Publisher(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5)));
        }
        return allPublishers;
    }

    @Override
    public void getLastPID() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getLastPublisher() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void crudTest() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void test() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Publisher search(String t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
