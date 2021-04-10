package bean;

public class RDAccount extends Account{
	int noOfMonths;
	double monthlyAmount;
	int ageOfACHolder;
    public double calculateInterest() {
    	double rateOfInterest=0;
    	double interest=0;
    	if(noOfMonths>=6 && noOfMonths<9) {
    		rateOfInterest=7.50;
    	}
    	else if(noOfMonths==9 && noOfMonths<12) {
    		rateOfInterest=7.75;
    	}
    	else if(noOfMonths==12 && noOfMonths<15) {
    		rateOfInterest=8;
    	}
    	else if(noOfMonths==15 && noOfMonths<18) {
    		rateOfInterest=8.25;
    	}
    	else if(noOfMonths==18 && noOfMonths<21) {
    		rateOfInterest=8.50;
    	}
    	else if(noOfMonths>=21) {
    		rateOfInterest=8.75;
    	}
    	if(ageOfACHolder>=65) rateOfInterest+=0.5;
    	interest=amount*rateOfInterest/100;
    	return interest;
    }
    public double getInterestRate() {
    	return interestRate;
    }
    public void setInterestRate(int interestRate) {
    	this.interestRate=interestRate;
    }
    public double getAmount() {
    	return amount;
    }
    public void setAmount(double amount) {
    	this.amount=amount;
    }
    public int getNoOfMonth() {
    	return noOfMonths;
    }
    public void setNoOfMonth(int noOfMonths) {
    	this.noOfMonths=noOfMonths;
    }
    public double getMonthlyAmount() {
    	return monthlyAmount;
    }
    public void setMonthlyAmount(double monthlyAmount) {
    	this.monthlyAmount=monthlyAmount;
    }
    public int getAgeOfACHolder() {
    	return ageOfACHolder;
    }
    public void setAgeOfACHolder(int ageOfACHolder) {
    	this.ageOfACHolder=ageOfACHolder;
    }
}

