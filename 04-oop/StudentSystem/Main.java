import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        int passedCount = 0;
        boolean found = false;
        String searchName = "Diana";
        double sum = 0;
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("Jose", 42, 8.4);
        Student student2 = new Student("Diana", 23, 7.8);
        Student student3 = new Student("Carlos", 25, 5.5);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student : students) {
            if(student.hasPassed()){
                passedCount++;
            }
            sum += student.getGrade();
        }
        System.out.println("Passed students: " + passedCount);
        if (!students.isEmpty()) {
            double average = sum / students.size();
            System.out.println("Group Average: " + average);
        } else {
            System.out.println("No students registered.");
        }

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Student found!");
                student.displayInfo();

                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }

    }
}

