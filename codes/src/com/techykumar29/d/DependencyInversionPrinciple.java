package com.techykumar29.d;

public class DependencyInversionPrinciple {
	public static void main(String[] args) {
		OSManager osm = new OSManager(new Mac());
		System.out.println(osm.getOSDetails());
		osm = new OSManager(new Windows());
		System.out.println(osm.getOSDetails());
	}
}
interface OS {
	String getOS();
}
class Windows implements OS {

	@Override
	public String getOS() {
		return "Windows Operating System.";
	}

}
class Mac implements OS {

	@Override
	public String getOS() {
		return "Mac Operating System.";
	}

}
class OSManager {
	private OS os;

	public OSManager(OS os) {
		this.os = os;
	}

	public String getOSDetails() {
		return os.getOS();
	}
}
