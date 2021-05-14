package gradeAppUserInput;

import java.util.*;

public class getUserGrades {

	public static void main(String[] args) {
		ArrayList<Integer> grades = new ArrayList<>();
		
		Scanner enterMoreYOrN = new Scanner(System.in);
		
		System.out.println("Do you need to enter a grade? Enter Y or N.");
		String yayOrNay = enterMoreYOrN.next(); 
		//add: handle the user entering a response in lower case
			
		while(yayOrNay.equals("Y")) {
			System.out.println("Please enter a grade.");
			Scanner newGrade = new Scanner(System.in);
			int grade = newGrade.nextInt();
			
			//take the grade entered here and save it to the grades ArrayList defined above.
			grades.add(grade);
			
			System.out.println("Do you need to enter a grade? Enter Y or N.");				
			yayOrNay = enterMoreYOrN.next();
				
			}
		
		//System.out.println(grades);  //test if the user entered grades are going into the ArrayList
		
		Collections.sort(grades);
		
		int sum = 0;
		for (Integer grade : grades) {
	        sum += grade;
	    }
		
		//System.out.println("The sum of all grades is: " + sum); //check if sum calculation worked
		
		int avgGrade = (sum / grades.size());
		
		//create variables to hold the amount of each letter grade entered by the user
		int A = 0;
		int B = 0;
		int C = 0;
		int F = 0;
		
		for(int gradesEntered: grades) {
		 	
			if(gradesEntered >= 90){
				A++;
			} else if ((gradesEntered < 90) && (gradesEntered >= 80)) {
				B++;
			} else if ((gradesEntered < 80) && (gradesEntered >= 70)) {
				C++;
			} else if (gradesEntered <= 69) {
				F++;
			}
			//add: handle the user entering a grade in the D range - 70-79
		}
		
		
		System.out.println("Highest Grade: " + Collections.max(grades));
		System.out.println("Lowest Grade: " + Collections.min(grades));
		System.out.println("The average Grade is: " + avgGrade); 
		System.out.println("Number of As: " + A);
		System.out.println("Number of Bs: " + B);
		System.out.println("Number of Cs: " + C);
		System.out.println("Number of Fs: " + F);
		
		
	}

}
