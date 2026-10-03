public class StudentGrades {
    public static void main(String[] args){

        double[] grades = {8.5, 9.0, 7.5, 10.0, 6.5, 8.0};
        double sum = 0;
        double highest = grades[0];
        double lowest = grades[0];
        int failed = 0;
        int passed = 0;

        for(double grade : grades){

            sum += grade;

            if(grade < 6){
                failed++;
            }else{
                passed++;
            }

            if(grade > highest){
                highest = grade;
            }
            if(grade < lowest){
                lowest = grade;
            }

        }
    
    double avg = sum / grades.length;

    System.out.println("=== Grade Statistics ===");
    System.out.println("Average: " + avg);
    System.out.println("Highest grade: " + highest);
    System.out.println("Lowest grade: " + lowest);
    System.out.println("Passed: " + passed);
    System.out.println("Failed: " + failed);
    
    }
}
