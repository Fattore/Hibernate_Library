package hibernate;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Livro")
public class Livro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ISBN", nullable = false)
    private int ISBN;
    
    @Column(name = "Edicao", length = 225, nullable = false)  
    private String edicao;
    
    @Column(name = "Custo", length = 53, nullable = false)  
    private float custo;
    
    @Column(name = "Titulo", length = 255, nullable = false)   
    private String titulo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Autor")
    private Autor autor;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Editora")
    public Editora editora;
    
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

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public Livro(){}   
}
