package handlers;

import interfaces.AnimalHandler;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import repositories.Animal;

public class AnimalHandlerImpl implements AnimalHandler {
    private SessionFactory sessionFactory;

    public AnimalHandlerImpl() {
        init();
    }

    public void init(){
        sessionFactory = new Configuration()
                .addAnnotatedClass(Animal.class)
                .buildSessionFactory();
    }
    @Override
    public void addAnimal(Animal animal) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(animal);
        transaction.commit();

    }

    @Override
    public void getAnimal(Animal animal) {

    }
}
