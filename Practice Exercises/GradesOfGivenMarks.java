import java.util.Scanner;
class GradesOfGivenMarks{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 3 subjects: ");

        //Enter the Marks of 3 Subjects.
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        float averageMarks = (float)(m1+m2+m3)/3 ;//Calculate the averge of subjects 
        
        //Checing Grades of the Subject
        if(averageMarks >= 70){
            System.out.println("A");
        }else if(averageMarks >= 60 && averageMarks<70){
            System.out.println("B");
        }else if(averageMarks >= 50 && averageMarks<60){
            System.out.println("C");
        }
        else if(averageMarks >= 40 && averageMarks<50){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
} 