package app;

import org.hibernate.Query;
import org.hibernate.Session;

import lockerdata.schema.model.Beef;

public class app {


    public static void main(String[] args) {
    	Session session = LockerdataHibernateUtil.getSessionFactory().openSession();
    Query query = session.createQuery("from Beef");
    java.util.List<Beef> list = query.list();
    for(Beef test: list) {
        System.out.println(test.getOwner());
    }
    }
}
