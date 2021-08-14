package tasks;

public class Task2 {

	public static void main(String[] args) {
		
		int [][] num= {{2,3,4},{5,6,7},{8,9,10}};
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				if(num[i][j]%2==0) {
				System.out.println(num[i][j]);
					
			}
		
		}

	}

}
}