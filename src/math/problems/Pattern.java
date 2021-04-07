package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		for(int i = 100; i >= 0 ; i-- ) {
			if(i/10 == 10 ||  i/10 ==9 ){
				System.out.print(i+",");

			}else if(i/10 == 8 ||  i/10 ==7 ){
				i -= 1;
				System.out.print(i+",");

			}else if(i/10 == 6 ||  i/10 ==5 || i/10 == 4){
				i -= 2;
				System.out.print(i+",");

			}else if(  i/10 ==3 || i/10 == 2 ||  i/10 ==1 ){
				i -= 3;
				System.out.print(i+",");

			}else if(i/10 == 0 && i>0 ){
				i -= 5;
				if(i>0)
				System.out.print(i+",");

			}
		}
	}
}
