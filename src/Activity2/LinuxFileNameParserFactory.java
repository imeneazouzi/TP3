package Activity2;

public class LinuxFileNameParserFactory implements FileNameParserFactory{
	@Override
    public LinuxFileNameParser createFileNameParser() {
        return new LinuxFileNameParser();
    }

	@Override
	public LinuxCountFolders createCountFolders() {
		// TODO Auto-generated method stub
		return new LinuxCountFolders();
	}
}
