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
	}
	public static String num2text(String input){
		if (nb.containsKey(input)){
			return nb.get(input);
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

	
	String toString(int i){
		return i+"";
	}
}