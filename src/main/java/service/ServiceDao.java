package service;

import model.Service;
import utils.DataBaseHelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceDao implements IService {
    private DataBaseHelper db;

    public ServiceDao() {
        db=new DataBaseHelper();
    }

    @Override
    public Service add(Service service) throws SQLException {
        try {
          String sql="INSERT INTO service VALUES(null,?)";
          db.myPrepareStatement(sql);
          Object[] parameters={service.getLibelle()};
          db.addParameters(parameters);
          db.myExecuteUpdate();
          service.setId(db.getGeneratedId());
          return  service;
        }
        catch (Exception e){
            throw e;
        }

    }

    @Override
    public Service update(Service service) {
        return null;
    }

    @Override
    public Service findByName(String name) {
        return null;
    }

    @Override
    public List<Service> findAll() throws SQLException {
        try {
            String sql="SELECT * FROM service";
            db.myPrepareStatement(sql);
           ResultSet rs= db.myExecuteQuery();
           List<Service> services=new ArrayList<>();
           while (rs.next()){
               Service s=new Service(rs.getInt(1),rs.getString(2));
               services.add(s);
           }
           rs.close();
           return services;
        }
        catch (Exception e){
            throw e;
        }
    }

    @Override
    public void delete(int id) {

    }
}
