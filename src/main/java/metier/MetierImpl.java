package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements  IMetier{
    @Autowired
    private  IDao dao;

    @Override
    public double calcul() {
        double value = dao.getValue();
        double result = value * 23;
        return result;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
