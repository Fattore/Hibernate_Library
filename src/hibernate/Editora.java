package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "Editora")
public class Editora {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Codigo_Edit;
    
    @Column(name = "Nome_Edit") 
    private String Nome_Edit;
    
    @Column(name = "Livro") 
    private int Livro;
      
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

    public int getLivro() {
        return Livro;
    }

    public void setLivro(int Livro) {
        this.Livro = Livro;
    }
    
    public Editora(){}
     
}    
