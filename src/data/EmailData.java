package data;

import javax.persistence.*;
import hibernate.Email;

public class EmailData {
    
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Biblioteca");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    public void create(Email email){
        email = new Email();
        
        entityManager.getTransaction().begin();
        entityManager.persist(email);
        entityManager.getTransaction().commit();
    }
    
    public void read(Email email, int id){
        email = entityManager.find(Email.class, id);
        
        System.out.println("Código Editora: "+email.getCodigo_Email()+"\n"+
                           "Nome: "+email.getEmail()+"\n"+
                           "Livro: "+email.getCodigo_Aut()+"\n");            
    }
    
    public void update(Email email, int id){
        email = new Email();
        
        entityManager.getTransaction().begin();
        entityManager.merge(email);
        entityManager.getTransaction().commit();
    }
    
    public void delete(Email email, int id){
        email = entityManager.find(Email.class, id);
        
        entityManager.getTransaction().begin();
        entityManager.remove(email);
        entityManager.getTransaction().commit();        
    }
         
}
