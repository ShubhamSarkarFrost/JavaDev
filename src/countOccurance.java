public class countOccurance {

    public static int OccuranceCount(String mainSen, String searchSen){
        int count = 0 ;
        int index = 0;

        while((index= mainSen.indexOf(searchSen, index)) != -1){
            count++;
            index += searchSen.length();
        }

        return count;
    }

    public static void main(String[] args) {
        // Example strings to test the program
        String mainString = "hello hello world hello";
        String subString = "hello";

        int count = OccuranceCount(mainString, subString);
        System.out.println("The substring \"" + subString + "\" occurs " + count + " times in the main string.");
    }
}
