/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.librarymgt.bo.BOFactory;
import lk.ijse.librarymgt.bo.custom.PublisherBO;
import lk.ijse.librarymgt.dto.PublisherDTO;

/**
 *
 * @author Ravindu
 */
public class PublisherController {
    
    static PublisherBO bo = (PublisherBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.PUBLISHER);
    
    public static boolean addPublisher(PublisherDTO cust) throws ClassNotFoundException, SQLException {
        return bo.addPublisher(cust);

    }
    
    public static boolean updatePublisher(PublisherDTO cust) throws ClassNotFoundException, SQLException {
        return bo.updatePublisher(cust);
    }

    public static boolean deletePublisher(String PID) throws ClassNotFoundException, SQLException {
        return bo.deletePublisher(PID);
    }

    public static ArrayList<PublisherDTO> getAllPublishers() throws ClassNotFoundException, SQLException {
        return bo.getAllPublishers();
    }
    
}
