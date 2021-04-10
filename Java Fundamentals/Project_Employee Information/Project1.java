class Project1{
	public static void main(String args[]){
		int EmpNo[]={1001,1002,1003,1004,1005,1006,1007};
		String EmpName[]={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String JoinDate[]={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
		char DesCode[]={'e','c','k','r','m','e','c'};
		String Dep[]={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int Basic[]={20000,30000,10000,12000,50000,23000,29000};
		int HRA[]={8000,12000,8000,6000,20000,9000,12000};
		int IT[]={3000,9000,1000,2000,20000,4400,10000};
		String Des[]=new String[7];
		int DA[]=new int[7];
		long Salary[]=new long[7];
		for(int i=0;i<7;i++){
			char code=DesCode[i];
			switch(code){
				case 'e':{
					DA[i]=20000;
					Des[i]="Engineer";
				}
				break;
				case 'c':{
					DA[i]=32000;
					Des[i]="Consultant";
				}
				break;
				case 'k':{
					DA[i]=12000;
					Des[i]="Clerk";
			    }
				break;
				case 'r':{
					DA[i]=15000;
					Des[i]="Receptionist";
				}
				break;
				case 'm':{
					DA[i]=40000;
					Des[i]="Manager";
				}
				break;
			}
		}
		for(int i=0;i<7;i++){
			Salary[i]=Basic[i]+HRA[i]+DA[i]-IT[i];
		}
		int empid= Integer.parseInt(args[0]);
		int index=-1;
		for(int i=0;i<7;i++){
			if(empid == EmpNo[i]){
				index=i;
			}
		}
		if(index!=-1){
			System.out.println("Emp No. Emp Name Department Designation Salary");
			System.out.print(EmpNo[index]+"\t"+EmpName[index]+"\t"+" "+Dep[index]+"\t"+Des[index]+"\t"+Salary[index]);
		}
		else{
			System.out.println("There is no employee with empid : "+empid);
		}
	}
}