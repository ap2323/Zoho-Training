class LeftNumberTriangle{
     
     private void triangle() {
     	int number = 1;
           for(int startPos =0; startPos<5; startPos++) {
           	for(int nextPos=0; nextPos<=startPos; nextPos++) {
           		System.out.print(" "+number++);
           	}
           	System.out.println();
           }
     }
     
     public static void main(String[] args) {
     	LeftNumberTriangle leftNumberTriangle = new LeftNumberTriangle();
     	leftNumberTriangle.triangle();
     }
     
  }
