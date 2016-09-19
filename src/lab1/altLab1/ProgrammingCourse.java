package lab1.altLab1;
public abstract class ProgrammingCourse {
   private String courseName;
   private String courseNumber;
   private double credits;
   private String prerequisites;    

    public final String getCourseName() {
        return courseName;
    }

    public abstract void setCourseName(String courseName);
    
    public final String getCourseNumber() {
        return courseNumber;
    }

    public abstract void setCourseNumber(String courseNumber);
    
    public final double getCredits() {
        return credits;
    }
    
    public abstract void setCredits(double credits);
    
    
    public final String getPrerequisites() {
        return prerequisites;
    }

    public abstract void setPrerequisites(String prerequisites);
    
    
    
    
   
   
}
