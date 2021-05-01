package aps.java.lpoo;
import java.sql.*;

import java.util.Scanner;

class Energia {

}

class energianuclear extends Energia {

}

class Main {
    public static void main (String [] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT Name from country where Population<10000;");
            while(rs.next()) {
                System.out.println(rs.getString(1));
            }
            con.close();
        }
        catch(Exception e) {
            System.err.println(e);
        }

        String q1 = "Digite o tema desejado: \n" 
            + "1 - Fontes Renovaveis\n2 - Lixo \n3 - Impactos Humanos \n4 - Aquecimento Global \n5 - Queimadas\n";

        String q2 = "Digite o tema desejado: \n" 
            + "1 - Energia Eólica\n2 - Biomassa \n3 - Energia Geotérmica \n4 - Energia Oceânica \n5 - Energia Solar\n";

        String q3 = "Digite o tema desejado: \n" 
            + "1 - Beneficios\n2 - Desvantagens \n3 - Custo Beneficio \n4 - Curiosidades \n5 - N'ao sei \n0";

        Question [] questions = {
            new Question("", ""), // Go back handling
            new Question(q1, "1"),
            new Question(q2, "1"),
            new Question(q3, "1"),
        };

        createTest(questions);
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
