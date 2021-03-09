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
/* El método de instancia cambiarColor(), recibirá un argumento String que será el
valor a asignar al atributo color del objeto, tenga en cuenta que los únicos
valores permitidos para cambiar el color serán rojo, verde, amarillo, negro y
blanco, cualquier otro color no cambiara el color del Asiento.*/