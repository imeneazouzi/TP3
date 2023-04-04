package Activity3;

public class TestBuilderPattern {

	public static void main(String[] args) {
		ComputerBuilder computerBuilder=new ComputerBuilder();
		computerBuilder.setHDD("sata 512gb");
		computerBuilder.setRAM("gigaByte 32gb");
		Computer computer=computerBuilder.buildComputer();
		System.out.println(computer);

	}

}
