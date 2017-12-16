package sg.bizplus.backend.mock;

import java.util.ArrayList;
import java.util.List;

public class MockPackageDS {
	public static List<PackageDetail> getPackages() {
		List<PackageDetail> pkgList = new ArrayList<>();
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Mountain.jpg", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Beach.jpg", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Ang Kor Wat.jpg", ""));
		
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Mountain.jpg", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Beach.jpg", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Ang Kor Wat.jpg", ""));
		
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Mountain.jpg", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Beach.jpg", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Ang Kor Wat.jpg", ""));
		
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Mountain.jpg", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Beach.jpg", ""));
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/Ang Kor Wat.jpg", ""));
		return pkgList;
	}
}
