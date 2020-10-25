package hibernate;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Autor")
public class Autor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo_Aut", nullable = false)
    private int Codigo_Aut;

    @Column(name = "Nome_Aut", length = 150, nullable = false)      
    private String Nome_Aut;

    @OneToMany(
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    @JoinColumn(name = "Email")
    public List<Email> email = new ArrayList();
    
    public int getCodigo_Aut() {
        return Codigo_Aut;
    }

    public void setCodigo_Aut(int Codigo_Aut) {
        this.Codigo_Aut = Codigo_Aut;
    }

    public String getNome_Aut() {
        return Nome_Aut;
    }

    public void setNome_Aut(String Nome_Aut) {
        this.Nome_Aut = Nome_Aut;
    }

    public List<Email> getEmail() {
        return email;
    }

    public void setEmail(List<Email> email) {
        this.email = email;
    }
}
