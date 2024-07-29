package Tienda;

public class Tienda {

	public Tienda() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Color color = new Color();
		color.setNombre("rojo");
		
		TipoPintura tipoPintura = new TipoPintura();
		tipoPintura.setNombre("Aceite");
		
		Pintura pintura = new Pintura ();
		pintura.setCodigo("00110");
		pintura.setColor(color);
		pintura.setTipoPintura(tipoPintura);
		
		Empleado jose = new Empleado();
		jose.setCodigo("0010");
		jose.setNombre("Jose Martinez");
		jose.despachar(pintura);

	}
	

}
