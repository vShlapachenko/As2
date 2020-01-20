import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Group {

    private String privateComment;
    private StudentFeedbackManager manager;

    public Group(StudentFeedbackManager manager) {
        this.manager = manager;
    }

    public void convertJsonToClass(File input){
        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();

            //Extracting the basic fields
            privateComment = fileObject.get("confidential_comments").getAsString();

            //process all students
            JsonArray jsonArrayOfStudents = fileObject.get("group").getAsJsonArray();
            for(JsonElement studentElement: jsonArrayOfStudents){
                //get the JsonObject
                JsonObject studentJsonObject = studentElement.getAsJsonObject();

                String name = studentJsonObject.get("name").getAsString();
                String email = studentJsonObject.get("sfu_email").getAsString();
                JsonObject contribution = studentJsonObject.get("contribution").getAsJsonObject();
                Double score = contribution.get("score").getAsDouble();
                String comment = contribution.get("comment").getAsString();

                StudentFeedback student = new StudentFeedback(name, email, score, comment);

                manager.add(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "privateComment='" + privateComment + '\'' +
                ", manager=" + manager +
                '}';
    }

    public StudentFeedbackManager getManager() {
        return manager;
    }
}
