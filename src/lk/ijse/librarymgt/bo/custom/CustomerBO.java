/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.bo.custom;

import lk.ijse.librarymgt.bo.SuperBO;
import lk.ijse.librarymgt.dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ravindu
 */
public interface CustomerBO extends SuperBO{
    public boolean addCustomer(CustomerDTO cust)throws ClassNotFoundException,SQLException;
    
    public boolean updateCustomer(CustomerDTO cust)throws SQLException,ClassNotFoundException;
    
    public boolean deleteCustomer(String MID)throws SQLException,ClassNotFoundException;
    
    public  CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;

    
    public ArrayList<CustomerDTO> getAllCustomer()throws ClassNotFoundException,SQLException;
    
}
