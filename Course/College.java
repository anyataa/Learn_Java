package Course;

public interface College {
    public void registStudent(String fullName, Integer cardNumber);

    // public void learningPlan(String courseName, Integer sks, String room);

    public void countCourseForGraduate(Integer sks);

    public String inputCourseData(String courseName, String room);
}
