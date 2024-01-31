package Ch_11_AbstractClassesAndInterfaces;

interface GAME {
	void quality();// IN INTERFACES EVERY METHOD SHOULD BE ABSTRACT

	void graphics();
}

class GTA3 implements GAME {
	@Override
	public void quality() {
		System.out.println("LOW QUALITY GTA3");
	}

	public void graphics() {
		System.out.println("LOW GRAPHICS QUALITY GTA3");
	}
}

class AC4 implements GAME {

	@Override
	public void quality() {
		System.out.println("HIGH QUALITY ASSASSINS CREED");
	}

	public void graphics() {
		System.out.println("HIGH QUALITY GRAPHICS ASSASSINS CREED");
	}
}

public class IntroductionToInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AC4 A = new AC4();
		GTA3 G = new GTA3();
		A.quality();
		A.graphics();
		G.quality();
		G.graphics();
	}

}
