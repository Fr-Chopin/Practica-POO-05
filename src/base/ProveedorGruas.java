package base;

public abstract class ProveedorGruas {
	
	public abstract int pedirGrua();
	
	public abstract void cancelarGrua(int id);
	
	public abstract double consultarEstadoGrua();
	
	public abstract String getNombreProveedor();
	
}
