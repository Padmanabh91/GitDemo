package Practice.Programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
	
		String str="Programming";
		
		String str1=Arrays.stream(str.split("")).distinct().collect(Collectors.joining(""));
		System.out.println(str1);

	}

}
