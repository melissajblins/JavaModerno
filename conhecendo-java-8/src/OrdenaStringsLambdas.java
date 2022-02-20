import java.util.ArrayList;
import java.util.List;

public class OrdenaStringsLambdas {

	public static void main(String[] args) {;
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
//		palavras.sort(Comparator.comparing(s -> s.length()));
		
		palavras.forEach(s -> System.out.println(s));
	}
}