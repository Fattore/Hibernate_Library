package run;

import hibernate.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.persistence.*;

public class TesteHibernate {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Biblioteca");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    public static void main(String[] args){
        
        String opcao = JOptionPane.showInputDialog("Em qual tabela deseja trabalhar?\n>Autor\n>Editora\n>Livro");
        switch (opcao){
            case "Autor":
                opcao = JOptionPane.showInputDialog("Qual operação deseja fazer?\n>Cadastrar\n>Visualizar\n>Atualizar\n>Deletar");
                if (opcao == "Cadastrar") {
                    entityManager.getTransaction().begin();
                    
                    Autor aut = new Autor();
                    
                    JTextField Field1_aut = new JTextField(5);
                    JTextField Field2_aut = new JTextField(5);

                    JPanel myPanel_aut = new JPanel();
                    myPanel_aut.add(new JLabel("Nome:"));
                    myPanel_aut.add(Field1_aut);
                    myPanel_aut.add(Box.createVerticalStrut(15));

                    myPanel_aut.add(new JLabel("Email:"));
                    myPanel_aut.add(Field2_aut);
                    myPanel_aut.add(Box.createVerticalStrut(15));

                    int result_aut = JOptionPane.showConfirmDialog(null, myPanel_aut, 
                               "Cadastro Autor", JOptionPane.PLAIN_MESSAGE);

                    if (result_aut == JOptionPane.OK_OPTION) {
                        System.out.println("Valores Salvos:\n"+
                                           Field1_aut.getText()+"\n"+
                                           Field2_aut.getText()+"\n");
                    }

                    aut.setNome_Aut(Field1_aut.getText());
                    aut.email = new ArrayList<Email>();
                    aut.email.add(new Email(Field2_aut.getText()));
                    
                    try{
                        entityManager.persist(aut);
                        entityManager.getTransaction().commit();
                    } catch(Exception e) {
                        entityManager.getTransaction().rollback();
            
                    }
                    entityManager.close();
                    
                } else if(opcao == "Visualizar") {
                    String var;
                    
                    Autor aut = new Autor();
                    aut = entityManager.find(Autor.class, var = JOptionPane.showInputDialog("Digite o código do Autor"));

                    System.out.println("Código Autor: "+aut.getCodigo_Aut()+"\n"+
                                       "Nome: "+aut.getNome_Aut()+"\n"+
                                       "Email: "+aut.getEmail()+"\n");                         
                } else {
                    JOptionPane optionPane = new JOptionPane("Error!", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Opção Inválida");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);                    
                }
                break;
            case "Editora":
                opcao = JOptionPane.showInputDialog("Qual operação deseja fazer?\n>Cadastrar\n>Visualizar\n>Atualizar\n>Deletar");
                if (opcao == "Cadastrar") {
                    entityManager.getTransaction().begin();                    
                   
                    Editora edit = new Editora();
                    Livro liv = new Livro();
                    
                    JTextField Field1_edit = new JTextField(5);
                    JTextField Field2_edit = new JTextField(5);
                    
                    JPanel myPanel_edit= new JPanel();
                    
                    myPanel_edit.add(new JLabel("Nome:"));
                    myPanel_edit.add(Field1_edit);
                    myPanel_edit.add(Box.createVerticalStrut(15));

                    myPanel_edit.add(new JLabel("Livro:"));
                    myPanel_edit.add(Field2_edit);
                    myPanel_edit.add(Box.createVerticalStrut(15));

                    int result_edit = JOptionPane.showConfirmDialog(null, myPanel_edit, 
                               "Cadastro Editora", JOptionPane.PLAIN_MESSAGE);

                    if (result_edit == JOptionPane.OK_OPTION) {
                        System.out.println("Valores Salvos:\n"+
                                           Field1_edit.getText()+"\n"+
                                           Field2_edit.getText()+"\n");}
                    
                    edit.setNome_Edit(Field2_edit.getText());
                    edit.setLivro(liv);
                    
                    try{
                        entityManager.persist(edit);
                        entityManager.getTransaction().commit();
                    } catch(Exception e) {
                        entityManager.getTransaction().rollback();
            
                    }
                    entityManager.close();                    
                    
                } else if (opcao == "Visualizar") {
                    String var;
                    
                    Editora edit = new Editora();
                    edit = entityManager.find(Editora.class, var = JOptionPane.showInputDialog("Digite o código do Autor"));

                    System.out.println("Código Autor: "+edit.getCodigo_Edit()+"\n"+
                                       "Nome: "+edit.getNome_Edit()+"\n"+
                                       "Email: "+edit.getLivro()+"\n");    
                } else {
                    JOptionPane optionPane = new JOptionPane("Error!", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Opção Inválida");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);                    
                }
                break;
            case "Livro":
                opcao = JOptionPane.showInputDialog("Qual operação deseja fazer?\n>Cadastrar\n>Visualizar\n>Atualizar\n>Deletar");
                if (opcao == "Cadastrar") {
                    entityManager.getTransaction().begin(); 
                    
                    Livro liv = new Livro();
                    Autor aut = new Autor();
                    Editora edit = new Editora();
                    
                    JTextField Field1_liv = new JTextField(5);
                    JTextField Field2_liv = new JTextField(5);
                    JTextField Field3_liv = new JTextField(5);
                    JTextField Field4_liv = new JTextField(5);
                    JTextField Field5_liv = new JTextField(5);

                    JPanel myPanel = new JPanel();
                    myPanel.add(new JLabel("Edição:"));
                    myPanel.add(Field1_liv);
                    myPanel.add(Box.createVerticalStrut(15));

                    myPanel.add(new JLabel("Custo:"));
                    myPanel.add(Field2_liv);
                    myPanel.add(Box.createVerticalStrut(15));

                    myPanel.add(new JLabel("Título:"));
                    myPanel.add(Field3_liv);
                    myPanel.add(Box.createVerticalStrut(15));

                    myPanel.add(new JLabel("Editora:"));
                    myPanel.add(Field4_liv);
                    myPanel.add(Box.createVerticalStrut(15));

                    myPanel.add(new JLabel("Autor:"));
                    myPanel.add(Field5_liv);
                    myPanel.add(Box.createVerticalStrut(15));

                    int result = JOptionPane.showConfirmDialog(null, myPanel, 
                               "Cadastro Livro", JOptionPane.PLAIN_MESSAGE);

                    if (result == JOptionPane.OK_OPTION) {
                        System.out.println("Valores Salvos:\n"+
                                           Field1_liv.getText()+"\n"+
                                           Field2_liv.getText()+"\n"+
                                           Field3_liv.getText()+"\n"+        
                                           Field4_liv.getText()+"\n"+        
                                           Field5_liv.getText()+"\n");}

                    liv.setEdicao(Field1_liv.getText());
                    liv.setCusto(Float.parseFloat(Field2_liv.getText()));
                    liv.setTitulo(Field3_liv.getText());
                    liv.setEditora(edit);
                    liv.setAutor(aut);
                    
                    try{
                        entityManager.persist(liv);
                        entityManager.getTransaction().commit();
                    } catch(Exception e) {
                        entityManager.getTransaction().rollback();
            
                    }
                    entityManager.close();    
                } else if(opcao == "Visualizar") {
                    String var;
                    
                    Autor aut = new Autor();
                    aut = entityManager.find(Autor.class, var = JOptionPane.showInputDialog("Digite o código do Autor"));

                    System.out.println("Código Autor: "+aut.getCodigo_Aut()+"\n"+
                                       "Nome: "+aut.getNome_Aut()+"\n"+
                                       "Email: "+aut.getEmail()+"\n");    
                } else {
                    JOptionPane optionPane = new JOptionPane("Error!", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Opção Inválida");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);                    
                }
                break;
            default:
                JOptionPane optionPane = new JOptionPane("Error!", JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog("Opção Inválida");
                dialog.setAlwaysOnTop(true);
                dialog.setVisible(true);
        }
    }
}