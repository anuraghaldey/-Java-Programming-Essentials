package Ch_11_AbstractClassesAndInterfaces;

interface Book {
	public void meth1();

	public void meth2();

}

interface shelf extends Book {
	@Override
	public void meth1();

	public void meth2();

	public void meth3();

	public void meth4();

}

interface library extends shelf {
	@Override
	public void meth1();

	public void meth2();

	public void meth3();

	public void meth4();

	public void meth5();

	public void meth6();// HERE INHERITANCE IS SEEN IN INTERFACES
	// WE CAN INHERIT AN INTERFACE IN AN ANOTHER INTERFACE BUT WE CANT INHERIT
	// A CLASS USING INTERFACE
	// A CLASS CAN ONLY IMPLEMENT AN INTEFACE
}

class librarygroup implements library {
	@Override
	public void meth1() {
		System.out.println("A PAGE MADE UP OF WOOD");

	}

	public void meth2() {
		System.out.println("A BOOK IS MADE UP OF PAGES");
	}

	public void meth3() {
		System.out.println("GROUP OF BOOKS IS STORED IN SHLVES");
	}

	public void meth4() {
		System.out.println("THERE ARE GROUP OF SHELVES IN LIBRARIES");
	}

	public void meth5() {
		System.out.println("GROUP OF SHELVES MAKE A SINGLE LIBRARY ");
	}

	public void meth6() {
		System.out.println("GROUP OF LIBRARIES ");
	}
}

public class InheritanceInInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		librarygroup L = new librarygroup();
		L.meth1();
		L.meth2();
		L.meth3();
		L.meth4();
		L.meth5();
		L.meth6();

		library r = new librarygroup();
	}

}
