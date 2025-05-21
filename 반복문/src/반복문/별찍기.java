package 반복문;

public class 별찍기 {
	public class StarTriangle {
	    public static void main(String[] args) {
	        int lines = 5;

	        for (int i = 1; i <= lines; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}


}
