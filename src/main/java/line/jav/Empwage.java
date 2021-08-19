package line.jav;
import java.util.Scanner;

public class Empwage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n=sc.nextInt();
        sc.close();
        int pt_wage=0,ft_wage=0;
        for (int i=0;i<n;i++){
            int status=(int) (Math.floor(Math.random()*10)%3);
            if(status==0){
                System.out.println("Employee "+(i+1)+" is Absent");
            }
            else if (status==1){
                System.out.println("Employee "+(i+1)+" is Present (Part-time)");
                pt_wage+=20*4;
            }
            else{
                System.out.println("Employee "+(i+1)+" is Present (Full-time)");
                ft_wage+=20*8;
            }
        }
        System.out.println("total cost for company on part-time employee is "+pt_wage);
        System.out.println("total cost for company on full-time employee is "+ft_wage);
        System.out.println("total cost for company on it's employees is "+(pt_wage+ft_wage));
    }
    
}
