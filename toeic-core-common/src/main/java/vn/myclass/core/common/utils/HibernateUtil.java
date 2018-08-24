package vn.myclass.core.common.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    // final cố định giá trị của biến
    private static final SessionFactory sessionFactory = buildSessionFactory();

    // static để không phải khởi tạo đối tượng class Hibernate, để build dt buildSess...
    private static SessionFactory buildSessionFactory() {

        try {
            // create sessionFactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();

        } catch (Throwable e) {
            System.out.println("Initial session factory fail");
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
