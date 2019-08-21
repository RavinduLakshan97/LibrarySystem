/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.bo.custom;

import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.librarymgt.bo.SuperBO;
import lk.ijse.librarymgt.dto.BorrowDTO;

/**
 *
 * @author Ravindu
 */
public interface BorrowBO extends SuperBO{
    public boolean addBorrow(BorrowDTO cust)throws ClassNotFoundException,SQLException;
    
//    public boolean updateCustomer(CustomerDTO cust)throws SQLException,ClassNotFoundException;
    
    public boolean deleteBorrow(String BOID)throws SQLException,ClassNotFoundException;
    
    public  BorrowDTO searchBorrows(String id) throws SQLException, ClassNotFoundException;

    
    public ArrayList<BorrowDTO> getAllBorrows()throws ClassNotFoundException,SQLException;
    
}
