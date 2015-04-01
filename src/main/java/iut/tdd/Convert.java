package iut.tdd;

public class Convert {
	
	public static String num2text(String input){
		if(input.equals("0")){return "zéro";}
		if(input.equals("1")){return "un";}
		if(input.equals("2")){return "deux";}
		if(input.equals("3")){return "trois";}
		if(input.equals("4")){return "quatre";}
		if(input.equals("5")){return "cinq";}
		if(input.equals("6")){return "six";}
		if(input.equals("7")){return "sept";}
		if(input.equals("8")){return "huit";}
		if(input.equals("9")){return "neuf";}
		else{return null;}
	}
	public static String text2num(String input){
		if(input.equals("zéro")){return "0";}
		if(input.equals("un")){return "1";}
		if(input.equals("deux")){return "2";}
		if(input.equals("trois")){return "3";}
		if(input.equals("quatre")){return "4";}
		if(input.equals("cinq")){return "5";}
		if(input.equals("six")){return "6";}
		if(input.equals("sept")){return "7";}
		if(input.equals("huit")){return "8";}
		if(input.equals("neuf")){return "9";}
		else{return null;}
		
	}
}