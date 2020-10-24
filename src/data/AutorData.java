package data;

import javax.persistence.*;
import hibernate.Autor;

public class AutorData {
    
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Biblioteca");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    public void create(Autor aut){
        aut = new Autor();
        
        entityManager.getTransaction().begin();
        entityManager.persist(aut);
        entityManager.getTransaction().commit();
    }
    
    public void read(Autor aut, int id){
        aut = entityManager.find(Autor.class, id);
        
        System.out.println("Código Autor: "+aut.getCodigo_Aut()+"\n"+
                           "Nome: "+aut.getNome_Aut()+"\n"+
                           "Email: "+aut.getEmail()+"\n");              
    }
    
    public void update(Autor aut, int id){
        aut = new Autor();
        
        entityManager.getTransaction().begin();
        entityManager.merge(aut);
        entityManager.getTransaction().commit();
    }
    
    public void delete(Autor aut, int id){
        aut = entityManager.find(Autor.class, id);
        
        entityManager.getTransaction().begin();
        entityManager.remove(aut);
        entityManager.getTransaction().commit();        
    }
    
}
