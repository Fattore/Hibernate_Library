package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "Autor")
public class Autor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int Codigo_Aut;

    @Column(name = "Nome_Aut")      
    private String Nome_Aut;

    @Column(name = "Email")      
    private int Email;
    
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

    public int getEmail() {
        return Email;
    }

    public void setEmail(int Email) {
        this.Email = Email;
    }
}
