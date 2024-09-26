import java.util.Scanner;

public class IT24102936Lab7Q1A {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
	int tot_marks = 0;
	String grade;
	System.out.println("Enter Marks For Four Subject :");
	for(int i=1;i<=4;i++ ){
		System.out.print("Enther Subject Marks "+i+":");
		int marks = keyboard.nextInt();
		tot_marks = tot_marks + marks;
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
}}