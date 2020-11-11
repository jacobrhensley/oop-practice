public class LoopsPractice {
    
    public static void main(String[] args) {

        String str = "We have a large inventory of things in our warehouse falling in "
        + "the category:apperal and the slightly "
        + "more in demand category:makeup along with the category:furniture and...";

        printCategories(str);
    }

    public static void printCategories(String string){

        // My Solution

        // String remainingText = string;
        // int currentIndex = 0;

        // while(currentIndex != -1){
        //     currentIndex = remainingText.indexOf("category:");

        //     remainingText = remainingText.substring(currentIndex+9);

        //     int nextSpace = remainingText.indexOf(" ");

        //     if(currentIndex == -1){
        //         break;
        //     } else{
        //         System.out.println(remainingText.substring(0, nextSpace));
        //     }
        // }

        // Instructor Solution

        int i = 0;
        while(true){
            int found = string.indexOf("category", i);
            if(found == -1) break;
            int start = found +9;
            int end = string.indexOf(" ", start);
            System.out.println(string.substring(start, end));
            i = end+1;
        }



    }
}

