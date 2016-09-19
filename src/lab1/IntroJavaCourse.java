package lab1;

public class IntroJavaCourse extends ProgrammingCourse{

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    @Override
    public final void setCourseName(String courseName){
        if(courseName == null || courseName.isEmpty()){
            System.out.println("Cannot be Blank");
        }else{
        this.courseName = courseName;
        }
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.isEmpty()){
            System.out.println("Cannot be Blank");
        }else{
        this.courseNumber = courseNumber;
        }    
    }

    @Override
    public final void setCredits(double credits) {    
        this.credits = credits;
        }    
    

    @Override
    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.isEmpty()){
            System.out.println("Cannot be Blank");
        }else{
        this.prerequisites = prerequisites;
        }
    }
}
