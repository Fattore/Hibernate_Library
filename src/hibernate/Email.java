package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "Email")
public class Email {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int Codigo_Email;
    
    @Column(name = "Email")    
    private String Email;
    
    @Column(name = "Codigo_Aut")    
    private int Codigo_Aut;

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

    public int getCodigo_Aut() {
        return Codigo_Aut;
    }

    public void setCodigo_Aut(int Codigo_Aut) {
        this.Codigo_Aut = Codigo_Aut;
    }
}
