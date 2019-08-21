/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.controller;

import lk.ijse.librarymgt.bo.BOFactory;
import lk.ijse.librarymgt.bo.custom.CustomerBO;
import lk.ijse.librarymgt.dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ravindu
 */
public class CustomerController {
    static CustomerBO bo=(CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);
    
    public static boolean addCustomer(CustomerDTO cust) throws ClassNotFoundException, SQLException{
        return bo.addCustomer(cust);
    }
    public static boolean updateCustomer(CustomerDTO cust) throws SQLException, ClassNotFoundException{
        return bo.updateCustomer(cust);
    }
    public static boolean deleteCustomer(String MID) throws SQLException, ClassNotFoundException{
        return bo.deleteCustomer(MID);
    }
    public static ArrayList<CustomerDTO> getAllCustomer() throws ClassNotFoundException, SQLException{
        return bo.getAllCustomer();
    }
     public static CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException {
        return bo.searchCustomer(id);
    }
    
}
