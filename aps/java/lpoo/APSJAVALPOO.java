package aps.java.lpoo;

import java.sql.*;

import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        String username = "root";
        String password = "password";
        String serverName = "localhost:3306";
        String database = "quiz";
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://" + serverName + "/" + database + "?allowMultiQueries=true";

        ArrayList<Question> questions = new ArrayList<Question>();
        questions.add(new Question("", ""));

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Deseja usar um banco de dados? S/N \n");

        String use_database = keyboardInput.nextLine().trim().toUpperCase();

        System.out.println("Digite o tema desejado: \n"
                + "1 - Energia Solar\n2 - Energia Hidráulica \n3 - Energia Eólica \n4 - Outros \n");

        String select = keyboardInput.nextLine();

        if (use_database.equals("S")) {
            try {
                Class.forName(driver);
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stmt = con.createStatement();
    
                Boolean questions_conn = false;
                ArrayList<Integer> alternative_ID_array = new ArrayList<Integer>();
                ArrayList<Integer> answers = new ArrayList<Integer>();
                ArrayList<String> displayQuestions = new ArrayList<String>();
    
                try {
                    ResultSet question = stmt.executeQuery("SELECT * from questions where theme_ID=" + select + ";");
    
                    while (question.next()) {
                        alternative_ID_array.add(question.getInt("alternative_ID"));
                        displayQuestions.add(question.getString("question"));
                        answers.add(question.getInt("answer"));
                    }
    
                    question.close();
                    questions_conn = true;
                } catch (Exception e) {
                    System.err.println(e);
                }
    
                if (questions_conn) {                
                    try {
                        for (int i = 0; i < answers.size(); i++) {
                            ResultSet alternatives = stmt.executeQuery(
                                "SELECT * from alternatives where id=" + alternative_ID_array.get(i) + ";");
            
                            while (alternatives.next()) {
                                displayQuestions.set(i, displayQuestions.get(i)
                                        + "\n1 - " + alternatives.getString("alternative1")
                                        + "\n2 - " + alternatives.getString("alternative2")
                                        + "\n3 - " + alternatives.getString("alternative3")
                                        + "\n4 - " + alternatives.getString("alternative4")
                                        + "\n5 - " + alternatives.getString("alternative5") + "\n");
                            };
            
                            questions.add(new Question(displayQuestions.get(i), Integer.toString(answers.get(i))));
                            alternatives.close();
                        }
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
            String q1 = "Pergunta: \n" 
            + "1 - Fontes Renovaveis\n2 - Lixo \n3 - Impactos Humanos \n4 - Aquecimento Global \n5 - Queimadas\n";
    
            String q2 = "Pergunta: \n" 
                + "1 - Energia Eólica\n2 - Biomassa \n3 - Energia Geotérmica \n4 - Energia Oceânica \n5 - Energia Solar\n";
    
            String q3 = "Pergunta: \n" 
                + "1 - Beneficios\n2 - Desvantagens \n3 - Custo Beneficio \n4 - Curiosidades \n5 - N'ao sei \n0";
    
            questions.add(new Question(q1, "1"));
            questions.add(new Question(q2, "1"));
            questions.add(new Question(q3, "1"));
        }

        createTest(questions.toArray(new Question[questions.size()]));
    }

    public static void createTest(Question[] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);

        for (int i = 1; i < questions.length; i++) {
            System.out.println(questions[i].prompt);

            if (i != 1) {
                System.out.println("0 - Voltar");
            }

            String answer = keyboardInput.nextLine();

            if (i != 1 && answer.equals("0")) {
                i -= 2;
            }

            questions[i].hit = answer.equals(questions[i].answer) ? true : false;
        }

        for (Question q : questions) {
            score += q.hit ? 1 : 0;
        }

        System.out.println("Sua pontuação foi " + score + "/" + (questions.length - 1));
    }
}