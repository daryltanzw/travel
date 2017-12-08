package sg.bizplus.backend.mock;

import java.util.ArrayList;
import java.util.List;

public class MockPackageDS {
	public static List<PackageDetail> getPackages(){
		List<PackageDetail> pkgList = new ArrayList<>();
		String info = "Thailand 4D3N"; 
		PackageDetail pkg1 = new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/HimalayasPic.jpg", info);
		pkgList.add(pkg1);
		pkgList.add(new PackageDetail("C:/Dev/git/travelBooking/dynamicImages/CostaRicaBeach.jpg", ""));
		return pkgList;
	}
}
