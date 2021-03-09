package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public int cantidadAsientos() {
		int contador = 0;
		for (int i = 0; i< asientos.length; i++) {
			if(asientos[i] != null) {
				contador++;
			}
		}
		return contador;
	}
	String verificarIntegridad() {
		boolean asientosIguales = true;
		
		for(int i = 0; i< asientos.length; i++) {
			if(asientos[i] != null) {
				if(asientos[i].registro != registro) {
					asientosIguales = false;
				}
			}
		}
		if((motor.registro == this.registro) && asientosIguales) {
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}

}
/* - cantidadCreados es un atributo de clase
- El método de instancia cantidadAsientos() retornara la cantidad de asientos que
efectivamente sean objetos Asiento en la lista del objeto Auto.
- El método verificarIntegridad(), se encargara de revisar que el atributo registro
de Motor, Auto y Cada Asiento sean el mismo, esto para ir en contra de la
piratería de piezas. En caso de encontrar que un Asiento, el Auto o el Motor
tiene un registro diferente al de los demás retornara el mensaje “Las piezas no
son originales” en caso contrario, retornara “Auto original”*/