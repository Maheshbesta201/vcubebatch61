package langfundamentals;

public class Btech {

	public static void main(String[] args) {
		Btech b=new Btech();
		System.out.println("Third sem total marks : "+b.Thirdsem());
		System.out.println("Fourth sem total marks : "+b.Fourthdsem());
		System.out.println("Fifth sem total marks : "+b.fifthsem());
		System.out.println("Sixth sem total marks : "+b.sixthsem());
		System.out.println("Seventh sem total marks : "+b.seventhsem());
		System.out.println("Eighth sem total marks : "+b.eighthsem());
		int allsemtotal=b.Thirdsem()+b.Fourthdsem()+b.fifthsem()+b.sixthsem()+b.seventhsem()+b.eighthsem();
		System.out.println("All sems total marks : "+allsemtotal);
		double percentage=(allsemtotal *100)/4630;
		System.out.println("Total Btech Percentage : "+percentage);


		
	}
	
	int Thirdsem() {
		int mefa=50;
		int dcm=55;
		int eca=48;
		int dld=48;
		int cvt=61;
		int ecalab=95;
		int dldlab=95;
		int dcmlab=96;
		int pythonlab=94;
		int total=mefa+dcm+eca+dld+cvt+ecalab+dldlab+dcmlab+pythonlab;
		return total;
	}
	int Fourthdsem() {
		int pe=64;
		int emf=47;
		int acm=51;
		int nmpt=60;
		int aec=58;
		int pelab=96;
		int aeclab=94;
		int pspice=92;
		int acmlab=96;
		int total=pe+emf+acm+nmpt+aec+pelab+aeclab+pspice+acmlab;
		return total;
	}
	int fifthsem() {
		int cs=51;
		int ms=60;
		int cem=61;
		int sp=47;
		int psa=48;
		int mslab=91;
		int sslab=91;
		int cslab=88;
		int csp=98;
		int total=cs+ms+cem+sp+psa+mslab+sslab+cslab+csp;
		return total;
	}
	int sixthsem() {
		int dcp=45;
		int pem=51;
		int hvdc=53;
		int psa=48;
		int dsp=57;
		int dsplab=94;
		int dcplab=88;
		int psalab=97;
		int ippr=21;
		int asct=92;
		int total=dcp+pem+hvdc+psa+dsp+dsplab+dcplab+psalab+asct;
		return total;
	}
	int seventhsem() {
		int psoc=49;
		int smart=71;
		int hsem=57;
		int sa=53;
		int ms=52;
		int ldica=64;
		int intern=90;
		int ec=94;
		int total=psoc+smart+hsem+sa+ms+ldica+intern+ec;
		return total;
	}
	int eighthsem() {
		int project=192;
		int total=project;
		return total;
	}

}
