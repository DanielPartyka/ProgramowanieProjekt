/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateclass;

import java.net.URL;
import java.util.Properties;
import javax.imageio.spi.ServiceRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import static org.hibernate.cfg.AvailableSettings.URL;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Galan
 */
public class HibernateUtil {

    
    private static org.hibernate.SessionFactory sessionFactory;
    
    //pusty konstruktor
    private HibernateUtil()
    {
    
    }
    
    static {
       // zaladowanie klasy, Studenci uczelnia i danych z pliku konfiguracyjnego
       URL myurl = Thread.currentThread().getContextClassLoader().getResource("hibernateclass/hibernate.cfg.xml");
       sessionFactory = new Configuration().configure(myurl).buildSessionFactory();
    }
    
    public static SessionFactory getInstance()
    {
        return sessionFactory;
    }
    //otwarcie sesji
    public Session openSession()
    {
        return sessionFactory.openSession();
    }
    
    public Session getCurrentSesion()
    {
        return sessionFactory.getCurrentSession();
    }
    //zamykanie sesji
    public static void close()
    {
        if (sessionFactory!=null)
        {
            sessionFactory.close();
        }
        sessionFactory = null;
    }



}