package script;

import hibernate.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HQL_Script {
    
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Biblioteca");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager(); 
    
    public void consultaAutor() {
        String consultar = "from Autor";
        Query q = entityManager.createQuery(consultar);
        List<Object> resultado = q.getResultList();
        
        for (int i = 0; i <= resultado.size()-1; i++) {
            Autor aut = (Autor)resultado.get(i);
            System.out.println("SQL:\nCódigo:" + aut.getCodigo_Aut() + "\nNome:" + aut.getNome_Aut() + "\n");
        }
    }

    public void consultaEditora() {
        String consultar = "from Editora";
        Query q = entityManager.createQuery(consultar);
        List<Object> resultado = q.getResultList();
        
        for (int i = 0; i <= resultado.size()-1; i++) {
            Editora edit = (Editora)resultado.get(i);
            System.out.println("SQL: " + edit.getCodigo_Edit());
        }
    }
}
