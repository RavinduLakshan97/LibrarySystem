/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.bo.custom.impl;

import lk.ijse.librarymgt.bo.custom.CustomerBO;
import lk.ijse.librarymgt.dao.DAOFactory;
import lk.ijse.librarymgt.dao.customer.CustomerDAO;
import lk.ijse.librarymgt.dto.CustomerDTO;
import lk.ijse.librarymgt.entity.Customer;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ravindu
 */
public class CustomerBOImpl implements CustomerBO{
    
    CustomerDAO dao = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
   
    

    @Override
    public boolean addCustomer(CustomerDTO ref) throws ClassNotFoundException, SQLException {
        return dao.add(new Customer(ref.getMID(), ref.getMname(), ref.getMaddress(), ref.getTel(),ref.getEmail(),ref.getGender()));
    }

    @Override
    public boolean updateCustomer(CustomerDTO ref) throws SQLException, ClassNotFoundException {
        return dao.update(new Customer(ref.getMID(), ref.getMname(), ref.getMaddress(), ref.getTel(),ref.getEmail(),ref.getGender()));
    }

    @Override
    public boolean deleteCustomer(String MID) throws SQLException, ClassNotFoundException {
        return dao.delete(MID);
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() throws ClassNotFoundException, SQLException {
        ArrayList<Customer> all= dao.getAll();
        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();
        for (Customer search : all) {
            allCustomers.add(new CustomerDTO(search.getMID(), search.getMname(), search.getMaddress(), search.getTel(),search.getEmail(),search.getGender()));
        }
        return allCustomers;
    }

    @Override
    public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException {
       Customer search = dao.search(id);
        return new CustomerDTO(search.getMID(),search.getMname(),search.getMaddress(),search.getTel(),search.getEmail(),search.getGender());
    }
    

    
}
