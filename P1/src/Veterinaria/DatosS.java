package Veterinaria;

public class DatosS {
	public int numVacunas, numEnfermedades;
	private String discapacidad;
	public DatosS(int numVacunas, int numEnfermedades, String discapacidad) {
		this.numVacunas = numVacunas;
		this.numEnfermedades = numEnfermedades;
		this.discapacidad = discapacidad;
	}
	public int getNumVacunas() {
		return numVacunas;
	}
	public void setNumVacunas(int numVacunas) {
		this.numVacunas = numVacunas;
	}
	public int getNumEnfermedades() {
		return numEnfermedades;
	}
	public void setNumEnfermedades(int numEnfermedades) {
		this.numEnfermedades = numEnfermedades;
	}
	public String getDiscapacidad() {
		return discapacidad;
	}
	public void setDiscapacidad(String discapacidad) {
		this.discapacidad = discapacidad;
	}
	
}
