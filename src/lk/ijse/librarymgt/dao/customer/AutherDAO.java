/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.dao.customer;

import java.sql.SQLException;
import lk.ijse.librarymgt.dao.CrudDAO;
import lk.ijse.librarymgt.entity.Auther;

/**
 *
 * @author Ravindu
 */
public interface AutherDAO extends CrudDAO<Auther, String>{
    public void getLastAID()throws ClassNotFoundException,SQLException;
    public void getLastAuther();
}
