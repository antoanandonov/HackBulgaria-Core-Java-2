package Task_1;

public @interface ClassInfo
{
	String author();

	int age();
}

@ClassInfo(author = "Antoan", age = 21)
class Main
{
	public static void main(String[] args)
	{
		ClassInfoTest instance = new ClassInfoTest();
		System.out.println(instance.getClass().getAnnotations());
		System.out.println(instance.getClass().getAnnotation(ClassInfo.class));
	}
}