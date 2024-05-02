package jconcepts;
/*
 * 
 * les 5 concepts:
 * Objet et classe: chaque élément du code d'un projet est une classe
 * encapsulation: les attributs doivent etre accessible via des méthodes
 * héritage
 * polymorphisme
 * abstraction
 * 
 */



public class Ordinateur {
	// POJO
 private String marque,cpu;
 private int ram;
 private double prix;
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getCpu() {
	return cpu;
}
public void setCpu(String cpu) {
	this.cpu = cpu;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public Ordinateur(String marque, String cpu, int ram, double prix) {
	super();
	// accés via une méthode
	
	this.marque = marque;
	this.cpu = cpu;
	this.ram = ram;
	this.prix = prix;
}
public Ordinateur() {
	super();
	// TODO Auto-generated constructor stub
}
@Override // polymorphysme
public String toString() {
	return "Ordinateur [marque=" + marque + ", cpu=" + cpu + ", ram=" + ram + ", prix=" + prix + "]";
}



// end OF POJO




}
