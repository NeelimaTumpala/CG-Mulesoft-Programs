package sales;

public class Sales {
	public static String getAmount(String size) {
		if(size.equals("S")) {
			return "cost of "+ size +" size T Shirt is 30$";
		}
		else if(size.equals("M")) {
			return "cost of "+ size +" size T Shirt is 50$";
		}
		return "The T-Shirt size you enterd is not S or M so its cost 80$";
		
	}

}