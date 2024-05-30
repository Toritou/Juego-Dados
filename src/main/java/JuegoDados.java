public class JuegoDados {

	public void main(String[] args) {
		Dado dado1 = new Dado(1);
		Dado dado2 = new Dado(1);

		Calculadora calculadora = new Calculadora();

		dado1.lanzar();
		dado2.lanzar();

		int suma = calculadora.suma(dado1.getCaraSuperior(), dado2.getCaraSuperior());

		System.out.println("La cara superior del dado 1 es: " + dado1.getCaraSuperior());
		System.out.println("La cara superior del dado 2 es: " + dado2.getCaraSuperior());
		System.out.println("La suma de las caras superiores de los dados es: " + suma);

		if(suma == 7) {
			System.out.println("Ganaste :D");
		} else {
			System.out.println("Perdiste :C");
		}

	}

}