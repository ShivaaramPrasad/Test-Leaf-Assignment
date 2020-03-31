package week1.day1;

public class Android {
	
 boolean AndLatest=true;
 String AndName="Android 10";
 int AndLevel=2020;
 float AndKernal=4.97f;
 long  AndSysupdate= 292102020L;
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Android a =new Android();
		
		boolean andLatest2 = a.AndLatest;
		String andName2 = a.AndName;
		int andLevel2 = a.AndLevel;
        float andKernal2 = a.AndKernal;
        long andSysupdate2 = a.AndSysupdate;
        
        System.out.println(a.AndKernal);
        
        System.out.println("Is it a latest version "+andLatest2);
        System.out.println("Android Name "+andName2);
        System.out.println("Relase year "+andLevel2);
        System.out.println("Kernal version "+andKernal2);
        System.out.println("System level update "+andSysupdate2);
        
	}

}
