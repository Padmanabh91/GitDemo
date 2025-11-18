package Practice.Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbersandRemoveDuplicates {

	public static void main(String[] args) {
		int[] numbers= {2,4,1,5,6,2,3,5,8,9,10,13,41};
		
		
		List<Integer> nos=Arrays.stream(numbers).boxed().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(nos);
		
		for(int i=(nos.size()/2)+1;i<nos.size();i++)
		{
			System.out.println(nos.get(i));
		}
		
		

	}

}
