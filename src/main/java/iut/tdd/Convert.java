package iut.tdd;
import java.util.HashMap;
public class Convert {
	
	static HashMap<String,String> nb= new HashMap<String,String>();
	static {
		nb.put("0", "zéro");
		nb.put("1", "un");
		nb.put("2", "deux");
		nb.put("3", "trois");
		nb.put("4", "quatre");
		nb.put("5", "cinq");
		nb.put("6", "six");
		nb.put("7", "sept");
		nb.put("8", "huit");
		nb.put("9", "neuf");
		nb.put("10", "dix");
		nb.put("11", "onze");
		nb.put("12", "douze");
		nb.put("13", "treize");
		nb.put("14", "quatorze");
		nb.put("15", "quinze");
		nb.put("16", "seize");
		nb.put("20", "vingt");
	}
	static HashMap<String,String> diz= new HashMap<String,String>();
	static{
		diz.put("1", "dix");
		diz.put("2", "vingt");
		diz.put("3", "trente");
		diz.put("4", "quarante");
		diz.put("5", "cinquante");
		diz.put("6", "soixante");
		diz.put("7", "septante");
		diz.put("8", "quatre-vingt");
		diz.put("9", "nonante");
	}
		
	public static String num2text(String input){
		if ( input.length()<=2 && nb.containsKey(input)){
			return nb.get(input);
		}
		else if(input.length()>1 && input.length()<3 && nb.containsKey(input.substring(0,1)) && input.substring(1,2).equals("1")){
			return diz.get(input.substring(0,1))+"-et-"+nb.get(input.substring(1,2));
		}
		else if(input.length()>1 && input.length()<3 && nb.containsKey(input.substring(0,1)) && nb.containsKey(input.substring(1,2))){
			return diz.get(input.substring(0,1))+'-'+nb.get(input.substring(1,2));
		}
		return null;
	}
	

	public static String text2num(String input) {
		if (input.equals("zéro")) {
			return "0";
		}
		if (input.equals("un")) {
			return "1";
		}
		if (input.equals("deux")) {
			return "2";
		}
		if (input.equals("trois")) {
			return "3";
		}
		if (input.equals("quatre")) {
			return "4";
		}
		if (input.equals("cinq")) {
			return "5";
		}
		if (input.equals("six")) {
			return "6";
		}
		if (input.equals("sept")) {
			return "7";
		}
		if (input.equals("huit")) {
			return "8";
		}
		if (input.equals("neuf")) {
			return "9";
		}
		return null;
	}
}