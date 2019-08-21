/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.bo.custom.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.librarymgt.bo.custom.AutherBO;
import lk.ijse.librarymgt.dao.DAOFactory;
import lk.ijse.librarymgt.dao.customer.AutherDAO;
import lk.ijse.librarymgt.dto.AutherDTO;
import lk.ijse.librarymgt.entity.Auther;

/**
 *
 * @author Ravindu
 */
public class AutherBOImpl implements AutherBO{
    
    AutherDAO dao = (AutherDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.AUTHER);

    @Override
    public boolean addAuther(AutherDTO ref) throws ClassNotFoundException, SQLException {
        return dao.add(new Auther(ref.getAID(),ref.getAname(),ref.getGender(),ref.getCountry(),ref.getEmail()));
    }

    @Override
    public boolean updateAuther(AutherDTO ref) throws ClassNotFoundException, SQLException {
        return dao.update(new Auther(ref.getAID(),ref.getAname(),ref.getGender(),ref.getCountry(),ref.getEmail())); 
    }

    @Override
    public boolean deleteAuther(String AID) throws ClassNotFoundException, SQLException {
        return dao.delete(AID); 
    }

    @Override
    public ArrayList<AutherDTO> getAllAuthers() throws ClassNotFoundException, SQLException {
        ArrayList<Auther> all = dao.getAll();
        ArrayList<AutherDTO> allAuthers = new ArrayList<>();
        for (Auther search : all) {
           allAuthers.add(new AutherDTO(search.getAID(),search.getAname(),search.getGender(),search.getCountry(),search.getEmail())); 
        }
        return allAuthers;
    }
   
   
    @Override
    public AutherDTO searchAuther(String id) throws SQLException, ClassNotFoundException {
         Auther search = dao.search(id);
        return new AutherDTO(search.getAID(),search.getAname(),search.getGender(),search.getCountry(),search.getEmail());
    }
    
}
