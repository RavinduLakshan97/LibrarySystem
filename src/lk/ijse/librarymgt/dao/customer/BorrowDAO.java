/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.dao.customer;

import java.sql.SQLException;
import lk.ijse.librarymgt.dao.CrudDAO;
import lk.ijse.librarymgt.entity.Borrow;

/**
 *
 * @author Ravindu
 */
public interface BorrowDAO extends CrudDAO<Borrow, String>{
    public void getLastBOID()throws SQLException,ClassNotFoundException;
    public void getLastBorrow();
    
}
