/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.dao.customer;

import lk.ijse.librarymgt.dao.CrudDAO;
import lk.ijse.librarymgt.entity.Books;
import java.sql.SQLException;

/**
 *
 * @author Ravindu
 */
public interface BooksDAO extends CrudDAO<Books, String>{
    public void getLastBID()throws ClassNotFoundException,SQLException;
    public void getLastBook();
}
