package Presentation;

import dao.DaoImpl;
import dao.DaoImplV2;
import dao.IDao;
import metier.MetierImpl;

public class pres {
    public static void main(String[] args) {
        IDao dao = new DaoImpl();
        IDao dao2 = new DaoImplV2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao2);
        System.out.println(metier.calcul());
    }
}
