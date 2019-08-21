package lk.ijse.librarymgt.dao.customer.impl;

import lk.ijse.librarymgt.dao.CrudUtill;
import lk.ijse.librarymgt.dao.customer.BooksDAO;
import lk.ijse.librarymgt.entity.Books;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BooksDAOImpl implements BooksDAO {

    @Override
    public boolean add(Books ref) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("Insert into Books values(?,?,?,?,?,?,?)", ref.getBID(), ref.getBname(), ref.getAID(), ref.getIsbn(), ref.getPublisher(), ref.getPID(), ref.getCatogory());
    }

    @Override
    public boolean update(Books ref) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("update Books set Bname=?,AID=?,Isbn=?,Publisher=?,PID=?,Catogory=? where BID=?", ref.getBname(),  ref.getAID(), ref.getIsbn(), ref.getPublisher(), ref.getPID(), ref.getCatogory());
    }

    @Override
    public boolean delete(String BID) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from Books where BID=?", BID); 
    }

    @Override
    public ArrayList<Books> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst = CrudUtill.executeQuery("select * from Books");
        ArrayList<Books> allBooks = new ArrayList();
        while (rst.next()) {
            allBooks.add(new Books(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7)));
        }
        return allBooks;
    }

    @Override
    public void getLastBID() throws ClassNotFoundException, SQLException {
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
    public void getLastBook() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Books search(String t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
