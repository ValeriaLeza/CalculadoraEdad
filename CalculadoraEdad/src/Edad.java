import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
 
public class Edad {
 
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
 
		System.out.print("Día nacimiento(DD): ");
		int dia = teclado.nextInt();
		System.out.print("Mes nacimiento(MM): ");
		int mes = teclado.nextInt();
		System.out.print("Año nacimiento(YYYY): ");
		int anio = teclado.nextInt();
		teclado.close();
 
		System.out.println("\nTu edad es: " + calcularEdad(dia, mes, anio));
 
	}
 
	static int calcularEdad(int dia, int mes, int anio) {
		LocalDate fechaHoy = LocalDate.now();
		LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
 
		Period periodo = Period.between(fechaNacimiento, fechaHoy);
 
		return periodo.getYears();
	}
 
}