package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {


    @Override
    public double getValue() {
        System.out.println("DaoImpl version 1");
        return 100;
    }
}
