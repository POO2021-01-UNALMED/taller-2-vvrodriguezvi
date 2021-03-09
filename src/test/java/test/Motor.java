package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int nuevoRegistro){
		registro = nuevoRegistro;
	}
	void asignarTipo(String nuevoTipo) {
		if(nuevoTipo == "electrico" ||nuevoTipo == "gasolina" )  {
			tipo = nuevoTipo;
	    }
	}
}
/*El método cambiarRegistro(), recibirá como argumento un int que cambiara el
numero del registro del objeto
- El método asignarTipo(), recibirá como argumento un String que cambiara el
tipo de motor, este valor solo podrá ser cambiado por el valor electrico o
gasolina, en caso contrario no modificara el valor*/