import derivada.*;

public class Principal {

	public static void main(String[] args) {
		
		
		ProveedorAca grua1 = new ProveedorAca();
		
		System.out.println("--- ACA ---");
		System.out.println("ID: " + grua1.pedirGrua());
		grua1.cancelarGrua(grua1.getId());
		System.out.println("Tiempo de demora: " + grua1.consultarEstadoGrua());
		System.out.println("Proveedor: " + grua1.getNombreProveedor());
		
		ProveedorSos grua2 = new ProveedorSos();
		
		System.out.println("");
		System.out.println("--- SOS ---");
		System.out.println("ID: " + grua2.pedirGrua());
		grua2.cancelarGrua(grua2.getId());
		System.out.println("Tiempo de demora: " + grua2.consultarEstadoGrua());
		System.out.println("Proveedor: " + grua2.getNombreProveedor());
		

	}

}
