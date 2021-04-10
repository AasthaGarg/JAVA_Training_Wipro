
public class Patient {
	String patientName;
	double height;
    double weight;
    Patient(double height,double weight,String name){
    	this.height=height;
    	this.weight=weight;
    	this.patientName=name;
    }
    double computeBMI() {
    	return weight/(height*height);
    }
	public static void main(String[] args) {
		Patient obj=new Patient(1.7,65,"Sumit");
		double ans=obj.computeBMI();
        System.out.println(ans);
	}

}
