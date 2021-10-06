package derivada;

import java.util.Random;

import base.ProveedorGruas;

public class ProveedorAca extends ProveedorGruas {
	private String nombreProveedor = "ACA";
	private int id;

	@Override
	public int pedirGrua() {
		Random rnd = new Random();
		
		this.id = rnd.nextInt(10000);
		
		return id;
	}
	public int getId() {
		return id;
	}

	@Override
	public void cancelarGrua(int id) {
		System.out.println("Se ha cancelado la grúa del proveedor ACA con id: " + id);
		
	}

	@Override
	public double consultarEstadoGrua() {
		double time = id * 2;
		return time;
	}

	@Override
	public String getNombreProveedor() {
		return nombreProveedor;
	}


}
