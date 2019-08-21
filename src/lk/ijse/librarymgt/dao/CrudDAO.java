
package lk.ijse.librarymgt.dao;

import java.sql.SQLException;
import java.util.ArrayList;


public interface CrudDAO<T,MID>extends SuperDAO{
    public void crudTest();
    public boolean add(T t)throws ClassNotFoundException,SQLException;
    public boolean update(T t)throws ClassNotFoundException,SQLException;
    public boolean delete(MID t)throws ClassNotFoundException,SQLException;
    public T search(MID t)throws ClassNotFoundException,SQLException;
    public ArrayList<T> getAll()throws ClassNotFoundException,SQLException;
    
}
