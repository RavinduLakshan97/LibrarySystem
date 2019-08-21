/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.bo.custom.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.librarymgt.bo.custom.BorrowBO;
import lk.ijse.librarymgt.dao.DAOFactory;
import lk.ijse.librarymgt.dao.customer.BorrowDAO;
import lk.ijse.librarymgt.dto.BorrowDTO;
import lk.ijse.librarymgt.entity.Borrow;

/**
 *
 * @author Ravindu
 */
public class BorrowBOImpl implements BorrowBO{

    BorrowDAO dao = (BorrowDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BORROW);
    
    @Override
    public boolean addBorrow(BorrowDTO cust) throws ClassNotFoundException, SQLException {
        return dao.add(new Borrow(cust.getBoid(),cust.getMid(),cust.getMname(),cust.getBid(),cust.getBname(),cust.getBdate(),cust.getRdate(),cust.getExdate()));
    }

    @Override
    public boolean deleteBorrow(String BOID) throws SQLException, ClassNotFoundException {
        return dao.delete(BOID);
    }

    @Override
    public BorrowDTO searchBorrows(String id) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<BorrowDTO> getAllBorrows() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
