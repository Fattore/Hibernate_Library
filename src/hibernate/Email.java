package hibernate;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Email")
public class Email {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo_Email", nullable = false)    
    private int Codigo_Email;
    
    @Column(name = "Email", length = 255, nullable = false)    
    private String Email;
    
    @OneToMany(
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Autor> Codigo_Aut;

    public Email(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo_Email() {
        return Codigo_Email;
    }

    public void setCodigo_Email(int Codigo_Email) {
        this.Codigo_Email = Codigo_Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public List<Autor> getEditora() {
        return Codigo_Aut;
    }

    public void setEditora(List<Autor> editora) {
        this.Codigo_Aut = editora;
    }
    
    public Email(){}
}
