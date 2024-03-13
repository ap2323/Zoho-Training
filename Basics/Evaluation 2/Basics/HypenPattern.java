import java.util.Scanner;

class HypenPattern {
	
	Scanner scanner = new Scanner(System.in);
	int size,coln;
	
	private void printPattern(){
		int row =0, coln=0;
		for(coln= 0; coln<=size; coln++) {
			if(row==size){
				break;
			}
			if(coln<size) {
				System.out.print("-");
			}
			
			
			if(coln>=size){
			System.out.println();
			coln=-1;
			row++;
			}
			
		}
			
		/*while(coln<=size){
			if(row==size){
				break;
			}
			if(coln<size) {
				System.out.print("-");
			}
			
			
			if(coln>=size){
			System.out.println();
			coln=0;
			row++;
			continue;	
			}
			coln++;
		}*/
					
		
	}
	
	private void getInput() {
		System.out.println("Enter Size: ");
		size = scanner.nextInt();
		
		printPattern();
	}
	public static void main(String[] args){
		HypenPattern hypenPattern = new HypenPattern();
		hypenPattern.getInput();
	}
	
}
