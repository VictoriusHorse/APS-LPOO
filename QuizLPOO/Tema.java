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

    Pergunta p1 = new Pergunta("Energia eólica foi considerada pela ONU como o que?");
    p1.alter("1 - Energia não renovável");
    p1.alter("2 - É uma energia fóssil");
    p1.alter("3 - Mecanismo de desenvolvimento limpo");
    p1.alter("2 - Energia nuclear");
    p1.alter("5 - Energia orgânica");
    p1.setCerta(3);
    int resposta = scanner.nextInt();
    if (resposta == p1.getCerta()) {
        System.out.println("Correto! Pois essa fonte de energia não gera gases que contribuem para o efeito estufa.");
        correct++;
    } else {
        System.out.println("Errado");
        incorrect++;
    }

    Pergunta p2 = new Pergunta("Qual região do brasil produz mais energia eólica?");
    p2.alter("1 - Centro-Oeste");
    p2.alter("2 - Sul");
    p2.alter("3 - Norte");
    p2.alter("4 - Nordeste");
    p2.alter("5 - Sudeste");
    p2.setCerta(4);
    int resposta2 = scanner.nextInt();
    if (resposta2 == p2.getCerta()) {
        System.out.println("Correto! Por causa da grande quantidade de ventos que chega ao litoral nordeste vindos do oceano atlântico");
        correct++;
    } else {
        System.out.println("Errado");
        incorrect++;
    }

    Pergunta p3 = new Pergunta("Há quantos anos a energia eólica é conhecida?");
    p3.alter("1 - 3000");
    p3.alter("2 - 2000");
    p3.alter("3 - 1000");
    p3.alter("4 - 5000");
    p3.alter("5 - 550");
    p3.setCerta(1);
    int resposta3 = scanner.nextInt();
    if (resposta3 == p3.getCerta()) {
        System.out.println("Certa");
        correct++;
    } else {
        System.out.println("Errado");
        incorrect++;
    }

    Pergunta p4 = new Pergunta("Qual é o país que mais produz energia eólica no Mundo?");
    p4.alter("1 - E.U.A");
    p4.alter("2 - Brasil");
    p4.alter("3 - Rússia");
    p4.alter("4 - Equador");
    p4.alter("5 - China");
    p4.setCerta(5);
    int resposta4 = scanner.nextInt();
    if (resposta4 == p4.getCerta()) {
        System.out.println("Correto! Devido ao grande investimento chinês nessa fonte de energia, para começar a produzir e distribuir");
        correct++;
    } else {
        System.out.println("Errado");
        incorrect++;
    }

    Pergunta p5 = new Pergunta("Cite uma desvantagem da energia eólica?");
    p5.alter("1 - Emite gases que aumentam efeito estufa");
    p5.alter("2 - Impactos a fauna e visual");
    p5.alter("3 - Emite gases");
    p5.alter("4 - Diminui a autonomia do país em gerar energia");
    p5.alter("5 - Instalação demorada das turbinas");
    p5.setCerta(2);
    int resposta5 = scanner.nextInt();
    if (resposta5 == p5.getCerta()) {
        System.out.println("Correto! Pois os aerogeradores são muito grandes e acabam influenciando as aves do local");
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

    Pergunta p1 = new Pergunta("Quais das alternativas a seguir são uma fonte de energia renovável?");
    p1.alter("1 - Eólica");
    p1.alter("2 - Hídrica/hidráulica");
    p1.alter("3 - Geotérmica");
    p1.alter("2 - Oceânica");
    p1.alter("5 - Todas as alternativas.");
    p1.setCerta(5);
    int resposta = scanner.nextInt();
    if (resposta == p1.getCerta()) {
        System.out.println("Correto! Pois essa fonte de energia não gera gases que contribuem para o efeito estufa.");
        correct++;
    } else {
        System.out.println("Errado");
        incorrect++;
    }

    Pergunta p2 = new Pergunta("Qual o princípio básico das hidrelétricas? ");
    p2.alter("1 - Aproveitamento do potencial hidráulico dos ventos");
    p2.alter("2 - Aproveitamento do potencial hidráulico existente na queima de carvão");
    p2.alter("3 - Aproveitamento do potencial hidráulico existente na queima de carvão");
    p2.alter("4 - Aproveitamento do potencial hidráulico existente em um rio");
    p2.alter("5 - Outro");
    p2.setCerta(4);
    int resposta2 = scanner.nextInt();
    if (resposta2 == p2.getCerta()) {
        System.out.println("Correto! A infraestrutura de uma usina hidroelétrica usa o desnível da agua (altura), vazão do rio (m³/s), aceleração da gravidade (9,81m/s²) para calcular o potencial em KW e assim saber a quantidade de energia fornecida.");
        correct++;
    } else {
        System.out.println("Errado");
        incorrect++;
    }

    Pergunta p3 = new Pergunta("Quais as vantagens das hidrelétricas?");
    p3.alter("1 - Emite poluentes");
    p3.alter("2 - Causam grande impacto ambiental e social");
    p3.alter("3 - Deixa muito resíduos poluentes");
    p3.alter("4 - Através da represa é possível regular a vazão do rio");
    p3.alter("5 - Nenhuma das alternativas");
    p3.setCerta(4);
    int resposta3 = scanner.nextInt();
    if (resposta3 == p3.getCerta()) {
        System.out.println("Correto! Com a construção da usina é possível controlar enchentes e irrigação, ajudando a diminuir desastres naturais em regiões proximas do rio.");
        correct++;
    } else {
        System.out.println("Errado");
        incorrect++;
    }

    Pergunta p4 = new Pergunta("Qual a maior hidrelétrica do mundo e capacidade máxima momentânea (p máximo de energia que pode se gerar em energia ao mesmo tempo)?");
    p4.alter("1 - Itaipu (Brasil)");
    p4.alter("2 - Belo Monte(Brasil)");
    p4.alter("3 - Tucuruí 1 e 2(Brasil)");
    p4.alter("4 - Guri (Venezuela)");
    p4.alter("5 - Três Gargantas (China)");
    p4.setCerta(5);
    int resposta4 = scanner.nextInt();
    if (resposta4 == p4.getCerta()) {
        System.out.println("Correto! Construida em 2012, ela tem  capacidade de 22.500 MW, fornecendo enrgia para nove províncias e duas cidades, incluindo Xangai.");
        correct++;
    } else {
        System.out.println("Errado");
        incorrect++;
    }

    Pergunta p5 = new Pergunta("Qual a região do Brasil que produz mais energia hidráulica?");
    p5.alter("1 - Sul-Sudeste-Centro-Oeste");
    p5.alter("2 - Norte-nordeste");
    p5.alter("3 - Sul-Sudoeste");
    p5.alter("4 - Norte-oeste");
    p5.alter("5 - Nenhuma das alternativas");
    p5.setCerta(1);
    int resposta5 = scanner.nextInt();
    if (resposta5 == p5.getCerta()) {
        System.out.println("Correto! Concentra cerca de 70% de toda produção de energia hidroelétrica no Brasil.");
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

    Pergunta p1 = new Pergunta("Qual país do brasil produz mais energia solar?");
    p1.alter("1 - Minas Gerais");
    p1.alter("2 - São Paulo");
    p1.alter("3 - Rio de Janeiro");
    p1.alter("2 - Santa Catarina");
    p1.alter("5 - Amazonas");
    p1.setCerta(1);
    int resposta = scanner.nextInt();
    if (resposta == p1.getCerta()) {
        System.out.println("Correto! Por 2 fatores, primeiro que em MG tem sol o ano inteiro; segundo que ele foi o primeiro estado a acabar com o a cobrança dobrada de impostos dessa energia");
        correct++;
    } else {
        System.out.println("Errado");
        incorrect++;
    }

    Pergunta p2 = new Pergunta("Em que ano surgiu a energia solar fotovoltaica?");
    p2.alter("1 - 1950");
    p2.alter("2 - 1830");
    p2.alter("3 - 1839");
    p2.alter("4 - 1902");
    p2.alter("5 - 1754");
    p2.setCerta(3);
    int resposta2 = scanner.nextInt();
    if (resposta2 == p2.getCerta()) {
        System.out.println("Correto! Pois foi nesse ano que o físico francês Alexandre Edmond Becquerel, com o aparecimento da primeira célula fotovoltaica");
        correct++;
    } else {
        System.out.println("Errado");
        incorrect++;
    }

    Pergunta p3 = new Pergunta("Qual é o país que mais produz energia solar no Mundo?");
    p3.alter("1 - E.U.A");
    p3.alter("2 - Brasil");
    p3.alter("3 - Rússia");
    p3.alter("4 - Equador");
    p3.alter("5 - China");
    p3.setCerta(5);
    int resposta3 = scanner.nextInt();
    if (resposta3 == p3.getCerta()) {
        System.out.println("Correto! Por conta das usinas de energia solar que têm lá, que forma  uma grande área de instalação de painéis fotovoltaicos");
        correct++;
    } else {
        System.out.println("Errado");
        incorrect++;
    }

    Pergunta p4 = new Pergunta("Qual dessas é uma vantagem da energia solar?");
    p4.alter("1 - É uma energia fóssil");
    p4.alter("2 - Baixo impacto ambiental");
    p4.alter("3 - Baixo custo de aquisição inicial");
    p4.alter("4 - Muitos estudos sobre o impacto que vem do descarte dos painéis velhos");
    p4.alter("5 - Pode ser muito aproveitada durante a noite");
    p4.setCerta(2);
    int resposta4 = scanner.nextInt();
    if (resposta4 == p4.getCerta()) {
        System.out.println("Correto! essa fonte de energia é a que gera menos emissão de gases de efeito estufa ou qualquer outro impacto significativo");
        correct++;
    } else {
        System.out.println("Errado");
        incorrect++;
    }

    Pergunta p5 = new Pergunta("Aonde foi realizado o primeiro voo a energia solar?");
    p5.alter("1 - Nova York");
    p5.alter("2 - São Paulo");
    p5.alter("3 - Rio de Janeiro");
    p5.alter("4 - Califórnia");
    p5.alter("5 - Hong Kong");
    p5.setCerta(4);
    int resposta5 = scanner.nextInt();
    if (resposta5 == p5.getCerta()) {
        System.out.println("O avião foi construído pelos  irmãos Roland e Bob Boucher, e decolou 28, mas acabou sendo destruída quando fez um vôo muito alto");
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
        System.out.println("Correto! Pois leam muito tempo pra se formar, e como o consumo é maior q a produção, está se esgotando");
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
        System.out.println("Pois embora não emita gases q contribuam com efeito estufa, ela não se regenera, é limitada");
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
        System.out.println("Correto! Pois utiliza água, um elemento que se encontra em abrangência na Terra");
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
        System.out.println("Correto! Pois ela visa um grande prazo de tempo para o retorno do invetsimento, então se você observar a curto prazo é muito cara");
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
        System.out.println("Correto! Pois ela visa um grande prazo de tempo para o retorno do invetsimento, então se você observar a curto prazo é muito cara");
        correct++;
    } else {
        System.out.println("Errado");
        incorrect++;
    }

    System.out.println("\n Acertos: " + correct);
    System.out.println("\n Erros: " + incorrect);
  }
}
