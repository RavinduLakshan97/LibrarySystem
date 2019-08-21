
package lk.ijse.librarymgt.bo;

import lk.ijse.librarymgt.bo.custom.impl.AutherBOImpl;
import lk.ijse.librarymgt.bo.custom.impl.BooksBOImpl;
import lk.ijse.librarymgt.bo.custom.impl.BorrowBOImpl;
import lk.ijse.librarymgt.bo.custom.impl.CustomerBOImpl;
import lk.ijse.librarymgt.bo.custom.impl.PublisherBOImpl;



public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }
    
    public static BOFactory getInstance(){
    if(boFactory==null){
        boFactory=new BOFactory();
    }
    return boFactory;
    }
    public enum BOTypes{
        CUSTOMER,BOOKS,AUTHER,PUBLISHER,BORROW;
        
    }
    public SuperBO getBO(BOTypes types){
        switch(types){
            case CUSTOMER:
                return  new CustomerBOImpl();
            case BOOKS:
                return  new BooksBOImpl();
            case AUTHER:
                return new AutherBOImpl();
            case PUBLISHER:
                return new PublisherBOImpl();
            case BORROW:
                return new BorrowBOImpl();
            default:
                return null;
        }
    }
}
