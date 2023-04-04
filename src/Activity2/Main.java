package Activity2;


public class Main {

	public static void main(String[] args) {
		LinuxFileNameParserFactory linuxFact=new LinuxFileNameParserFactory();
		WindowsFileNameParserFactory windowsFact=new WindowsFileNameParserFactory();
		LinuxFileNameParser linux =linuxFact.createFileNameParser();
		WindowsFileNameParser windows =windowsFact.createFileNameParser();
		LinuxCountFolders lin =linuxFact.createCountFolders();
		WindowsCountFolders win =windowsFact.createCountFolders();
		String w=windows.parseFileName("C:\\Windows\\hello.dll");
		String l=linux.parseFileName("/user/share/hello.rc");
		int nw=win.nbFolders("C:\\Windows\\hello.dll");
		int nl=lin.nbFolders("/user/share/hello.rc");
		System.out.println(l+"***"+w);
		System.out.println(nl+"***"+nw);
		
		
	}
	
	
}
