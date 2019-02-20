class Temp <T,V>
{
	T.obj1;
	V.obj2;
	Temp(T.obj1, V.obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
class Main
{
	public static void main(String[] args) {
		Temp <String, Integer> obj = new Temp <String, Integer> ("H", 2);
		obj.print();
	}
}