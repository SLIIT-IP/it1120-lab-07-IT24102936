import java.util.Scanner;

public class IT24102936Lab7Q1B {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
	int tot_marks = 0;
	String grade;

	for(int i=1;i<=3;i++ ){
		System.out.println("\nStudent "+i);
		System.out.print("Enter Marks : ");
		for(int x=1;x<=4;x++){
			int marks = keyboard.nextInt();
			tot_marks = tot_marks + marks;
			//System.out.print(" ");


		}
		int avg_marks = tot_marks/4;
        	System.out.println("Avarage is : "+avg_marks);
		if(avg_marks >= 75){
			grade = "Distinvtion";
		}
		else if(avg_marks >= 50){
			grade = "Credit";
		}
		else{
			grade = "Fail";
		}
      		System.out.println("Overall Grade is : "+ grade);
		}

	}
}