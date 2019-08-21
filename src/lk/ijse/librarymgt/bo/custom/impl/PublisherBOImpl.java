/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.bo.custom.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.librarymgt.bo.custom.PublisherBO;
import lk.ijse.librarymgt.dao.DAOFactory;
import lk.ijse.librarymgt.dao.customer.PublisherDAO;
import lk.ijse.librarymgt.dto.PublisherDTO;
import lk.ijse.librarymgt.entity.Publisher;

/**
 *
 * @author Ravindu
 */
public class PublisherBOImpl implements PublisherBO{
    
    PublisherDAO dao = (PublisherDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PUBLISHER);

    @Override
    public boolean addPublisher(PublisherDTO ref) throws ClassNotFoundException, SQLException {
        return dao.add(new Publisher(ref.getPid(),ref.getPname(),ref.getTelephone(),ref.getCountry(),ref.getEmail())); 
    }

    @Override
    public boolean updatePublisher(PublisherDTO ref) throws ClassNotFoundException, SQLException {
        return dao.update(new Publisher(ref.getPid(),ref.getPname(),ref.getTelephone(),ref.getCountry(),ref.getEmail()));
    }

    @Override
    public boolean deletePublisher(String PID) throws ClassNotFoundException, SQLException {
        return dao.delete(PID); 
    }

    @Override
    public ArrayList<PublisherDTO> getAllPublishers() throws ClassNotFoundException, SQLException {
        ArrayList<Publisher> all = dao.getAll();
        ArrayList<PublisherDTO> allPublishers = new ArrayList<>(); 
        for (Publisher search : all) {
           allPublishers.add(new PublisherDTO(search.getPid(),search.getPname(),search.getTelephone(),search.getCountry(),search.getEmail())); 
        }
        return allPublishers;
    }
    
}
