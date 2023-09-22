
public class Alumno {

		public String nombre;
		public int[] calificaciones;
		
		public Alumno(String nombre, int[] calificaciones) {
			this.nombre = nombre;
			this.calificaciones = calificaciones;

	}
		// calcula el promedio de las calificaciones 
		public double calcularPromedio() {
			int suma = 0;
			int y = 0 ;
			for(int x = 1 ; x <= calificaciones.length ; x++) {
				suma += calificaciones[y];
				y++;
			}
			return (double) suma / calificaciones.length;
		}
		
		//Asigna la calificacion usando "if else"
		public char calificacionFinal(double promedio) {
			if (promedio <=50) {
				return 'F';
			} else if (promedio <=60) {
				return 'E';
			}else if (promedio <=70) {
				return 'D';
			}else if (promedio <=80) {
				return 'C';
			}else if (promedio <=90) {
				return 'B';
			}else {
				return 'A';
			}
		}
		
		//imprime el nombre del estudiante, las calificaciones, el promedio y la calificacion final
		public void imprimirCalificaciones() {
			System.out.println("Nombre del estudiante: " + nombre);
			int y = 0;
			for(int x = 1; x <= calificaciones.length ; x++) {
				System.out.println("Calificacion " + x + ": " + calificaciones[y]);
				y++;
			}
			double promedio = calcularPromedio();
			char calificacion = calificacionFinal(promedio);
			System.out.println("Promedio: " + promedio);
			System.out.println("Calificacion: " + calificacion);		
		}
		
		public static class Main {
			public static void main(String[] args) {
				int[] calificaciones = {79, 99, 86, 91, 96};
				Alumno alumno = new Alumno("Beto Gomez", calificaciones);
				alumno.imprimirCalificaciones();
				
			}
		}

}
