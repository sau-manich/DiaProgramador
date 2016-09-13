import java.util.Calendar;
public class Dia256 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		int num_dia = c.get(Calendar.DAY_OF_YEAR);
		System.out.printf("Hoy es el dia %d del año\n",num_dia);
		if (num_dia == Math.pow(2,8)) {
			System.out.println("Feliz dia del Programador");
		}

	}

}
