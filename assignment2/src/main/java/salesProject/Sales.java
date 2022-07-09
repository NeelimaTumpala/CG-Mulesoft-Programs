package salesProject;

public class Sales {
	public static String getAmount(String size) {
		if(size.equals("S")) {
			return "30$";
		}
		else if(size.equals("M")) {
			return "50$";
		}
		return "80$";
		
	}

}
