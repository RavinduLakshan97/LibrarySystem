/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.controller;

import lk.ijse.librarymgt.bo.BOFactory;
import lk.ijse.librarymgt.bo.custom.BooksBO;
import lk.ijse.librarymgt.dto.BooksDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ravindu
 */
public class BooksController {
    static BooksBO bo= (BooksBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.BOOKS);
    
    public static boolean addBooks(BooksDTO cust)throws ClassNotFoundException,SQLException {
        return bo.addBook(cust);
        
    }
    
    public static boolean updateBooks(BooksDTO cust)throws ClassNotFoundException,SQLException {
        return bo.updateBook(cust);
    }
    
    public static boolean deleteBooks(String BID)throws ClassNotFoundException,SQLException {
        return bo.deleteBook(BID);
    }
    
    public static ArrayList<BooksDTO> getAllBooks()throws ClassNotFoundException,SQLException {
        return bo.getAllBooks();
    }
}
