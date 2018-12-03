package pack;
import java.util.*;
public class Alianza {
	public void resolver_alianza(Vecino[] vecino,Lider lider) {
		int i=0,j=0;
		int l1=0,l2=0;
		Arrays.sort(vecino);
		//recorrerVector(vecino);
		Vecino[] filtrado=filtrar(vecino,lider);
		recorrerVector(filtrado);
		mirarAliaznas(lider);
	}
	
	private void mirarAliaznas(Lider lideres) {
		System.out.println("-----------------------------\nCantidad de Alianzas");
		System.out.println("Cant Aliaznas Lider1: "+lideres.getCantidad_aliados_lider1()+" Cant Aliaznas Lider2: "+lideres.getCantidad_aliados_lider2());
		System.out.println("-----------------------------");
	}
	private void inicializarVector(boolean[] visitados) {
		for(int i=0;i<visitados.length;i++) {
			visitados[i]=false;
		}
	}
	private void recorrerVector(Vecino[] vecino) {
		for(int i=0;i<vecino.length;i++) {
			System.out.println("Vecino1: "+vecino[i].getVecino1()+" Vecino2: "+vecino[i].getVecino2()+" Amistad:"+vecino[i].getAmistad());
		}
	}
	private Vecino[] filtrar(Vecino[] original,Lider lider) {
		Vecino[] v;
		int cant=0;
		int j=0;
		for(int i=0;i<original.length;i++) {
			if(original[i].getVecino2()==lider.getLider1() || original[i].getVecino2()==lider.getLider2()) cant++;
		}
		v=new Vecino[cant];
		for(int i=0;i<original.length;i++) {
			if(original[i].getVecino2()==lider.getLider1() || original[i].getVecino2()==lider.getLider2()) {v[j]=original[i]; j++;}
		}
		return v;
	}
}
