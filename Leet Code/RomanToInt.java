class RomanToInt {
    public int romanToInt(String s) {
        int result = 0;
        int prevValue = getValue(s.charAt(0)); 

        for (int i = 1; i < s.length(); i++) {
            int currValue = getValue(s.charAt(i));
            result += prevValue < currValue ? -prevValue : prevValue;
            prevValue = currValue;
        }
        result += prevValue;

        return result;
    }

    private static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
