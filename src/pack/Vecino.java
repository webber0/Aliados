package pack;
import java.util.*;
public class Vecino implements Comparable<Vecino> {
	private int vecino1,vecino2,amistad;
	private boolean visitado=false;

	public int getVecino1() {
		return vecino1;
	}

	public void setVecino1(int vecino1) {
		this.vecino1 = vecino1;
	}

	public int getVecino2() {
		return vecino2;
	}

	public void setVecino2(int vecino2) {
		this.vecino2 = vecino2;
	}

	public int getAmistad() {
		return amistad;
	}

	public void setAmistad(int amistad) {
		this.amistad = amistad;
	}

	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}
	@Override
	public int compareTo(Vecino obj1) {
		return this.vecino1-obj1.vecino1;
	}
}
