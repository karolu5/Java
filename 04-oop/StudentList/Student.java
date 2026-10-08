public class Student {

    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        setName(name);
        setAge(age);
        setGrade(grade);
    }

    public String getName() {
        return name;
    }   
    public int getAge() {
        return age;
    }
    public double getGrade() {
        return grade;
    }   

    public boolean hasPassed() {
        return grade >= 6.0;
    }

    public void displayInfo() {
        
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + getName());
        System.out.println("Age: "+ getAge());
        System.out.println("Grade: " + getGrade());
        System.out.println("Passed: " + hasPassed());

        /*=== Student Information ===
            Name: Jose
            Age: 44
            Grade: 4.0
            Passed: false */
    }

    public void setName(String name) {
        if(name.isBlank()){
            System.out.println("Name cannot be empty");
        }
        else{
            this.name = name;
        }
    }
    public void setAge(int age) {
        if(age < 0 || age > 120){
            System.out.println("Must be between 0 and 120");
        }
        else{
            this.age = age;
        }
    }
    public void setGrade(double grade) {
        if(grade > 10 || grade < 0){
            System.out.println("Must be between 0 and 10");
        }
        else{
            this.grade = grade;
        }
    }

}

