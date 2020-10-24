package utility;

import data.*;
import hibernate.*;
import javax.swing.*;

public class Menu {
    
    public void showMenuCad(String tabela) {    
        switch (tabela){
            case "hibernate.Livro":
                JTextField Field1 = new JTextField(5);
                JTextField Field2 = new JTextField(5);
                JTextField Field3 = new JTextField(5);
                JTextField Field4 = new JTextField(5);
                JTextField Field5 = new JTextField(5);
                JTextField Field6 = new JTextField(5);

                JPanel myPanel = new JPanel();
                myPanel.add(new JLabel("ISBN:"));
                myPanel.add(Field1);
                myPanel.add(Box.createVerticalStrut(15)); // a spacer

                myPanel.add(new JLabel("Edição:"));
                myPanel.add(Field2);
                myPanel.add(Box.createVerticalStrut(15)); // a spacer

                myPanel.add(new JLabel("Custo:"));
                myPanel.add(Field3);
                myPanel.add(Box.createVerticalStrut(15)); // a spacer

                myPanel.add(new JLabel("Título:"));
                myPanel.add(Field4);
                myPanel.add(Box.createVerticalStrut(15)); // a spacer

                myPanel.add(new JLabel("Editora:"));
                myPanel.add(Field5);
                myPanel.add(Box.createVerticalStrut(15)); // a spacer

                myPanel.add(new JLabel("Autor:"));
                myPanel.add(Field6);
                myPanel.add(Box.createVerticalStrut(15)); // a spacer

                int result = JOptionPane.showConfirmDialog(null, myPanel, 
                           "Cadastro Livro", JOptionPane.PLAIN_MESSAGE);

                if (result == JOptionPane.OK_OPTION) {
                    System.out.println("Valores Salvos:\n"+
                                       Field1.getText()+"\n"+
                                       Field2.getText()+"\n"+
                                       Field3.getText()+"\n"+        
                                       Field4.getText()+"\n"+        
                                       Field5.getText()+"\n"+                                                    
                                       Field6.getText()+"\n");

                    Livro liv = new Livro();
                    LivroData livData = new LivroData();

                    liv.setISBN(Integer.parseInt(Field1.getText()));
                    liv.setEdicao(Field2.getText());
                    liv.setCusto(Float.parseFloat(Field3.getText()));
                    liv.setTitulo(Field4.getText());
                    liv.setEditora(Integer.parseInt(Field5.getText()));
                    liv.setAutor(Integer.parseInt(Field6.getText()));

                    livData.create(liv); 
                }                
                break;
            case "hibernate.Autor":
                JTextField Field1_aut = new JTextField(5);
                JTextField Field2_aut = new JTextField(5);
                JTextField Field3_aut = new JTextField(5);

                JPanel myPanel_aut = new JPanel();
                myPanel_aut.add(new JLabel("Código:"));
                myPanel_aut.add(Field1_aut);
                myPanel_aut.add(Box.createVerticalStrut(15)); // a spacer

                myPanel_aut.add(new JLabel("Nome:"));
                myPanel_aut.add(Field2_aut);
                myPanel_aut.add(Box.createVerticalStrut(15)); // a spacer

                myPanel_aut.add(new JLabel("Email:"));
                myPanel_aut.add(Field3_aut);
                myPanel_aut.add(Box.createVerticalStrut(15)); // a spacer

                int result_aut = JOptionPane.showConfirmDialog(null, myPanel_aut, 
                           "Cadastro Livro", JOptionPane.PLAIN_MESSAGE);

                if (result_aut == JOptionPane.OK_OPTION) {
                    System.out.println("Valores Salvos:\n"+
                                       Field1_aut.getText()+"\n"+
                                       Field2_aut.getText()+"\n"+
                                       Field3_aut.getText()+"\n");

                    Autor aut = new Autor();
                    AutorData autData = new AutorData();

                    aut.setCodigo_Aut(Integer.parseInt(Field1_aut.getText()));
                    aut.setNome_Aut(Field2_aut.getText());
                    aut.setEmail(Integer.parseInt(Field3_aut.getText()));

                    autData.create(aut); 
                }
                break;
            case "hibernate.Editora":
                JTextField Field1_edit = new JTextField(5);
                JTextField Field2_edit = new JTextField(5);
                JTextField Field3_edit = new JTextField(5);

                JPanel myPanel_edit = new JPanel();
                myPanel_edit.add(new JLabel("Código:"));
                myPanel_edit.add(Field1_edit);
                myPanel_edit.add(Box.createVerticalStrut(15)); // a spacer

                myPanel_edit.add(new JLabel("Nome:"));
                myPanel_edit.add(Field2_edit);
                myPanel_edit.add(Box.createVerticalStrut(15)); // a spacer

                myPanel_edit.add(new JLabel("Livro:"));
                myPanel_edit.add(Field3_edit);
                myPanel_edit.add(Box.createVerticalStrut(15)); // a spacer

                int result_edit = JOptionPane.showConfirmDialog(null, myPanel_edit, 
                           "Cadastro Livro", JOptionPane.PLAIN_MESSAGE);

                if (result_edit == JOptionPane.OK_OPTION) {
                    System.out.println("Valores Salvos:\n"+
                                       Field1_edit.getText()+"\n"+
                                       Field2_edit.getText()+"\n"+
                                       Field3_edit.getText()+"\n");

                    Editora edit = new Editora();
                    EditoraData editData = new EditoraData();

                    edit.setCodigo_Edit(Integer.parseInt(Field1_edit.getText()));
                    edit.setNome_Edit(Field2_edit.getText());
                    edit.setLivro(Integer.parseInt(Field3_edit.getText()));

                    editData.create(edit); 
                }
                break;
            case "hibernate.Email":
                JTextField Field1_email = new JTextField(5);
                JTextField Field2_email = new JTextField(5);
                JTextField Field3_email = new JTextField(5);

                JPanel myPanel_email = new JPanel();
                myPanel_email.add(new JLabel("Código Email:"));
                myPanel_email.add(Field1_email);
                myPanel_email.add(Box.createVerticalStrut(15)); // a spacer

                myPanel_email.add(new JLabel("Email:"));
                myPanel_email.add(Field2_email);
                myPanel_email.add(Box.createVerticalStrut(15)); // a spacer

                myPanel_email.add(new JLabel("Código Autor:"));
                myPanel_email.add(Field3_email);
                myPanel_email.add(Box.createVerticalStrut(15)); // a spacer

                int result_email = JOptionPane.showConfirmDialog(null, myPanel_email, 
                           "Cadastro Livro", JOptionPane.PLAIN_MESSAGE);

                if (result_email == JOptionPane.OK_OPTION) {
                    System.out.println("Valores Salvos:\n"+
                                       Field1_email.getText()+"\n"+
                                       Field2_email.getText()+"\n"+
                                       Field3_email.getText()+"\n");

                    Email email = new Email();
                    EmailData emailData = new EmailData();

                    email.setCodigo_Email(Integer.parseInt(Field1_email.getText()));
                    email.setEmail(Field2_email.getText());
                    email.setCodigo_Aut(Integer.parseInt(Field3_email.getText()));

                    emailData.create(email); 
                }
                break;
            default:
                System.out.println("Error!\nOpção selecionada inválida!!!");
        }
    }
}
