class Initialize{
    public static void main(String args[]){
		char value='p';
		if((value>='a' && value<='z')||(value>='A' && value<='Z')){
			System.out.println("Alphabet");
		}
		else if(value>='0' && value<='9'){
			System.out.println("Digit");
		}
		else{
			System.out.println("Special Character");
		}
	}     
}