class LetterCombinations {

    public static String[] letterCombinations(String digits) {
        if (digits == null || digits.length() == 0)
            return new String[0];

        String[] mapping = {
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        String[] result = {""}; // Initialize with an empty string

        for (int i = 0; i < digits.length(); i++) {
            int digit = Character.getNumericValue(digits.charAt(i));
            String[] temp = new String[result.length * mapping[digit].length()];
            int index = 0;
            for (String combination : result) {
                String letters = mapping[digit];
                for (int j = 0; j < letters.length(); j++) {
                    temp[index++] = combination + letters.charAt(j);
                }
            }
            result = temp;
        }

        return result;
    }

    public static void main(String[] args) {
        String digits = "73";
        String[] combinations = letterCombinations(digits);
        for (String combination : combinations) {
            System.out.print(combination + " ");
        }
    }
}

