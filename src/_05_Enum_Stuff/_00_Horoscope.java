package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void horoscope(Zodiac h) {
		switch(h) {
		case ARIES:{
			System.out.println("Aries: Confidence");
			break;
		}
		case AQUARIUS:{
			System.out.println("Aquarius: Tradition");
			break;
		}
		case TAURUS:{
			System.out.println("Taurus: New Experiences");
			break;
		}
		case PISCES:{
			System.out.println("Pisces: Breakthroughs");
			break;
		}
		case GEMINI:{
			System.out.println("Gemini: Be Active");
			break;
		}
		case CAPRICORN:{
			System.out.println("Capricorn: Energetic");
			break;
		}
		case CANCER:{
			System.out.println("Cancer: Vitality");
			break;
		}
		case SAGITTARIUS:{
			System.out.println("Sagittarius: Open Minded");
			break;
		}
		case LEO:{
			System.out.println("Leo: Frustration");
			break;
		}
		case SCORPIO:{
			System.out.println("Scorpio: Emotional");
			break;
		}
		case VIRGO:{
			System.out.println("Virgo: Spark");
			break;
		}
		case LIBRA:{
			System.out.println("Libra: Indecision");
			break;
		}
		}
	}
	// 3. Make a main method to test your method
	public static void main (String[] args) {
		horoscope(Zodiac.AQUARIUS);
	}
}
