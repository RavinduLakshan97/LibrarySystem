/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.librarymgt.bo.BOFactory;
import lk.ijse.librarymgt.bo.custom.BorrowBO;
import lk.ijse.librarymgt.dto.BorrowDTO;
import lk.ijse.librarymgt.dto.CustomerDTO;

/**
 *
 * @author Ravindu
 */
public class BorrowController {
    static BorrowBO bo= (BorrowBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.BORROW);
    
    public static boolean addBorrow(BorrowDTO cust) throws ClassNotFoundException, SQLException{
        return bo.addBorrow(cust);
    }
//    public static boolean updateBorrow(BorrowDTO cust) throws SQLException, ClassNotFoundException{
//        return bo.updateBorrow(cust);
//    }
    public static boolean deleteBorrow(String BOID) throws SQLException, ClassNotFoundException{
        return bo.deleteBorrow(BOID);
    }
    public static ArrayList<BorrowDTO> getAllBorrows() throws ClassNotFoundException, SQLException{
        return bo.getAllBorrows();
    }
     public static BorrowDTO searchBorrows(String id) throws SQLException, ClassNotFoundException {
        return bo.searchBorrows(id);
    }
    
}
