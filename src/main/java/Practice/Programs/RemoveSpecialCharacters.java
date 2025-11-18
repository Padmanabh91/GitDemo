package Practice.Programs;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		
		String str="Hello 123!";
		StringBuilder result=new StringBuilder();
		
		String str2=str.replaceAll("[^a-zA-Z0-9\\s]", "");
		
		System.out.println(str2);
		
	
		for(char ch:str.toCharArray())
		{
			if(Character.isLetterOrDigit(ch)|| Character.isWhitespace(ch))
			{
				result.append(ch);
			}
		}
		
		System.out.println(result.toString());
				

	}

}
