import java.util.*;
class aadhar 
{
	static Scanner sc =new Scanner(System.in);
	private long aadhar_no;
	private String aadhar_name;
	private long contact_no;
	private String loc;

	private aadhar(){}

	private aadhar(long aadhar_no,String aadhar_name,long contact_no,String loc){
		this.aadhar_no= aadhar_no;
		this.aadhar_name=aadhar_name;
		this.contact_no=contact_no;
		this.loc=loc;
	}
	public boolean verification(){
		System.out.println("enter the contact number:");
		long user_c=sc.nextLong();
		if(contact_no==user_c){
		  int otp=(int)(Math.random()*9999+9999);
		  System.out.println("enter the otp:"+otp);
          int user_otp=sc.nextInt();
		  if (otp==user_otp)
		  {
			  System.out.println("......verification sucessful.....");
			  return true;
		  }
		}
		System.out.println("......verification failure.....");
		return false;
		
	}
	public long getaadhar_no(){
		return aadhar_no;
	}
	public String getaadhar_name(){
		return aadhar_name;
	}
	public long getcontact_no(){
		return contact_no;
	}
	public String getloc(){
		return loc;
	}
	public void setaadhar_name(String naadhar_name){
		if (verification())
		{
			aadhar_name=naadhar_name;
		}
	}
	public void setcontact_no(long ncon_no){
		if (verification())
		{
			contact_no=ncon_no;
		}
	}
	public void setloc(String nloc){
		if (verification())
		{
			loc=nloc;
		}
	}
	public static aadhar aadharobject(long aadhar_no,String aadhar_name,long contact_no,String loc){
	     return new aadhar(aadhar_no,aadhar_name,contact_no,loc);
	}
}
