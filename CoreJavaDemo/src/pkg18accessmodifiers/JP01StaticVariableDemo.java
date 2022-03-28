package pkg18accessmodifiers;


class StaticVarDemo {
	
	public static int staticInt = 0;
	public int normalInt = 0;
	
	public StaticVarDemo() {

		staticInt++;
		normalInt++;
	}
}

public class JP01StaticVariableDemo {

	public static void main(String[] args) {
		
		System.out.println(StaticVarDemo.staticInt);
//		System.out.println(StaticVarDemo.normalInt);

		StaticVarDemo sObj1 = new StaticVarDemo();
		System.out.println(sObj1.staticInt);  // Not recommended
		System.out.println(sObj1.normalInt);

		StaticVarDemo sObj2 = new StaticVarDemo();
		System.out.println(StaticVarDemo.staticInt);  // recommended
		System.out.println(sObj2.normalInt);
	}
}
