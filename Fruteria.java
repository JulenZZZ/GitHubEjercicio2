import java.util.Scanner;
public class Fruteria {
	static double cantidad;
	public static void main(String[] args) {
		//definicion de constatantes
		//producto de la semana para aplicar el dto
		final String PROD_SEMANAL="Peras";
		//total a partir del q se aplica el dto
		final double DTO_PROD_SEM=5;
		//dto a aplicar por prod semana
		final double VOL_MIN_DTO=100;
		final double DTO_VOLUMEN=10;
		//si el total es mayor q 100 aplicar dto de %10
		
		//definicion de variables
		String producto;
		double precio;
		double cantidad;
		double total;
		double dto; 
		
		//def del scanner para leer por consola
			Scanner sc=new Scanner(System.in);
				System.out.print("Introduce el producto");
					producto=sc.nextLine();
				System.out.print("Introduce el precio");
					precio=sc.nextDouble();
				System.out.print("Introduce la cantidad comprada");
					cantidad=sc.nextDouble();
						total=precio*cantidad;
						if (total>=100){
							dto=total*10/100;
							total=total-dto;
						}
						//si esa el producto de la semana un %5de descuento-
						if(producto.equals("Peras")){
							dto=total*5/100;
							total=total-dto;
						}
							//escribir el mensaje
							
				System.out.println("Has comprado "+cantidad+"Kg de "+producto+" y el precio es "+total+"€");
				sc.close();
		
		
		
