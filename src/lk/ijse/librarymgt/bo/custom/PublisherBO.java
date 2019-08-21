/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.bo.custom;

import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.librarymgt.bo.SuperBO;
import lk.ijse.librarymgt.dto.PublisherDTO;

/**
 *
 * @author Ravindu
 */
public interface PublisherBO extends SuperBO{
    public boolean addPublisher(PublisherDTO cust) throws ClassNotFoundException, SQLException;

    public boolean updatePublisher(PublisherDTO cust) throws ClassNotFoundException, SQLException;

    public boolean deletePublisher(String PID) throws ClassNotFoundException, SQLException;

    public ArrayList<PublisherDTO> getAllPublishers() throws ClassNotFoundException, SQLException;
    
}
