package data;

import javax.persistence.*;
import hibernate.Livro;

public class LivroData {
    
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Biblioteca");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    public void create(Livro liv){
        liv = new Livro();
        
        entityManager.getTransaction().begin();
        entityManager.persist(liv);
        entityManager.getTransaction().commit();
    }
    
    public void read(Livro liv, int id){
        liv = entityManager.find(Livro.class, id);
        
        System.out.println("ISBN: "+liv.getISBN()+"\n"+
                           "Edição: "+liv.getEdicao()+"\n"+
                           "Custo: "+liv.getCusto()+"\n"+        
                           "Titulo: "+liv.getTitulo()+"\n"+        
                           "Editora: "+liv.getEditora()+"\n"+                                                    
                           "Autor: "+liv.getAutor()+"\n");              
    }
    
    public void update(Livro liv, int id){
        liv = new Livro();
        
        entityManager.getTransaction().begin();
        entityManager.merge(liv);
        entityManager.getTransaction().commit();
    }
    
    public void delete(Livro liv, int id){
        liv = entityManager.find(Livro.class, id);
        
        entityManager.getTransaction().begin();
        entityManager.remove(liv);
        entityManager.getTransaction().commit();        
    }
    
}
