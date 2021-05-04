package QuizLPOO;

public class Pergunta {
    
    public String pergunta="";
    public String[] alternativas = new String[5];
    public int certa=-1;
    
    public Pergunta(String pergunta){
        this.pergunta = pergunta;
        System.out.println (pergunta);
    }

    public int getCerta() {
        return certa;
    }

    public void setCerta(int certa) {
        this.certa = certa;
    }
    
    public void alter(String alternativa){
        for(int i=0 ; i<alternativas.length ; i++){
            if(alternativas[i] == null){
                alternativas[i] = alternativa;
                System.out.println (alternativa);
                break;
            }
        }
    }
    
}
