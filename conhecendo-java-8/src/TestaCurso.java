import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
//		cursos.sort(Comparator.comparingInt(Curso::getAlunos)); Method Reference
//		Filtrando curso com mais de 50 alunos
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(c -> c.getAlunos())
		   .forEach(x -> System.out.println(x));
//		Method Reference
//		cursos.stream()
//		   .filter(c -> c.getAlunos() > 50)
//		   .map(Curso::getAlunos)
//		   .forEach(System.out::println);
		
	}

}
