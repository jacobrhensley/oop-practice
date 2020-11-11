public class LoopsPractice {
    

    public static void main(String[] args) {

        String str = "We have a large inventory of things in our warehouse falling in "
        + "the category:apperal and the slightly "
        + "more in demand category:makeup along with the category:furniture and...";

        printCategories(str);
    }

    public static void printCategories(String str){

        String remainingText = str;
        int currentIndex = remainingText.indexOf("category:");

        while(currentIndex != -1){
            currentIndex = remainingText.indexOf("category:");

            remainingText = remainingText.substring(currentIndex+9);

            int nextSpace = remainingText.indexOf(" ");

            if(currentIndex == -1){
                break;
            } else{
                System.out.println(remainingText.substring(0, nextSpace));
            }
        }
    }
}
