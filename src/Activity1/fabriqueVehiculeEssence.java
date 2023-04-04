package Activity1;

public class fabriqueVehiculeEssence implements fabriqueVehicule{

	@Override
	public Automobile createAutomobile() {
		// TODO Auto-generated method stub
		return new AutomobileEssence();
	}

	@Override
	public Scooter createScooter() {
		// TODO Auto-generated method stub
		return new ScooterEssence();
	}

	

}
