package Calculadora;

public class Programa {
	
	//TODO: Crear un programa principal que 
	//utilice todas las funciones de la calculadora
	//Incluida las operaciones toString y la potencia
	//que habr�is a�adido.
	//Ejecutadlo.
	static Calculadora c=new Calculadora(3,8);
	
	public static void main(String[]args) {
		System.out.println(c.toString());
		System.out.println("Suma: "+c.suma());
		System.out.println("Resta: "+c.resta());
		System.out.println("Multiplicacion: "+c.multi());
		System.out.println("Division: "+c.division());
	}
}
