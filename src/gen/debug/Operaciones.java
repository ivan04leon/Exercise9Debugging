package gen.debug;

public class Operaciones {
	Multiplicacion multi = new Multiplicacion();
	int respuesta =0;
	
	public int aMulti (int multiplicando, int multiplicador) {
		respuesta = multi.multiplica(multiplicando, multiplicador);
		return respuesta;
	}

}
