package lk.ijse.librarymgt.dao;

import lk.ijse.librarymgt.dao.customer.impl.AutherDAOImpl;
import lk.ijse.librarymgt.dao.customer.impl.BooksDAOImpl;
import lk.ijse.librarymgt.dao.customer.impl.BorrowDAOImpl;
import lk.ijse.librarymgt.dao.customer.impl.CustomerDAOImpl;
import lk.ijse.librarymgt.dao.customer.impl.PublisherDAOImpl;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public enum DAOTypes {
        CUSTOMER, BOOKS,AUTHER,PUBLISHER,BORROW;
    }

    public SuperDAO getDAO(DAOTypes types) {
        switch (types) {
            case CUSTOMER:
                return new CustomerDAOImpl();
            case BOOKS:
                return new BooksDAOImpl();
            case AUTHER:
                return new AutherDAOImpl();
            case PUBLISHER:
                return new PublisherDAOImpl();
            case BORROW:
                return new BorrowDAOImpl();
            default:
                return null;
        }
    }

}
