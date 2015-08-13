package cs356.iVoteSimulator;

import java.util.ArrayList;

/**
 * Created by Fernando on 8/11/15.
 */
public abstract class Question {
    private String question;
    private ArrayList<String> choices;
    private ArrayList<String> answers;

    public Question(String question, ArrayList<String> choices, ArrayList<String> answers){
        this.question = question;
        this.choices = choices;
        this.answers = answers;
    }

    public String getQuestion(){ return question; }

    public ArrayList<String> getChoices(){ return choices; }

    public ArrayList<String> getAnswers(){ return answers; }
}
