package youtube;
import java.util.*;

public class Me {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Random random = new Random();
		int rand;
		int[] Arr = new int[10];
		
		for (int i=0; i<Arr.length; i++) {
			rand = random.nextInt(21);
			Arr[i] = rand;
			System.out.println(Arrays.toString(Arr));
			for (int j=1; j<=i; j++) {
				while (rand==Arr[j-1]) {
					rand = random.nextInt(21);
					Arr[j]=rand;
				}
			}
		}
		System.out.println(Arrays.toString(Arr));

	}
}

