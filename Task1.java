package tasks;

public class Task1 {

	public static void main(String[] args) {
		int sum=0;
		int [][] num= {{10,20,30},{1,2,3},{3,4,5}};
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				sum=sum+num[i][j];
				
			}
			
			
		}
		System.out.println(sum);
	}

}
