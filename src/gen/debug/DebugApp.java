package gen.debug;

public class DebugApp {

	public static void main(String[] args) {
		Operaciones oper = new Operaciones();
		int resultado = 0;
		resultado = oper.aMulti(3, 12);
		
		System.out.println("Resultado: " +resultado);

	}

}
