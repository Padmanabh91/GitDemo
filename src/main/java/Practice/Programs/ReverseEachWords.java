package Practice.Programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWords {

	public static void main(String[] args) {
		
		String str="This is java programming";
		
	   String str1=Arrays.stream(str.split(" ")).map(s->new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
		
	   System.out.println(str1);
		
		String reversed=Arrays.stream(str.split(" ")).map(s-> new StringBuilder(s).reverse().toString())
				.map(s->s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase()).collect(Collectors.joining(" "));
		
		System.out.println(reversed);
		
	}

}
