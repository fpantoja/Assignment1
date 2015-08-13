package cs356.iVoteSimulator;

import java.util.ArrayList;

/**
 * Created by Fernando on 8/12/15.
 */
public class MultiChoiceQuestion extends Question {

    public MultiChoiceQuestion(String question, ArrayList<String> choices, ArrayList<String> answers){
        super(question, choices, answers);
        if(answers.size() < 1)
            System.out.println("Multi choice question type must have at least one answer");
    }
}
