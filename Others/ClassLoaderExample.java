
public class ClassLoaderExample  
{  
	public static class inner{
		public void input(){
			System.out.println("Inner");
			}
		}
    public static void main(String[] args)  
    {    
        Class c=ClassLoaderExample.class;  
        System.out.println(c.getClassLoader());  
        System.out.println(c.getClass());
        //If we print the classloader name of String, it will print null because it is an  
        //in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader  
        System.out.println(String.class.getClassLoader());  
        
        ClassLoaderExample.inner innerClass = new ClassLoaderExample.inner();
        innerClass.input();
        
        System.out.println(innerClass.getClass());
    }  
}  
