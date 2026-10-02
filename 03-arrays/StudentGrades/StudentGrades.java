public class StudentGrades {
    public static void main(String[] args){

        double[] grades = {5.5, 10.0, 3.0, 7.5, 6.0, 9.0, 4.5};
        double sum = 0;
        double highest = grades[0];
        double lowest = grades[0];
        int failed = 0;
        int passed = 0;

        for(int i = 0; i < grades.length; i++){

            sum = sum + grades[i];

            if(grades[i] < 6){
                failed++;
            }else{
                passed++;
            }

            if(grades[i] > highest){
                highest = grades[i];
            }
            if(grades[i] < lowest){
                lowest = grades[i];
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
