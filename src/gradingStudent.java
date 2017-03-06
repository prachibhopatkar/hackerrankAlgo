/*
	 * Given the initial value of  for each of Sam's  students, 
	 * write code to automate the rounding process. 
	 * For each , round it according to the rules above and print the result on a new line.
	 */


import java.util.Scanner;
public class gradingStudent {
	

		public static int roundOff(int grade){
			if(grade<38){
				return grade;
			}
			else if(5*((grade/5)+1) - grade < 3){
				int val  = grade/5+1;
				return (5*((grade/5)+1));
			}
			else
				return grade;
		}
		public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        for(int a0 = 0; a0 < n; a0++){
	            int grade = in.nextInt();
	            int finalGrade = roundOff(grade);
	            System.out.println(finalGrade);
	            
	        }
	    }
	}


