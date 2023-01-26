package main;

import model.Service;
import service.ServiceDao;

import java.sql.SQLException;

public class Main1 {
    public static void main(String[] args) throws SQLException {
        Service service=new Service(0,"Cardiologie");
        ServiceDao serviceDao=new ServiceDao();
        serviceDao.add(service);
        serviceDao.findAll().forEach(service1 -> System.out.println(service1.getId()+"-"+service1.getLibelle()));
    }
}
