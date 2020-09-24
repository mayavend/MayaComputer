package MayaNotebook;
import java.util.List;
import java.util.ArrayList;
//public class FixTheErrors830 {

//
//        public static void removeLongStrings(ArrayList<String> list)
//        {
//            //code here
//            for (int i = 0; i < list.size(); i++) {
//                String d= list.get(i);
//                if(d.length()>4){
//                    list.remove(i);
//                }
//            }
//        }
//
//        public static void main(String[] args)
//        {
//            //instantiate ArrayList and fill with Integers
//            ArrayList<String> values = new ArrayList<String>();
//            String[] words = {"bathtub", "fish", "computer", "cat", "foo"};
//            for (int i = 0; i < words.length; i ++)
//            {
//                values.add(words[i]);
//            }
//            removeLongStrings(values);
//            System.out.println("Expected Result:\t [fish, cat, foo]");
//            System.out.println("Your Result:\t\t " + values);
//        }
//    }
//public class FixTheErrors830
//{
//    public static void shiftLeftOne(ArrayList<Integer> list)
//    {
//
//            int d = list.get(0);
//            list.remove(0);
//           list.add(d);
//
//
//    }
//
//    public static void main(String[] args)
//    {
//        //instantiate ArrayList and fill with Integers
//        ArrayList<Integer> values = new ArrayList<Integer>();
//        int[] nums = {1, 2, 3, 4, 5};
//        for (int i = 0; i < nums.length; i ++)
//        {
//            values.add(nums[i]);
//        }
//        shiftLeftOne(values);
//        System.out.println("Expected Result:\t [2, 3, 4, 5, 1]");
//        System.out.println("Your Result:\t\t " + values);
//    }
//}
public class FixTheErrors830
{
    public static void moveSmallest(ArrayList<Integer> list)
    {
        int smallestIndex = 0;
        int smallVal =0;
        for (int i=0; i<list.size()-1; i++)
        {
            if (list.get(i) < list.get(i+1))
            {
                smallestIndex = i;
                smallVal = list.get(i);
            }
        }
       System.out.println(smallVal);
        list.remove(smallestIndex);
        list.add(0,smallVal);
//        int m= list.indexOf(smallestIndex);
//        list.remove(m);
//        list.add(0, smallestIndex);
        //move smallest to front
    }

    public static void main(String[] args)
    {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {3, 11, 54, 7, 1, 22};
        for (int i = 0; i < nums.length; i ++)
        {
            values.add(nums[i]);
        }
        moveSmallest(values);
        System.out.println("Expected Result:\t [1, 3, 11, 54, 7, 22]");
        System.out.println("Your Result:\t\t " + values);
    }
}

