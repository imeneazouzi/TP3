package Activity1;

public class fabriqueVehiculeElectrique implements fabriqueVehicule {
	@Override
	public Automobile createAutomobile() {
		// TODO Auto-generated method stub
		return new AutomobileElectricite();
	}

	@Override
	public Scooter createScooter() {
		// TODO Auto-generated method stub
		return new ScooterElectrique();
	}

	
}
