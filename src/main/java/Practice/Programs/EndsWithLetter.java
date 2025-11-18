package Practice.Programs;

import java.util.stream.Stream;

public class EndsWithLetter {

	public static void main(String[] args) {
		
		Stream.of("Adam","Rama","Sita","Aleykya").filter(s->s.startsWith("A")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));

	}

}
