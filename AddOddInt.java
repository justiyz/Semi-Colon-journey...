
public class AddOddInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		int sum = 0;
		for(;count<100; count++) {
			if(count % 2 == 0)
				continue;
			else
				sum = sum + count;
			System.out.println(count);
			
		}
		
		System.out.println();
		System.out.println(sum);
		
		

	}

}
