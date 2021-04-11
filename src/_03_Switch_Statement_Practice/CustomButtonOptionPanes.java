package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice){
		case "Sunday":{
			System.out.println("end of the weekend");
			break;
		}
		case "Monday":{
			System.out.println("sadness");
			break;
		}
		case "Tuesday":{
			System.out.println("second monday");
			break;
		}
		case "Wednesday":{
			System.out.println("hump day");
			break;
		}
		case "Thursday":{
			System.out.println("almost there");
			break;
		}
		case "Friday":{
			System.out.println("done with school or work");
			break;
		}
		case "Saturday":{
			System.out.println("beginning of the weekend");
			break;
		}
		//case 
		}
	}
}
