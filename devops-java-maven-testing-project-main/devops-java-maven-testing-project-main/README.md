***Student Attendance System - Java Maven Project***
A student attendance system built using Java and Maven. 
This project allows users to mark attendance for students along with the name of the subject taught.
**Features**

**Mark Attendance:** Record attendance for students.
**Subject Name:** Enter the name of the subject for which attendance is being recorded.
**Invalid Input Handling:** Gracefully handle errors and invalid inputs.
  
 ***Installation***
Running the project.......

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/tushar11046/Devops_Assgnment.git
   cd calculator-web-app-
   
2. **Build with Maven**:
   ```bash
   mvn clean install

  
3. **Run the Application:**
   ```sh
   mvn exec:java


Using the Student Attendance System:

Start the application as instructed above.
Follow the prompts or user interface to mark attendance and enter subject details.




**TEST CASES**
The calculator app contains the following test cases that is run by the jenkins
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AttendanceSystemTest {

    @Test
    public void testMarkAttendance() {
        AttendanceSystem system = new AttendanceSystem();
        assertTrue(system.markAttendance("Tushar Joshi", "History"));
    }

    @Test
    public void testInvalidSubjectName() {
        AttendanceSystem system = new AttendanceSystem();
        assertFalse(system.markAttendance("Pranay Kumar", ""));
    }

    @Test
    public void testInvalidStudentName() {
        AttendanceSystem system = new AttendanceSystem();
        assertFalse(system.markAttendance("", "Science"));
    }

    @Test
    public void testInvalidAttendance() {
        AttendanceSystem system = new AttendanceSystem();
        assertFalse(system.markAttendance("", ""));
    }
}