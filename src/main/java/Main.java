import enums.StudyProfile;
import model.Student;
import model.University;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        student.setAvgExamScore((float) 4.3)
                .setCurrentCourseNumber(5)
                .setFullName("Smirnov Nikolay Pavlovich")
                .setUniversityId("007-agent");
        System.out.println(student);

        University university = new University();

        university.setId("007-agent")
                .setFullName("Lomonosov Moscow State University")
                .setShortName("MSU")
                .setYearOfFoundation(1755)
                .setMainProfile(StudyProfile.INTERNATIONAL_LAW);
        System.out.println(university);

    }
}