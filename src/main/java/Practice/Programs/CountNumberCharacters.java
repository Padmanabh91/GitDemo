package Practice.Programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountNumberCharacters {

	public static void main(String[] args) {
		String str="programming";
		
		String str1=str.toLowerCase();
		
		str1.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(c->c,Collectors.counting()))
		.forEach((c,count)->{
			if(count>1)
			{
				System.out.println(c+":"+count);
			}
			
		});
}

}
