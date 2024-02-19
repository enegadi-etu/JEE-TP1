package dao;

import org.springframework.stereotype.Component;

public class DaoImplV2 implements IDao{
    @Override
    public double getValue() {
        System.out.println("DaoImpl version 2");
        return 200;
    }
}
