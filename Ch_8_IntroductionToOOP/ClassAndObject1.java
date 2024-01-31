package Ch_8_IntroductionToOOP;

class Train {
	int number;
	String name;
}

public class ClassAndObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train Howrah = new Train();
		Howrah.name = "AZAD HIND EXPRESS";
		Howrah.number = 12345;

		Train PuneNGP = new Train();
		PuneNGP.name = "PUNE NAGPUR EXPRESS";
		PuneNGP.number = 32456;

		System.out.println(Howrah.name + " AND ITS NUMBER IS = " + Howrah.number);
		System.out.println(PuneNGP.name + " AND ITS NUMBER IS = " + PuneNGP.number);
	}

}
