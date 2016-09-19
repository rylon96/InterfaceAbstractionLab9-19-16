package lab1.altLab1;

public class Startup {
    public static void main(String[] args) {
        ProgrammingCourse[] courses = {
            new AdvancedJavaCourse(), new IntroJavaCourse(), new IntroToProgrammingCourse()
            };
        for(ProgrammingCourse pc : courses){
        pc.setCourseName(null);
        }
    }
}

