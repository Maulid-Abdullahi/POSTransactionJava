package database;

import cashRegistry.posEntityClass;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestHibernate {

    public static void main(String args []){

        Session session = HibernateHelper.getSessionFactory().getCurrentSession();
        //session.beginTransaction();
        Transaction tx = session.getTransaction();
        tx.begin();

        posEntityClass tracomAcademy = new posEntityClass();
        tracomAcademy.setAccNo("98764908407495");
        tracomAcademy.setAmount("2000000");
        session.save(tracomAcademy);

        //session.getTransaction().commit();
        tx.commit();

    }
}
