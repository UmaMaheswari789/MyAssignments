package week1.day2;

public class Car {
	public void PrintCarBrand()
	{
		System.out.println("Swift");
		}
	public String getCarColor()
	{
		return "Red";}

	public long CarEnginenumber()
	{
		return 23665544564887L;
	}
	public int sub (int a, int b) {
		int c = a-b;
		return c;
	}
		public int mul(int a, int b)	{
			int d=a*b;
			return d;
		}
		public int div(int a, int b) {
		int e=a/b;
		return e;
}
		public static void main (String[]args) {
			Car carobj =new Car();
			carobj.PrintCarBrand();
			System.out.println("Red");
			System.out.println("CarEnginenumber=23665544564887");
			int sub= carobj.sub(10,5);
			System.out.println("sub value"+sub);
			int mul= carobj.mul(10,5);		
			System.out.println("mul value"+mul);
			int div= carobj.div(10,5);	
			System.out.println("div value"+div);
			
			
	}
		
	

}
