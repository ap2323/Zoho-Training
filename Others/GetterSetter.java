import java.io.*;
class GetSet{
	private int id;
	private String name;
	
	public static GetSet getset = new GetSet();
	
	public void setName(String name){
		this.name = name;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
}

public class GetterSetter{
	int id = 1010;
	String name = "Arun";
	
	public void get(){
		System.out.println("ID: " + GetSet.getset.getId());
		System.out.println("Name: " + GetSet.getset.getName());
	}
	
	public void set(){
		GetSet.getset.setId(id);
		GetSet.getset.setName(name);
	}
	
	public static void main(String[] args){
		
		GetterSetter GS = new GetterSetter();
		GS.set();
		GS.get();
		
	}
	
}
