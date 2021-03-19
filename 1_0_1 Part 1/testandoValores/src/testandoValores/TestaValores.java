package testandoValores;

public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		
		segundo = primeiro;
		
		primeiro = 10;
				
		int terceiro = primeiro;
		
		System.out.println(segundo);
		System.out.println(terceiro);
	}
}
