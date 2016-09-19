//Incorrect First Attempt Please Move to altLab1Folder for correct code keeping this here to learn from mistakes.
package lab1;

public class IntroJavaCourse extends ProgrammingCourse{
    
    @Override
    public void getCourseName() {
        System.out.println("Course Name:    Java Programming");
    }

    @Override
    public void getCourseNumber() {
        System.out.println("Course Number:  " + 20133);
    }

    @Override
    public void getCredits() {
        System.out.println("Credits:    "+2);
    }

    @Override
    public void getPrerequisites() {
        System.out.println("Prerequisites:  None");
    }

}
