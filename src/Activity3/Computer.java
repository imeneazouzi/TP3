package Activity3;

public class Computer {
	//required parameters
	private String HDD;
	private String RAM;
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public Computer(String hDD, String rAM, boolean isGraphicsCardEnabled, boolean isBluetoothEnabled) {
		HDD = hDD;
		RAM = rAM;
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}
	public String getHDD() {
	return HDD;
	}
	public String getRAM() {
	return RAM;
	}
	public boolean isGraphicsCardEnabled() {
	return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
	return isBluetoothEnabled;
	}
	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
}
