import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileConverter {

    private Group group;
    private final static char NEW_LINE = '\n';

    public FileConverter(Group group) {
        this.group = group;
    }


    {
        try (PrintWriter writer = new PrintWriter(new File("D:\\t\\InputTestDataSets\\1-Just1\\rvu-t1-s1\\b-feedback.csv"));){
            StringBuilder sb = new StringBuilder();
            writeToCSV(group,sb);
            writer.write(sb.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void writeToCSV(Group group, StringBuilder sb){
        sb.append(getFirstLineCSV());
        sb.append("Group 1\n");

//        for(StudentFeedback studentFeedback: group.getManager()){
////            sb.append(getFeedbackAllForOne(group));
////        }knl,

    }

    private String getFirstLineCSV(){
        return "Group#,Source Student,Target Student" +
                "Score,Comment,,Private" + NEW_LINE;
    }

   // private String getFeedbackAllForOne(Group group){

    }


