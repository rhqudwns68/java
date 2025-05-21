package 반복문;

public class while반복문 {
	 public static void main(String[] args) {
	        int sum = 0;
	        int i = 1;

	        while (i <= 100) {
	            if (i % 2 == 0) {
	                sum += i;
	            }
	            i++;
	        }

	        System.out.println("1부터 100까지 짝수의 합: " + sum);
	    }
	}

