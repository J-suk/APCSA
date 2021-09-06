public class MyClass {
    public static void main(String args[]) {

        String str = "CCAAAAATTT!";
        longestStreak(str);

    }


    public static void longestStreak(String str) {
        int maxCharacterCount = 0;
        char longestSubString = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            int currentMaxCharacterCount = 1;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    break;
                }

                else {
                    currentMaxCharacterCount++;
                }
            }

            if (currentMaxCharacterCount > maxCharacterCount) {
                maxCharacterCount = currentMaxCharacterCount;
                longestSubString = str.charAt(i);
            }
        }

        System.out.println(longestSubString + " " + maxCharacterCount);
    }

}
