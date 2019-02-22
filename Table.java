class Table {
	public static void main(String... args){

		int n = 9;

		System.out.println("Number is : "+n);

		for(int i=1;i<=10;i++){
			System.out.print(n);
			System.out.print("*");
			System.out.print(i);
			System.out.print("=");
			System.out.print(n*i);
			System.out.println();
		}

	}
}