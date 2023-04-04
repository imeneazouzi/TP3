package Activity2;

public class LinuxCountFolders implements CountFolders{

	@Override
	public int nbFolders(String str) {
		String substr="/";
		int count = 0;
        int index = 0;
        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }
        return count-1;
	}

}
