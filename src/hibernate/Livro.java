package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "Livro")
public class Livro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ISBN;
    
    @Column(name = "Edicao")  
    private String edicao;
    
    @Column(name = "Custo")  
    private float custo;
    
    @Column(name = "Titulo")   
    private String titulo;
    
    @Column(name = "Editora") 
    private int editora;
    
    @Column(name = "Autor") 
    private int autor;
    
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getEditora() {
        return editora;
    }

    public void setEditora(int editora) {
        this.editora = editora;
    }

    public int getAutor() {
        return autor;
    }

    public void setAutor(int autor) {
        this.autor = autor;
    }    
    
    public Livro(){}
     
}
