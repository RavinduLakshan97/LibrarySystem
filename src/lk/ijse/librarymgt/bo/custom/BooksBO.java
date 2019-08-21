/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.bo.custom;


import lk.ijse.librarymgt.bo.SuperBO;
import lk.ijse.librarymgt.dto.BooksDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ravindu
 */
public interface BooksBO extends SuperBO{
    public boolean addBook(BooksDTO cust)throws ClassNotFoundException,SQLException;
    
    public boolean updateBook(BooksDTO cust)throws ClassNotFoundException,SQLException;
    
    public boolean deleteBook(String BID)throws ClassNotFoundException,SQLException;
    
    public ArrayList<BooksDTO> getAllBooks () throws ClassNotFoundException,SQLException;
    
}
