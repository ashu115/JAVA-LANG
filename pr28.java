/* Write a java program to accept string to check whether it is in Upper or Lower case.
After checking, case will be reversed.
 */
class pr28 {
    public static String toggleString(String sentence) {
        StringBuilder toggled = new StringBuilder(sentence.length());
        for (char sent : sentence.toCharArray()) {
            if (Character.isUpperCase(sent)) {
                sent = Character.toLowerCase(sent);
            } else if (Character.isLowerCase(sent)) {
                sent = Character.toUpperCase(sent);
            }
            toggled.append(sent);
        }
        return toggled.toString();
    }

    public static void main(String args[]) {
        String x = "I am Ashish";
        System.out.println("old : " + x);
        x = toggleString(x);
        System.out.println("new : " + x);
    }
}
