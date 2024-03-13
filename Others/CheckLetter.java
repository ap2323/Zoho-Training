import java.util.Scanner;

class CheckLetter {
            Scanner scanner = new Scanner(System.in);
            char letter;

            private void check() {
                        if(Character.isLetter(letter)) {
                                if(letter=='A' || letter == 'a' || letter == 'E' || letter == 'e' || letter == 'I' ||
					letter == 'i' || letter == 'O' || letter == 'o' || letter == 'U' || letter == 'u'){
                                                   System.out.println("Vowel");
                                 } else {
                                              System.out.println("Consonant");
                                 }
                          } else {
                              System.out.println("It is not a letter!");
                          }
             }
            private void getInput() {
                       System.out.println("Enter a character: ");
                       letter = scanner.next().charAt(0);
             }
            public static void main(String[] args) {
                         CheckLetter checkLetter = new CheckLetter();
                         checkLetter.getInput();
                         checkLetter.check();
              }
 }

