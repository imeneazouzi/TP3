package Activity2;

public class WindowsFileNameParserFactory implements FileNameParserFactory{
	@Override
    public WindowsFileNameParser createFileNameParser() {
        return new WindowsFileNameParser();
    }

	@Override
	public WindowsCountFolders createCountFolders() {
		// TODO Auto-generated method stub
		return new WindowsCountFolders();
	}
}
