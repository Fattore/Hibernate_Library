package run;

import hibernate.*;
import data.*;
import javax.swing.JOptionPane;
import utility.Menu;

public class TesteHibernate {
    
    public static void main(String[] args){
        Menu menu = new Menu();
        
        String tipo;
        
        tipo = JOptionPane.showInputDialog("Em qual tabela deseja mexer?\n>Livro\n>Editora\n>Autor\n>Email");
        if (tipo.equals("Livro")) {
            Livro liv = new Livro();
            LivroData livData = new LivroData();
            
            tipo = JOptionPane.showInputDialog("Qual opção deseja executar:\n>Cadastrar\n>Visualizar\n>Atualizar\n>Deletar");
            switch (tipo) {
                case "Cadastrar":
                    menu.showMenuCad(liv.getClass().getName());
                    break;
                case "Visualizar":
                    String opcao = JOptionPane.showInputDialog("Digite o ID");

                    livData.read(liv, Integer.parseInt(opcao));
                    break;
                case "Atualizar":
                    break;
                case "Deletar":
                    break;
                default:
                    System.out.println("Error!\nOpção selecionada inválida!!!");
            }
        } else if (tipo.equals("Editora")) {
            Editora edit = new Editora();
            EditoraData editData = new EditoraData();
            
            tipo = JOptionPane.showInputDialog("Qual opção deseja executar:\n>Cadastrar\n>Visualizar\n>Atualizar\n>Deletar");
            switch (tipo) {
                case "Cadastrar":
                    menu.showMenuCad(edit.getClass().getName());
                    break;
                case "Visualizar":
                    String opcao = JOptionPane.showInputDialog("Digite o ID");

                    editData.read(edit, Integer.parseInt(opcao));
                    break;
                case "Atualizar":
                    break;
                case "Deletar":
                    break;
                default:
                    System.out.println("Error!\nOpção selecionada inválida!!!");
            }              
        } else if (tipo.equals("Autor")) {
            Autor aut = new Autor();
            AutorData autData = new AutorData();
            
            tipo = JOptionPane.showInputDialog("Qual opção deseja executar:\n>Cadastrar\n>Visualizar\n>Atualizar\n>Deletar");
            switch (tipo) {
                case "Cadastrar":
                    menu.showMenuCad(aut.getClass().getName());
                    break;
                case "Visualizar":
                    String opcao = JOptionPane.showInputDialog("Digite o ID");

                    autData.read(aut, Integer.parseInt(opcao));
                    break;
                case "Atualizar":
                    break;
                case "Deletar":
                    break;
                default:
                    System.out.println("Error!\nOpção selecionada inválida!!!");
            }            
        } else if (tipo.equals("Email")) {
            Email email = new Email();
            EmailData emailData = new EmailData();
            
            tipo = JOptionPane.showInputDialog("Qual opção deseja executar:\n>Cadastrar\n>Visualizar\n>Atualizar\n>Deletar");
            switch (tipo) {
                case "Cadastrar":
                    menu.showMenuCad(email.getClass().getName());
                    break;
                case "Visualizar":
                    String opcao = JOptionPane.showInputDialog("Digite o ID");

                    emailData.read(email, Integer.parseInt(opcao));
                    break;
                case "Atualizar":
                    break;
                case "Deletar":
                    break;
                default:
                    System.out.println("Error!\nOpção selecionada inválida!!!");
            }                
        } else {
            System.out.println("Error!\nOpção selecionada inválida!!!");
        }   
    }
}
