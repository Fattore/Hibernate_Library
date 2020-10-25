package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "Editora")
public class Editora {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo_Edit", nullable = false)    
    private int Codigo_Edit;
    
    @Column(name = "Nome_Edit", length = 150, nullable = false) 
    private String Nome_Edit;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Livro")
    private Livro Livro;
      
    public int getCodigo_Edit() {
        return Codigo_Edit;
    }

    public void setCodigo_Edit(int Codigo_Edit) {
        this.Codigo_Edit = Codigo_Edit;
    }

    public String getNome_Edit() {
        return Nome_Edit;
    }

    public void setNome_Edit(String Nome_Edit) {
        this.Nome_Edit = Nome_Edit;
    }

    public Livro getLivro() {
        return Livro;
    }

    public void setLivro(Livro Livros) {
        this.Livro = Livros;
    }
    
    public Editora(){}   
}    
