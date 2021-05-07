package QuizLPOO;
import java.util.Scanner;

abstract class Tema {
  public abstract void criaQuiz();

  public void potenciaDoAparelho() {
    System.out.println("\nPotência do aparelho: \n");
  };
}

class Eolica extends Tema {
  public final static int id = 1;

  public void criaQuiz() {
    Scanner scanner = new Scanner(System.in);
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
  }

  public void potenciaDoAparelho() {
    System.out.println("\nPotência do aparelho: 2MW\n");
  }
}

class Hidreletrica extends Tema {
  public final static int id = 2;

  public void criaQuiz() {
    Scanner scanner = new Scanner(System.in);
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
  }

  public void potenciaDoAparelho() {
    System.out.println("\nPotência do aparelho: 1MW à 30MW para pequenas centrais\n");
  }
}

class Solar extends Tema {
  public final static int id = 3;

  public void criaQuiz() {
    Scanner scanner = new Scanner(System.in);
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
  }
  
  public void potenciaDoAparelho() {
    System.out.println("\nPotência do aparelho: 100W à 350W\n");
  }
}

class Outros extends Tema {
  public final static int id = 4;

  public void criaQuiz() {
    Scanner scanner = new Scanner(System.in);

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
  }
}