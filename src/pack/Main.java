package pack;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Vecino[] vecinos=null;
		Lider lideres=new Lider();
		Archivo a=new Archivo();
		vecinos=a.leerArchivo("caso_base.in", vecinos,lideres);
		Alianza al=new Alianza();
		al.resolver_alianza(vecinos,lideres);
	}

}
