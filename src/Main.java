public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 200;

        intArray[1] = 10;

        intArray[2] = -1;

        intArray[3] = 5;

        intArray[4] = 6;

        intArray[5] = 7;

        intArray[6] = 9;

       /* for (int i = 0; i < intArray.length; i++) {
            System.out.println("["+i+"] "+ intArray[i]);
        }*/

       /*
       retrieval with no known index position, is O(n) linear time complexity
       retrieval with known index position, is O(1) constant time complexity
       */

        int index = 7;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 12) {
                index = i;
                break;
            }
        }
        System.out.println("index is "+ index);
    }
}