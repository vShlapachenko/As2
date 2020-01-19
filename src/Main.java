import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args){

        File input = new File("D:\\t\\InputTestDataSets\\2-OneGroup\\ctc-t1-s2\\l-feedback.json");


        StudentFeedbackManager manager = new StudentFeedbackManager();
        Group group = new Group(manager);
        group.convertFeedback(input);

        for(StudentFeedback s: manager){
            System.out.println(s);
        }

//        for(String s: args){
//            System.out.println("Args: " + s);
//        }
//
//        Gson gson = new Gson();
    }
}
