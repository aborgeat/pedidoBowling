package ar.edu.unlam.tallerweb1.persistencia;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PruebaFechaActual {

	public static void main(String[] args) {

//		SimpleDateFormat[] sdfs = { new SimpleDateFormat("dd-MM-yyyy h:mm a"),
//				new SimpleDateFormat("dd/MMM/yy HH:mm:ss"),
//				new SimpleDateFormat("EEEE dd 'de' MMMM 'de' yyyy h:mm:ss:SSS") };
		// int numItera = 5;
		// for (Date d = new Date();;d = new Date(d.getTime()+1468800000)) {//3600000
		// for (SimpleDateFormat sdf : sdfs) {
		// System.out.println(sdf.format(d));
		// }
		// if (--numItera==0) break;
		// }
		// }
		//
		//

		SimpleDateFormat formato = new SimpleDateFormat("yyMMddyyHHmmss");
		Date ahora = new Date ();
		System.out.println(formato.format(ahora));
	}
}
