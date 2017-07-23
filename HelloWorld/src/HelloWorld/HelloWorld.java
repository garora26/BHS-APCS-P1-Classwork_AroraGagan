package HelloWorld;

public class HelloWorld {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(1 + 2.0 + "\"//\\\"" + 1 + 2.0);

		int p = 1;
		int pp = 1; 
		
		System.out.print("1 1 ");
		for( int i = 1; i <= 12; i++)
		{
			int n = p + pp;
			System.out.print(n + " " );
			
			pp = p;
			p = n;
		}
	}
	

}
