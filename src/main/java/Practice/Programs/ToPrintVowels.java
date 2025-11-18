package Practice.Programs;

import java.util.List;
import java.util.stream.Collectors;

public class ToPrintVowels {

	public static void main(String[] args) {
		
		String str="programmminge";
		
		String str1=str.toLowerCase();
		
	List<Character> ch=	str1.chars().mapToObj(s->(char) s).filter(s->"aeiou".indexOf(s)!=-1).collect(Collectors.toList());
		int count=0;
		for(int i=0;i<ch.size();i++)
		{
			System.out.print(ch.get(i));
			count++;
		}
		
		System.out.println();
		
		System.out.println("Number of vowels:"+count);
		
		
		
	}
}
