/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizLPOO;

/**
 *
 * @author enriq
 */
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
