package test7;

public class Teacher {
	private String Tname;
	private int Tnum;

 	public Teacher(int Tnum ,String Tname) {
		this.Tname = Tname;
		this.Tnum = Tnum;		

 	}

 	public void setTname(String Tname) {	
		this.Tname = Tname;
	}

 	public void setTnum(int Tnum) {
		this.Tnum = Tnum; 
	}

 	public String getTname() {
		return Tname;
	}

 	public int getTnum() {
		return Tnum;
	}

 	
	public String toString() {
		return "{½ÌÊ¦±àºÅ:"+Tnum+"   ½ÌÊ¦ÐÕÃû:" +Tname+"}";
	}
}