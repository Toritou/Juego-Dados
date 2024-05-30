import java.util.Random;

public class Dado{
	private int caraSuperior;

		public Dado(int caraSuperior){
			this.caraSuperior = caraSuperior;
		}

		public int getCaraSuperior(){
			return caraSuperior;
		}

		public void lanzar(){
			Random random = new Random();
			caraSuperior = random.nextInt(6) + 1;
		}
}