import java.util.Scanner;

public class Person {
    private int age;

    public Person(int age) {
        // Add some more code to run some checks on initialAge
        if (age < 0){
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else {
            this.age = age;
        }
    }

    public void amIOld() {
        if(age<13){
            System.out.println("You are young.");
        }
        else if (age>=13 && age<18){
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age = this.age + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            Person person = new Person(age);
            person.amIOld();

            for (int j = 0; j < 3; j++) {
                person.yearPasses();
            }
            person.amIOld();
        }
        sc.close();
    }

}
