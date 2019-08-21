/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.librarymgt.bo.BOFactory;
import lk.ijse.librarymgt.bo.custom.AutherBO;
import lk.ijse.librarymgt.dto.AutherDTO;

/**
 *
 * @author Ravindu
 */
public class AutherController {

    static AutherBO bo = (AutherBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.AUTHER);

    public static boolean addAuther(AutherDTO cust) throws ClassNotFoundException, SQLException {
        return bo.addAuther(cust);

    }

    public static boolean updateAuther(AutherDTO cust) throws ClassNotFoundException, SQLException {
        return bo.updateAuther(cust);
    }

    public static boolean deleteAuther(String AID) throws ClassNotFoundException, SQLException {
        return bo.deleteAuther(AID);
    }

    public static ArrayList<AutherDTO> getAllAuther() throws ClassNotFoundException, SQLException {
        return bo.getAllAuthers();
    }
    public static AutherDTO searchAuther(String id) throws SQLException, ClassNotFoundException {
        return bo.searchAuther(id);
    }
}
