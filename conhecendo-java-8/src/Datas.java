import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		 LocalDate hoje = LocalDate.now();
		 System.out.println(hoje);
		 
		 LocalDate proximasOlimpiadas = LocalDate.of(2024, Month.JUNE, 5);
		 
//		 int anos = olimpiadasRio.getYear() - hoje.getYear();
		 Period periodoEntreOlimpiadas = Period.between(hoje, proximasOlimpiadas);
		 System.out.println(periodoEntreOlimpiadas);
		 
		 // Subtraindo datas
		 Period periodo = Period.between(hoje, proximasOlimpiadas);
		 System.out.println(periodo.getYears());
		 System.out.println(periodo.getMonths());
		 System.out.println(periodo.getDays());
		 
		 // Decrementando
		 System.out.println(hoje.minusYears(1));
		 System.out.println(hoje.minusMonths(4));
		 System.out.println(hoje.minusDays(2));

		 //Incrementando
		 System.out.println(hoje.plusYears(1));
		 System.out.println(hoje.plusMonths(4));
		 System.out.println(hoje.plusDays(2));
		 
		 // Formatando datas
		 DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 String valorFormatado = proximasOlimpiadas.format(formatador);
		 System.out.println(valorFormatado);
		 
		 // Medidas de tempo
		 LocalDateTime tempoAgora = LocalDateTime.now();
		 DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		 System.out.println(tempoAgora.format(formatadorComHoras));

	}

}
