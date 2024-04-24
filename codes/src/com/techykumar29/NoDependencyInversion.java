package com.techykumar29;

public class NoDependencyInversion {

	public static void main(String[] args) {
		OSManager osm = new OSManager(new Windows());
		System.out.println(osm.getOSDetails());
	}
}
interface OS{
	String getOS();
}
class Windows implements OS{

	@Override
	public String getOS() {
		return "Windows Operating System.";
	}
	
}
class Mac implements OS{

	@Override
	public String getOS() {
		return "Mac Operating System.";
	}
	
}
class OSManager {
	private Windows wos;
	
	public OSManager(Windows wos) {
		this.wos = wos;
	}
	
	public String getOSDetails() {
		return wos.getOS();
	}
}
