package gen.debug;

public class Multiplicacion {
	
	public int multiplica(int multiplicando, int multiplicador) {
		Suma sum = new Suma();
		int resultado = 0;
		
		for(int i=0; i<multiplicador ; i++) {
			resultado = sum.sumita(multiplicando);
		}
		return resultado;
	}

}
