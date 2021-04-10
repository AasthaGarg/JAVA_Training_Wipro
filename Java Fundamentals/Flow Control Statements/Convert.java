class Convert{
	public static void main(String args[]){
		char value='a';
		int temp;
		if(value>='a' && value<='z'){
			temp=(int)value-32;
			value=(char)temp;
			System.out.println(value);
		}
		else if(value>='A' && value<='Z'){
			temp=(int)value+32;
			value=(char)temp;
			System.out.println(value);
		}
	}
}