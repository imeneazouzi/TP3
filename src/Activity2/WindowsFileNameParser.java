package Activity2;

public class WindowsFileNameParser implements FileNameParser {

	@Override
	public String parseFileName(String path) {
		
		int index = path.lastIndexOf("\\");
		
		String r = path.substring(index+1);
		return r;
	}

}