package ro.cars.main;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import ro.cars.entity.Car;
import ro.cars.entity.CarType;
import ro.cars.util.HibernateUtil;

public class App {

    public static void main(String[] args) {
        try{
            Configuration configuration = new Configuration().configure().addAnnotatedClass(Car.class);
            SessionFactory sf = configuration.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();

            Car car = new Car("Bmw", "320",189, CarType.BREAK );
            session.save(car);
            tx.commit();
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }




//

    }
}
