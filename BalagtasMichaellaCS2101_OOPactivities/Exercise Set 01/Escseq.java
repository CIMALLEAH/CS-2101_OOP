public class AlternatingTabs {
    public static void main(String[] args) {
        int limit = 35;
        boolean useTab = false;

        for (int i = 1; i <= limit / 7; i++) {
            int multipleOf7 = i * 7;

            if (useTab) {
                System.out.println("\t" + multipleOf7);
            } else {
                System.out.println(multipleOf7);
            }

            useTab = !useTab;
        }
    }
}
