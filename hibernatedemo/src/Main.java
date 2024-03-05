import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.internal.SessionImpl;

public class Main {
    public static void main(String[] args) throws HibernateException {
        Configuration configuration=new Configuration();
        configuration.configure("configuration.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(new Employee());
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}