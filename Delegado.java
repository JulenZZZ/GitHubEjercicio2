import java.util.Scanner;
public class Delegado {
	public static void main(String[] args) {
		//definir var
		Scanner sc=new Scanner(System.in);
		int delegado;
		int sub;
		int alumno;
		System.out.println("Numero de alumnos:");
		alumno=sc.nextInt();
		delegado=(int)(Math.random()*alumno+1);
		
		sub=(int)(Math.random()*alumno+1);
		System.out.println("El delegado es el " +delegado);
		System.out.println("El subdelegado es el "+sub);
		sc.close();
		
		
		
		
