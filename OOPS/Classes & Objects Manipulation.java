static class Student {
	// your class code goes here
	String name;
	int rollNumber;
}

public static Student myFunction (String name, int rollNumber){
	// your function code goes here
	//Scanner sc=new Scanner(System.in);
	Student obj = new Student();
	obj.name=name;
	obj.rollNumber=rollNumber;
	return obj;

}
