// Java Program to Illustrate Native Keyword
// Inside DLL named: NameOfDLLFile

// Main class
// NativeDemo
class FirstDllJava {

	// Method 1
	public static void main(String[] args)
	{

		int i;

		// Here we will not be having body of this method
		// in our java code here
		FirstDllJava obj = new FirstDllJava();

		i = null;

		System.out.println("Before native method: var = "
						+ i);

		obj.test();

		System.out.println("After native method: var = "
						+ i);
	}

	// Native method
	public static native void test();
	{

		
			// We will be loading body from DLL file
			// It has to be present in DLL file
			System.loadLibrary("FirstDll");

			// Above C code in loaded in the JVM
			
		
	}
}

