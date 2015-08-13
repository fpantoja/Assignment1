package cs356.iVoteSimulator;

import java.util.ArrayList;

/**
 * Created by Fernando on 8/11/15.
 */

public class Student {

    private String uniqueID;
    private ArrayList<String> answer = new ArrayList<String>();

    public Student(int idNumber) {
        this.uniqueID = Integer.toString(idNumber);
    }

    public String getUniqueID(){return uniqueID;}

    public ArrayList<String> getAnswer() {
        return answer;
    }

    public void setAnswer(String choice){
        answer.add(choice);
    }

}
