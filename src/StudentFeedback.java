public class StudentFeedback {
    String name;
    String email;
    Double score;
    String comment;

    public StudentFeedback(String name, String email, Double score, String comment) {
        this.name = name;
        this.email = email;
        this.score = score;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "StudentFeedback{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", score=" + score +
                ", comment='" + comment + '\'' +
                '}';
    }
}
