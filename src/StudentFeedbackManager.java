import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentFeedbackManager implements Iterable<StudentFeedback>{

    private List<StudentFeedback> students = new ArrayList<>();

    public void add(StudentFeedback student){
        students.add(student);
    }


    @Override
    public Iterator<StudentFeedback> iterator() {
        return students.iterator();
    }

    @Override
    public String toString() {
        return "StudentFeedbackManager{" +
                "students=" + students +
                '}';
    }
}
