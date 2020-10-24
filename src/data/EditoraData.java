package data;

import javax.persistence.*;
import hibernate.Editora;

public class EditoraData {
    
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Biblioteca");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    public void create(Editora edit){
        edit = new Editora();
        
        entityManager.getTransaction().begin();
        entityManager.persist(edit);
        entityManager.getTransaction().commit();
    }
    
    public void read(Editora edit, int id){
        edit = entityManager.find(Editora.class, id);
        
        System.out.println("Código Editora: "+edit.getCodigo_Edit()+"\n"+
                           "Nome: "+edit.getNome_Edit()+"\n"+
                           "Livro: "+edit.getLivro()+"\n");            
    }
    
    public void update(Editora edit, int id){
        edit = new Editora();
        
        entityManager.getTransaction().begin();
        entityManager.merge(edit);
        entityManager.getTransaction().commit();
    }
    
    public void delete(Editora edit, int id){
        edit = entityManager.find(Editora.class, id);
        
        entityManager.getTransaction().begin();
        entityManager.remove(edit);
        entityManager.getTransaction().commit();        
    }
        
}
