package line.jav;
import java.util.Scanner;

public class Empwage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n=sc.nextInt();
        sc.close();
        for (int i=0;i<n;i++){
            int status=(int) (Math.floor(Math.random()*10)%2);
            if(status==0){
                System.out.println("Employee "+(i+1)+" is Absent");
            }
            else{
                System.out.println("Employee "+(i+1)+" is Present");
            }
        }
    }
    
}
