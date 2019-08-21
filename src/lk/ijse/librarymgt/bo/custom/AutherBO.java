/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.bo.custom;

import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.librarymgt.bo.SuperBO;
import lk.ijse.librarymgt.dto.AutherDTO;

/**
 *
 * @author Ravindu
 */
public interface AutherBO extends SuperBO {

    public boolean addAuther(AutherDTO cust) throws ClassNotFoundException, SQLException;

    public boolean updateAuther(AutherDTO cust) throws ClassNotFoundException, SQLException;

    public boolean deleteAuther(String AID) throws ClassNotFoundException, SQLException;
    
    public  AutherDTO searchAuther(String id) throws SQLException, ClassNotFoundException;

    public ArrayList<AutherDTO> getAllAuthers() throws ClassNotFoundException, SQLException;
}
