package aps.java.lpoo;

public class Question {
  String prompt;
  String answer;
  Boolean hit = false;

  public Question(String prompt, String answer) {
    this.prompt = prompt;
    this.answer = answer;
  }
}
