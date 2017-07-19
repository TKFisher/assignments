package review.review_02;

   /*
    * extract all categories from the string argument
    * @param str
    *
    * You will use the following:
    *   - substring(String start, String end)
    *   - indexOf(String s, int i)
    *   - while(true){}
    *   Hint: String saying = "too good to be true";
    *         saying.indexOf("HELLO");
    *   This will return '-1' because 'HELLO' was not found.
    *
    * */

public class WhileLoops_assignment {

    public static void main(String[] args) {

        String str = "We have a large inventory of things in our warehouse falling in " +
                "the category:apperal and the slightly more in demand category:makeup along" +
                "with the category:furniture and ...";

        printCategory(str);

    }

    private static void printCategory(String str) {

        int index = 0;

        while (true){
            int found = str.indexOf("category:", index);
            if(found == -1) break;        // indexOf always returns a -1 when something is not found.
            int start = found +9;         // the position following the colon which is the beginning of the word.
            int end = str.indexOf(" ", start);  // blank space after word to begin.
            System.out.println(str.substring(start, end));
            index = end+1;
        }
    }

}
