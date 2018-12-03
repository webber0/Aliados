package pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archivo {
	public Vecino[] leerArchivo(String entrada,Vecino[] vecinos,Lider lideres) throws FileNotFoundException {
		File archivo=new File(entrada);
		Scanner sc=new Scanner(archivo);
		int cantidad_vecinos=sc.nextInt();
		int cantidad_alizanzas=sc.nextInt();
		vecinos=new Vecino[cantidad_alizanzas];
		lideres.setLider1(sc.nextInt());
		lideres.setLider2(sc.nextInt());
		int nivel_amistad=0;
		for(int f=0;f<cantidad_alizanzas;f++) {
			int vecino1=sc.nextInt();
			int vecino2=sc.nextInt();
			nivel_amistad=sc.nextInt();
			if(vecino1==lideres.getLider1()) {
				Vecino v=new Vecino();
				v.setVecino1(vecino2);
				v.setVecino2(vecino1);
				v.setAmistad(nivel_amistad);
				vecinos[f]=v;
				
			}else {
				if(vecino1==lideres.getLider2()) {
					Vecino v=new Vecino();
					v.setVecino1(vecino2);
					v.setVecino2(vecino1);
					v.setAmistad(nivel_amistad);
					vecinos[f]=v;
				}else {
					if(vecino2==lideres.getLider1()) {
						Vecino v=new Vecino();
						v.setVecino1(vecino1);
						v.setVecino2(vecino2);
						v.setAmistad(nivel_amistad);
						vecinos[f]=v;
					}else {
						if(vecino2==lideres.getLider2()) {
							Vecino v=new Vecino();
							v.setVecino1(vecino1);
							v.setVecino2(vecino2);
							v.setAmistad(nivel_amistad);
							vecinos[f]=v;
						}else {
							Vecino v=new Vecino();
							v.setVecino1(vecino1);
							v.setVecino2(vecino2);
							v.setAmistad(0);
							vecinos[f]=v;
						}
					}
				}
			}
		}
		mirarVector(vecinos);
		sc.close();
		return vecinos;
	}
	public void escribirArchivo(String salida) {
		
	}

	private void mirarVector(Vecino[] vecinos) {
		System.out.println("-----------------------------\nAlianzas actuales");
		for(int i=0;i<vecinos.length;i++) {
			System.out.println("Vecino 1: "+vecinos[i].getVecino1()+"Vecino 2: "+vecinos[i].getVecino2()+" Amistad: "+vecinos[i].getAmistad()+" Esta visitado? :"+vecinos[i].isVisitado());
		}
		System.out.println("-----------------------------");
	}
}
