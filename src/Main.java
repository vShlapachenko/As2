
import java.io.File;

public class Main {
    public static void main(String[] args){

        File input = new File("D:\\t\\InputTestDataSets\\1-Just1\\rvu-t1-s1\\b-feedback.json");

        StudentFeedbackManager manager = new StudentFeedbackManager();
        Group group = new Group(manager);
        group.convertJsonToClass(input);

        FileConverter fileConverter = new FileConverter(group);
            System.out.println(group);


//        for(String s: args){
//            System.out.println("Args: " + s);
//        }
//
//        Gson gson = new Gson();
    }
}
