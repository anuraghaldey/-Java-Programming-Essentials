package Ch_11_AbstractClassesAndInterfaces;

class cellphone {
	public void Cell() {
		System.out.println("THE INITIAL FORM OF PHONE IS CELLPHONE!");
	}

	public void cellphone() {
		System.out.println("THE INITIAL FORM OF PHONE IS CELLPHONE!");
	}
}

interface camera {
	public void camera();
}

interface GPS {
	public void GPS();
}

interface MediaPlayer {
	public void Mediaplayer();
}

class smartphone extends cellphone implements camera, GPS, MediaPlayer {
	@Override
	public void cellphone() {
		System.out.println("SMARTPHONE IS AN UPDATED VERSION OF CELLPHONE!");
	}

	public void camera() {
		System.out.println("CAMERA IS A FUNCTION OF SMARTPHONE WHICH WAS NOT A FUNCTION OF CELL PHONE!");
	}

	public void GPS() {
		System.out.println("GPS IS AN ADVANCE FUNCTION OF SMARTPHONE!");
	}

	public void Mediaplayer() {
		System.out.println("MEDIA PLAYER IS AN ADVANCED FUNCTION OF SMARTPHONE!");
	}
}

public class InterfacesImplementation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartphone S = new smartphone();
		S.Cell();
		S.cellphone();
		S.camera();
		S.GPS();
		S.Mediaplayer();
		// IN THE ABOVE CASE WE ARE ABLE TO MAKE A SINGLE CLASS USING MULTIPLE
		// INTERFACES AND SIMULTANEOUSLY WE ARE ABLE TO INHERIT THE SAME CLASS
	}

}
