package sg.bizplus.backend.mock;

import java.util.ArrayList;
import java.util.List;

public class MockPackageDS {
	public static List<PackageDetail> getPackages() {
		List<PackageDetail> pkgList = new ArrayList<>();
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Mountain.jpg", "Nepal", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Beach.jpg", "Thailand", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Ang Kor Wat.jpg", "Cambodia", ""));
		
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Mountain.jpg", "Bali", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Beach.jpg", "Philippines", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Ang Kor Wat.jpg", "Laos", ""));
		
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Mountain.jpg", "Nepal", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Beach.jpg", "Thailand", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Ang Kor Wat.jpg", "Cambodia", ""));
		
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Mountain.jpg", "Bali", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Beach.jpg", "Philippines", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Ang Kor Wat.jpg", "Laos", ""));
		return pkgList;
	}
	
	public static PackageDetail getNewPackageDetail() {
		return new PackageDetail("", "", "");
	}
}
