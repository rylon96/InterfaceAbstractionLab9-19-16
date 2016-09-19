package lab1.altLab1;

public class IntroToProgrammingCourse extends ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    
    @Override
    public void setCourseName(String courseName){
        if(courseName == null || courseName.isEmpty()){
            System.out.println("Cannot be Blank");
        }else{
        this.courseName = courseName;
        }
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.isEmpty()){
            System.out.println("Cannot be Blank");
        }else{
        this.courseNumber = courseNumber;
        }    
    }

    @Override
    public void setCredits(double credits) {    
        this.credits = credits;
        }    
    

    @Override
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.isEmpty()){
            System.out.println("Cannot be Blank");
        }else{
        this.prerequisites = prerequisites;
        }
    }
}