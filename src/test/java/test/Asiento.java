package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String nuevoColor){
		if(nuevoColor == "rojo" ||nuevoColor == "verde" ||nuevoColor == "amarillo" ||nuevoColor == "negro" ||nuevoColor == "blanco")  {
			color = nuevoColor;
			
	
		}
		
	}
}
/* El m�todo de instancia cambiarColor(), recibir� un argumento String que ser� el
valor a asignar al atributo color del objeto, tenga en cuenta que los �nicos
valores permitidos para cambiar el color ser�n rojo, verde, amarillo, negro y
blanco, cualquier otro color no cambiara el color del Asiento.*/