package QuizLPOO;

import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Database Configuration
        String username = "root";
        String password = "password";
        String serverName = "localhost:3306";
        String database = "quiz";
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://" + serverName + "/" + database + "?allowMultiQueries=true";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nQuiz - APS \n\n");
        System.out.println("Deseja usar um banco de dados? S/N \n");
        String use_database = scanner.nextLine().trim().toUpperCase();

        int opc = -1;
        while (opc != 0) {           
            System.out.println("Digite o tema desejado:\n1 - Energia Eolica ");
            System.out.println("2 - Energia Hidrelétrica \n3 - Energia Solar \n4 - Outros \n0 - Sair");

            opc = scanner.nextInt();

            if (use_database.equals("S")) {
                try {
                    Class.forName(driver);
                    Connection con = DriverManager.getConnection(url, username, password);
                    Statement stmt = con.createStatement();
        
                    Boolean questions_conn = false;
                    ArrayList<Integer> alternative_ID_array = new ArrayList<Integer>();
                    ArrayList<Integer> answers = new ArrayList<Integer>();
                    ArrayList<String> questions = new ArrayList<String>();
        
                    try {
                        ResultSet question = stmt.executeQuery("SELECT * from questions where theme_ID=" + opc + ";");
        
                        while (question.next()) {
                            alternative_ID_array.add(question.getInt("alternative_ID"));
                            questions.add(question.getString("question"));
                            answers.add(question.getInt("answer"));
                        }
        
                        question.close();
                        questions_conn = true;
                    } catch (Exception e) {
                        System.err.println(e);
                    }
        
                    if (questions_conn) {                
                        try {
                            int correct = 0;
                            int incorrect = 0;

                            for (int i = 0; i < answers.size(); i++) {
                                ResultSet alternatives = stmt.executeQuery(
                                    "SELECT * from alternatives where id=" + alternative_ID_array.get(i) + ";");
                
                                while (alternatives.next()) {                 
                                    Pergunta p = new Pergunta(questions.get(i));
                                    p.alter("1 - " + alternatives.getString("alternative1"));
                                    p.alter("2 - " + alternatives.getString("alternative2"));
                                    p.alter("3 - " + alternatives.getString("alternative3"));
                                    p.alter("4 - " + alternatives.getString("alternative4"));
                                    p.alter("5 - " + alternatives.getString("alternative5"));
                                    p.setCerta(answers.get(i));
    
                                    int resposta = scanner.nextInt();
                                    if (resposta == p.getCerta()) {
                                        System.out.println("Certa");
                                        correct++;
                                    } else {
                                        System.out.println("Errado");
                                        incorrect++;
                                    }
                                };
                                alternatives.close();
                            }

                            System.out.println("\n Acertos: " + correct);
                            System.out.println("\n Erros: " + incorrect);

                        } catch (Exception e) {
                            System.err.println(e);
                        }
                    }
        
                    stmt.close();
                    con.close();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
            
            else if (use_database.equals("N")) {
                Eolica tema1 = new Eolica();
                Hidreletrica tema2 = new Hidreletrica();
                Solar tema3 = new Solar();
                Outros tema4 = new Outros();
                
                switch (opc) {
    
                    case Eolica.id:
                        tema1.potenciaDoAparelho();
                        tema1.criaQuiz();

                        break;
                    case Hidreletrica.id:
                        tema2.potenciaDoAparelho();
                        tema2.criaQuiz();

                        break;
                    case Solar.id:
                        tema3.potenciaDoAparelho();
                        tema3.criaQuiz();

                        break;
                    case Outros.id:
                        tema4.criaQuiz();

                        break;
                }
            }

            System.out.println("\n\nContinuar?");
            System.out.println("0 - Nao");
            System.out.println("1 - Sim");
            opc = scanner.nextInt();
        }
    }
}
