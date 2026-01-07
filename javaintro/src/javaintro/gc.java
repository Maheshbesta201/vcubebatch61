package javaintro;

public class gc {

	@Override
	protected void finalize() {
		System.out.println("garbage called ");
	}

	public static void main(String[] args) {
		gc g = new gc();
		g = null;
		System.gc();
		gc g1 = new gc();
		gc g2 = new gc();
		gc g3 = new gc();
		System.out.println(g);
//		@1c4af82c
		System.out.println(g1);
//		@379619aa
		System.out.println(g2);
//		@cac736f
		g3 = g1;
		System.out.println(g3);
	}

}
