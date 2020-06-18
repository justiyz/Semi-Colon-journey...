
public class GroupWork {

	public static void main(String[] args) {
		
		int total = 0;
		int x = 1;
		
	/*		while(x <=10) {
				total = total + x;
				x++;			
	}
			System.out.print(x);
			System.out.println();
			System.out.print(total);
			*/
			
		
		
		while(x<=10) {
			if(x%2==0)
				total = total + x;
			x++;
		}
		System.out.print(total);
			
	}
}
