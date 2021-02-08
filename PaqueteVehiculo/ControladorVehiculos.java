package PaqueteVehiculo;

public class ControladorVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo vehiculoVacio = new Vehiculo();
		Vehiculo miVehiculo = new Vehiculo("Spring1001","ACME","Rojo",2015);
		Coche cocheVacio =new Coche();
		Coche miCoche = new Coche("León","Seat","Amarillo",2009,3,"Deportivo");
		Moto motoVacio = new Moto();
		Moto miMoto = new Moto("DT", "Yamaha", "Azul",2001,125);
		Camion camionVacio = new Camion();
		Camion miCamion = new Camion("JTT6","Pegaso","Verde",2020,20,"De 8 Ruedas");
		

		System.out.println(vehiculoVacio.toString());
		System.out.println(miVehiculo.toString());
		System.out.println(cocheVacio.toString());
		System.out.println(miCoche.toString());
		System.out.println(motoVacio.toString());
		System.out.println(miMoto.toString());
		System.out.println(camionVacio.toString());
		System.out.println(miCamion.toString());
		
		//P o l i m o r f i s m o//
		Vehiculo [] arrayVehiculo= {vehiculoVacio,miVehiculo,cocheVacio,miCoche,motoVacio,miMoto,camionVacio,miCamion};
		for(int i=0;i<arrayVehiculo.length;i++) {
			System.out.println(arrayVehiculo[i].toString());
		}
		
		
	}
		
}


