package sg.bizplus.backend.mock;

public class PackageDetail {
	
	private String fullFilePath = "";
	private String title = "";
	private String info ="";
	
	public PackageDetail() {}
	public PackageDetail(String fullFilePath, String title, String info) {
		this.setTitle(title);
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
