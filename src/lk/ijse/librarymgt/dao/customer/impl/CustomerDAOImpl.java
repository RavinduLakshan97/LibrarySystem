package lk.ijse.librarymgt.dao.customer.impl;

import lk.ijse.librarymgt.dao.CrudUtill;
import lk.ijse.librarymgt.dao.customer.CustomerDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.librarymgt.entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public boolean add(Customer ref) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("Insert into Members  values(?,?,?,?,?,?)", ref.getMID(), ref.getMname(), ref.getMaddress(), ref.getTel(), ref.getEmail(), ref.getGender());
    }

    @Override
    public boolean update(Customer ref) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("update Members set Mname=?,Maddress=?,Tel=?,Email=?,Gender=? where MID=?", ref.getMname(), ref.getMaddress(), ref.getTel(), ref.getEmail(), ref.getGender());
    }

    @Override
    public boolean delete(String MID) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from Members where MID=?", MID);
    }

    @Override
    public ArrayList<Customer> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("select * from Members");
        ArrayList<Customer> allCustomers = new ArrayList();
        while (rst.next()) {
            allCustomers.add(new Customer(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)));
        }
        return allCustomers;
    }

    @Override
    public void getLastMID() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void test() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void crudTest() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getLastCustomer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Customer search(String t) throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("select * from Members where MID=?", t);
       Customer customer=null;
        while (rst.next()) {
            customer=new Customer(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));
        }
        return customer;
    }

}
