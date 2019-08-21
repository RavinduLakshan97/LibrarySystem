/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.librarymgt.bo.custom.impl;

import lk.ijse.librarymgt.bo.custom.BooksBO;
import lk.ijse.librarymgt.dao.DAOFactory;
import lk.ijse.librarymgt.dao.customer.BooksDAO;
import lk.ijse.librarymgt.dto.BooksDTO;
import lk.ijse.librarymgt.entity.Books;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ravindu
 */
public class BooksBOImpl implements BooksBO {

    BooksDAO dao = (BooksDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BOOKS);

    @Override
    public boolean addBook(BooksDTO ref) throws ClassNotFoundException, SQLException {
        return dao.add(new Books(ref.getBID(),ref.getBname(),ref.getAID(),ref.getIsbn(), ref.getPublisher(), ref.getPID(), ref.getCatogory()));
    }

    @Override
    public boolean updateBook(BooksDTO ref) throws ClassNotFoundException, SQLException {
        return dao.update(new Books(ref.getBID(), ref.getBname(),  ref.getAID(), ref.getIsbn(), ref.getPublisher(), ref.getPID(), ref.getCatogory()));
    }

    @Override
    public boolean deleteBook(String BID) throws ClassNotFoundException, SQLException {
        return dao.delete(BID);
    }

    @Override
    public ArrayList<BooksDTO> getAllBooks() throws ClassNotFoundException, SQLException {
        ArrayList<Books> all = dao.getAll();
        ArrayList<BooksDTO> allBooks = new ArrayList<>();
        for (Books search : all) {
            allBooks.add(new BooksDTO(search.getBID(), search.getBname(), search.getAID(), search.getIsbn(), search.getPublisher(), search.getPID(), search.getCatogory()));
        }
        return allBooks;
    }

}
