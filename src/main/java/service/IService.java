package service;

import model.Service;

import java.sql.SQLException;
import java.util.List;

public interface IService {
    public Service add(Service service) throws SQLException;
    public Service update(Service service) throws SQLException;
    public  Service findByName(String name) throws SQLException;
    public List<Service> findAll() throws SQLException;
    public void delete(int id) throws SQLException;

}
