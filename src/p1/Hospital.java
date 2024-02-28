package p1;
class Hospital 
{
	//Instance variable
		String  patientName;
		int patientid;
		//Static(class)variable
		static String DocName="Dr.Murthy";
		void sethospital(String pN,int pId)
		{
			patientName=pN;
			patientid=pId;
		}
		String getpatientName()
		{
			return patientName;
		}
		int getpatientid()
		{
			return patientid;
		}
}
class Demoscopeofvariables
{
	public static void main(String args[])
	{
			//Local variable
			String hospitalName="Apollo Hospital";
			Hospital patient1=new Hospital();
			patient1.sethospital("Anita Joseph",101);
			System.out.println("The given "+ patient1.getpatientName()+"\t"+"with the id " + patient1.getpatientid() + 
					" is treated by " + patient1.DocName + " at " +hospitalName);
			
		
	}

}
