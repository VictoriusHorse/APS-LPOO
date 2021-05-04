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
            System.out.println("Digite o tema desejado:\n1 - Energia Solar ");
            System.out.println("2 - Energia Hidráulica \n3 - Energia Eolica \n4 - Outros \n0 - Sair");

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
                switch (opc) {
    
                    case 1:
                        int correct = 0;
                        int incorrect = 0;
    
                        Pergunta p1 = new Pergunta("O que são combustíveis fósseis?");
                        p1.alter("1 - Fontes de energia não renovável");
                        p1.alter("2 - Fontes de energia renovável");
                        p1.alter("3 - Mecanismo de desenvolvimento limpo");
                        p1.alter("2 - Energia renovável");
                        p1.alter("5 - Energia limpa");
                        p1.setCerta(1);
                        int resposta = scanner.nextInt();
                        if (resposta == p1.getCerta()) {
                            System.out.println("Certa");
                            correct++;
                        } else {
                            System.out.println("Errado");
                            incorrect++;
                        }
    
                        Pergunta p2 = new Pergunta("Qual dessas abaixo não é uma fonte de energia renovável?");
                        p2.alter("1 - Energia Solar");
                        p2.alter("2 - Energia Geotérmica");
                        p2.alter("3 - Energia Nuclear");
                        p2.alter("4 - Energia ondomotriz");
                        p2.alter("5 - Energia da biomassa");
                        p2.setCerta(3);
                        int resposta2 = scanner.nextInt();
                        if (resposta2 == p2.getCerta()) {
                            System.out.println("Certa");
                            correct++;
                        } else {
                            System.out.println("Errado");
                            incorrect++;
                        }
    
                        Pergunta p3 = new Pergunta("Qual dessas é a energia renovável mais usada no mundo?");
                        p3.alter("1 - Energia Eólica");
                        p3.alter("2 - Energia Hídrica");
                        p3.alter("3 - Energia Nuclear");
                        p3.alter("4 - Petróleo");
                        p3.alter("5 - Energia Sísmicas");
                        p3.setCerta(2);
                        int resposta3 = scanner.nextInt();
                        if (resposta3 == p3.getCerta()) {
                            System.out.println("Certa");
                            correct++;
                        } else {
                            System.out.println("Errado");
                            incorrect++;
                        }
    
                        Pergunta p4 = new Pergunta("Quais dessas não é uma vantagem da energia renovável");
                        p4.alter("1 - Reduz a emissão de gás CO2");
                        p4.alter("2 - Impacto ambiental menor");
                        p4.alter("3 - É inesgotável");
                        p4.alter("4 - Custo elevado de investimento e infra - estrutura");
                        p4.alter("5 - Oferece mais risco que a energia nuclear");
                        p4.setCerta(4);
                        int resposta4 = scanner.nextInt();
                        if (resposta4 == p4.getCerta()) {
                            System.out.println("Certa");
                            correct++;
                        } else {
                            System.out.println("Errado");
                            incorrect++;
                        }
    
                        Pergunta p5 = new Pergunta("Em que ano as energia renováveis ganharam forças no Brasil?");
                        p5.alter("1 - 1987");
                        p5.alter("2 - 2000");
                        p5.alter("3 - 2005");
                        p5.alter("4 - 1994");
                        p5.alter("5 - 1970");
                        p5.setCerta(5);
                        int resposta5 = scanner.nextInt();
                        if (resposta5 == p5.getCerta()) {
                            System.out.println("Certa");
                            correct++;
                        } else {
                            System.out.println("Errado");
                            incorrect++;
                        }
    
                        System.out.println("\n Acertos: " + correct);
                        System.out.println("\n Erros: " + incorrect);
    
                        break;
    
                    case 2:
                        int correct1 = 0;
                        int incorrect1 = 0;
    
                        Pergunta p6 = new Pergunta("Qual país do brasil produz mais energia solar?");
                        p6.alter("1 - Minas Gerais");
                        p6.alter("2 - São Paulo");
                        p6.alter("3 - Rio de Janeiro");
                        p6.alter("4 - Santa Catarina");
                        p6.alter("5 - Amazonas");
                        p6.setCerta(1);
                        int resposta6 = scanner.nextInt();
                        if (resposta6 == p6.getCerta()) {
                            System.out.println("Certa");
                            correct1++;
                        } else {
                            System.out.println("Errado");
                            incorrect1++;
                        }
    
                        Pergunta p7 = new Pergunta("Em que ano surgiu a energia solar");
                        p7.alter("1 - 1950");
                        p7.alter("2 - 1830");
                        p7.alter("3 - 1954");
                        p7.alter("4 - 1902");
                        p7.alter("5 - 1754");
                        p7.setCerta(3);
                        int resposta7 = scanner.nextInt();
                        if (resposta7 == p7.getCerta()) {
                            System.out.println("Certa");
                            correct1++;
                        } else {
                            System.out.println("Errado");
                            incorrect1++;
                        }
    
                        Pergunta p8 = new Pergunta("Qual é o país que mais produz energia solar no Mundo?");
                        p8.alter("1 - E.U.A");
                        p8.alter("2 - Brasil");
                        p8.alter("3 - Rússia");
                        p8.alter("4 - Equador");
                        p8.alter("5 - China");
                        p8.setCerta(5);
                        int resposta8 = scanner.nextInt();
                        if (resposta8 == p8.getCerta()) {
                            System.out.println("Certa");
                            correct1++;
                        } else {
                            System.out.println("Errado");
                            incorrect1++;
                        }
    
                        Pergunta p9 = new Pergunta("Qual dessas é uma vantagem da energia solar?");
                        p9.alter("1 - É uma energia fóssil");
                        p9.alter("2 - Baixo impacto ambiental");
                        p9.alter("3 - Baixo custo de aquisição inicial");
                        p9.alter("4 - Muitos estudos sobre o impacto que vem do descarte dos painéis velhos");
                        p9.alter("5 - Pode ser muito aproveitada durante a noite");
                        p9.setCerta(2);
                        int resposta9 = scanner.nextInt();
                        if (resposta9 == p9.getCerta()) {
                            System.out.println("Certa");
                            correct1++;
                        } else {
                            System.out.println("Errado");
                            incorrect1++;
                        }
    
                        Pergunta p10 = new Pergunta("Aonde foi realizado o primeiro voo a energia solar?");
                        p10.alter("1 - Nova York");
                        p10.alter("2 - São Paulo");
                        p10.alter("3 - Rio de Janeiro");
                        p10.alter("4 - Califórnia");
                        p10.alter("5 - Hong Kong");
                        p10.setCerta(4);
                        int resposta10 = scanner.nextInt();
                        if (resposta10 == p10.getCerta()) {
                            System.out.println("Certa");
                            correct1++;
                        } else {
                            System.out.println("Errado");
                            incorrect1++;
                        }
    
                        System.out.println("\n Acertos: " + correct1);
                        System.out.println("\n Erros: " + incorrect1);
    
                        break;
    
                    case 3:
                        int correct2 = 0;
                        int incorrect2 = 0;
    
                        Pergunta p11 = new Pergunta("Energia eólica foi considerada pela ONU como o que?");
                        p11.alter("1 - Energia não renovável");
                        p11.alter("2 - É uma energia fóssil");
                        p11.alter("3 - Mecanismo de desenvolvimento limpo");
                        p11.alter("4 - Energia nuclear");
                        p11.alter("5 - Energia orgânica");
                        p11.setCerta(3);
                        int resposta11 = scanner.nextInt();
                        if (resposta11 == p11.getCerta()) {
                            System.out.println("Certa");
                            correct2++;
                        } else {
                            System.out.println("Errado");
                            incorrect2++;
                        }
    
                        Pergunta p12 = new Pergunta("Qual região do brasil produz mais energia eólica?");
                        p12.alter("1 - Centro-Oeste");
                        p12.alter("2 - Sul");
                        p12.alter("3 - Norte");
                        p12.alter("4 - Nordeste");
                        p12.alter("5 - Sudeste");
                        p12.setCerta(4);
                        int resposta12 = scanner.nextInt();
                        if (resposta12 == p12.getCerta()) {
                            System.out.println("Certa");
                            correct2++;
                        } else {
                            System.out.println("Errado");
                            incorrect2++;
                        }
    
                        Pergunta p13 = new Pergunta("Há quantos anos a energia eólica é conhecida?");
                        p13.alter("1 - 3000 anos");
                        p13.alter("2 - 2000 anos");
                        p13.alter("3 - 5000 anos");
                        p13.alter("4 - 1000 anos");
                        p13.alter("5 - 500 anos");
                        p13.setCerta(1);
                        int resposta13 = scanner.nextInt();
                        if (resposta13 == p12.getCerta()) {
                            System.out.println("Certa");
                            correct2++;
                        } else {
                            System.out.println("Errado");
                            incorrect2++;
                        }
    
                        Pergunta p14 = new Pergunta("Qual é o país que mais produz energia eólica no Mundo?");
                        p14.alter("1 - E.U.A");
                        p14.alter("2 - Brasil");
                        p14.alter("3 - Rússia");
                        p14.alter("4 - Equador");
                        p14.alter("5 - China");
                        p14.setCerta(5);
                        int resposta14 = scanner.nextInt();
                        if (resposta14 == p14.getCerta()) {
                            System.out.println("Certa");
                            correct2++;
                        } else {
                            System.out.println("Errado");
                            incorrect2++;
                        }
    
                        Pergunta p15 = new Pergunta("Cite uma desvantagem da energia eólica");
                        p15.alter("1 - Emite gases que aumentam efeito estufa");
                        p15.alter("2 - Impactos a fauna e visual");
                        p15.alter("3 - Emite gases");
                        p15.alter("4 - Diminui a autonomia do país em gerar energia");
                        p15.alter("5 - Instalação demorada das turbinas");
                        p15.setCerta(4);
                        int resposta15 = scanner.nextInt();
                        if (resposta15 == p15.getCerta()) {
                            System.out.println("Certa");
                            correct2++;
                        } else {
                            System.out.println("Errado");
                            incorrect2++;
                        }
    
                        System.out.println("\n Acertos: " + correct2);
                        System.out.println("\n Erros: " + incorrect2);
    
                        break;
    
                    case 4:
                        int correct3 = 0;
                        int incorrect3 = 0;
    
                        Pergunta p16 = new Pergunta("Pergunta Spobre aq");
                        p16.alter("Pergunta 1");
                        p16.alter("Pergunta 2");
                        p16.alter("Pergunta 3");
                        p16.alter("Pergunta 4");
                        p16.alter("Pergunta 5");
                        p16.setCerta(1);
                        int resposta16 = scanner.nextInt();
                        if (resposta16 == p16.getCerta()) {
                            System.out.println("Certa");
                            correct3++;
                        } else {
                            System.out.println("Errado");
                            incorrect3++;
                        }
    
                        Pergunta p17 = new Pergunta("Pergunta 2");
                        p17.alter("Pergunta 1");
                        p17.alter("Pergunta 2");
                        p17.alter("Pergunta 3");
                        p17.alter("Pergunta 4");
                        p17.alter("Pergunta 5");
                        p17.setCerta(2);
                        int resposta17 = scanner.nextInt();
                        if (resposta17 == p17.getCerta()) {
                            System.out.println("Certa");
                            correct3++;
                        } else {
                            System.out.println("Errado");
                            incorrect3++;
                        }
    
                        Pergunta p18 = new Pergunta("Pergunta 3");
                        p18.alter("Pergunta 1");
                        p18.alter("Pergunta 2");
                        p18.alter("Pergunta 3");
                        p18.alter("Pergunta 4");
                        p18.alter("Pergunta 5");
                        p18.setCerta(3);
                        int resposta18 = scanner.nextInt();
                        if (resposta18 == p18.getCerta()) {
                            System.out.println("Certa");
                            correct3++;
                        } else {
                            System.out.println("Errado");
                            incorrect3++;
                        }
    
                        Pergunta p19 = new Pergunta("Pergunta 4");
                        p19.alter("Pergunta 1");
                        p19.alter("Pergunta 2");
                        p19.alter("Pergunta 3");
                        p19.alter("Pergunta 4");
                        p19.alter("Pergunta 5");
                        p19.setCerta(4);
                        int resposta19 = scanner.nextInt();
                        if (resposta19 == p19.getCerta()) {
                            System.out.println("Certa");
                            correct3++;
                        } else {
                            System.out.println("Errado");
                            incorrect3++;
                        }
    
                        Pergunta p20 = new Pergunta("Pergunta 5");
                        p20.alter("Pergunta 1");
                        p20.alter("Pergunta 2");
                        p20.alter("Pergunta 3");
                        p20.alter("Pergunta 4");
                        p20.alter("Pergunta 5");
                        p20.setCerta(5);
                        int resposta20 = scanner.nextInt();
                        if (resposta20 == p20.getCerta()) {
                            System.out.println("Certa");
                            correct3++;
                        } else {
                            System.out.println("Errado");
                            incorrect3++;
                        }
    
                        System.out.println("\n Acertos: " + correct3);
                        System.out.println("\n Erros: " + incorrect3);
    
                        break;
    
                    case 5:
                        int correct4 = 0;
                        int incorrect4 = 0;
    
                        Pergunta p21 = new Pergunta("Pergunta Spobre aq");
                        p21.alter("Pergunta 1");
                        p21.alter("Pergunta 2");
                        p21.alter("Pergunta 3");
                        p21.alter("Pergunta 4");
                        p21.alter("Pergunta 5");
                        p21.setCerta(1);
                        int resposta21 = scanner.nextInt();
                        if (resposta21 == p21.getCerta()) {
                            System.out.println("Certa");
                            correct4++;
                        } else {
                            System.out.println("Errado");
                            incorrect4++;
                        }
    
                        Pergunta p22 = new Pergunta("Pergunta 2");
                        p22.alter("Pergunta 1");
                        p22.alter("Pergunta 2");
                        p22.alter("Pergunta 3");
                        p22.alter("Pergunta 4");
                        p22.alter("Pergunta 5");
                        p22.setCerta(2);
                        int resposta22 = scanner.nextInt();
                        if (resposta22 == p22.getCerta()) {
                            System.out.println("Certa");
                            correct4++;
                        } else {
                            System.out.println("Errado");
                            incorrect4++;
                        }
    
                        Pergunta p23 = new Pergunta("Pergunta 3");
                        p23.alter("Pergunta 1");
                        p23.alter("Pergunta 2");
                        p23.alter("Pergunta 3");
                        p23.alter("Pergunta 4");
                        p23.alter("Pergunta 5");
                        p23.setCerta(3);
                        int resposta23 = scanner.nextInt();
                        if (resposta23 == p22.getCerta()) {
                            System.out.println("Certa");
                            correct4++;
                        } else {
                            System.out.println("Errado");
                            incorrect4++;
                        }
    
                        Pergunta p24 = new Pergunta("Pergunta 4");
                        p24.alter("Pergunta 1");
                        p24.alter("Pergunta 2");
                        p24.alter("Pergunta 3");
                        p24.alter("Pergunta 4");
                        p24.alter("Pergunta 5");
                        p24.setCerta(4);
                        int resposta24 = scanner.nextInt();
                        if (resposta24 == p24.getCerta()) {
                            System.out.println("Certa");
                            correct4++;
                        } else {
                            System.out.println("Errado");
                            incorrect4++;
                        }
    
                        Pergunta p25 = new Pergunta("Pergunta 5");
                        p25.alter("Pergunta 1");
                        p25.alter("Pergunta 2");
                        p25.alter("Pergunta 3");
                        p25.alter("Pergunta 4");
                        p25.alter("Pergunta 5");
                        p25.setCerta(5);
                        int resposta25 = scanner.nextInt();
                        if (resposta25 == p25.getCerta()) {
                            System.out.println("Certa");
                            correct4++;
                        } else {
                            System.out.println("Errado");
                            incorrect4++;
                        }
    
                        System.out.println("\n Acertos: " + correct4);
                        System.out.println("\n Erros: " + incorrect4);
    
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
