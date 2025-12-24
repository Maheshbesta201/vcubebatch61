package Collections;

public class Collection1 {
	int sid;
	String sname;
	String branch;
	
	public String toString() {
		return "Student id :"+sid+"Student Name : "+sname+"Student Branch: "+branch;
	}
	
	public Collection1(int sid,String sname,String branch) {
		this.sid=sid;
		this.sname=sname;
		this.branch=branch;
		
	}

	
}
