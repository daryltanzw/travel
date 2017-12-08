package sg.bizplus.backend.mock;

public class PackageDetail {
	
	private String fullFilePath;
	private String info;
	
	public PackageDetail(String fullFilePath, String info) {
		this.setFullFilePath(fullFilePath);
		this.setInfo(info);
	}

	public String getFullFilePath() {
		return fullFilePath;
	}

	public void setFullFilePath(String fullFilePath) {
		this.fullFilePath = fullFilePath;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
