class ReverseCharacters {

    public static void reverse(char[] chars) {
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters at left and right pointers
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            // Move pointers towards each other
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original characters: " + new String(chars));
        reverse(chars);
        System.out.println("Reversed characters: " + new String(chars));
    }
}
