package Activity3;

public class ComputerBuilder {
	//required parameters
	private String HDD;
	private String RAM;
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	public ComputerBuilder setHDD(String hDD) {
		HDD = hDD;
		return this;
	}
	public ComputerBuilder setRAM(String rAM) {
		RAM = rAM;
		return this;
	}
	public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		return this;
	}
	public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
		return this;
	}
	public Computer buildComputer()
	{
		return new Computer(HDD,RAM,isGraphicsCardEnabled,isBluetoothEnabled); 
	}
}
