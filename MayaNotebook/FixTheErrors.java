package MayaNotebook;
//
//
// import java.util.List;
//        import java.util.ArrayList;
//
//public class FixTheErrors
//{
//    public static void main(String[] args)
//    {
//        ArrayList<String> names = new ArrayList< >();
//        String[] friends = {"Sam", "Jessica", "Mark", "Alexis"};
//        for (int i = 0; i <friends.length; i++)
//        {
//            names.add(friends[i]);
//        }
//        System.out.println(names);
//    }
//}
//
//
//
//import java.util.List;
//import java.util.ArrayList;
//
//public class FixTheErrors
//{
//    public static ArrayList reverse(ArrayList<Integer> list)
//    {
//        ArrayList<Integer> reversed = new ArrayList<Integer>();
//        for (Integer element: list) //1,2,3
//        {
//            //System.out.println(reversed);
//            reversed.add(0,element); //1,2,3
//            System.out.println(element);
//            System.out.println(reversed);
//        }
//        return reversed;
//    }
//
//    public static void main(String[] args)
//    {
//        //instantiate ArrayList and fill with Integers
//        ArrayList<Integer> values = new ArrayList<Integer>();
//        int[] nums = {1, 5, 7, 9, -2, 3, 2};
//        for (int i = 0; i < nums.length; i++)
//        {
//            values.add(nums[i]);
//        }
//        ArrayList<Integer> result = reverse(values);
//        System.out.println("Expected Result:\t [2, 3, -2, 9, 7, 5, 1]");
//        System.out.println("Your Result:\t\t " + result);
//    }
//}

import java.util.List;
import java.util.ArrayList;

//public class FixTheErrors
//{
//    public static void printEvenIndex(ArrayList<Integer> list)
//    {
//        for (int i=0; i<list.size(); i++)
//        {
//            if (i % 2 != 1)
//            {
//                System.out.print(list.get(i) + ", ");
//            }
//        }
//    }
//
//    public static void main(String[] args)
//    {
//        //instantiate ArrayList and fill with Integers
//        ArrayList<Integer> values = new ArrayList<Integer>();
//        int[] nums = {1, 5, 7, 9, -2, 3, 2};
//        for (int i = 0; i < nums.length; i ++)
//        {
//            values.add(nums[i]);
//        }
//        System.out.println("Expected Result:\t 1, 7, -2, 2,");
//        System.out.print("Your Result:\t\t ");
//        printEvenIndex(values);
//    }
//}

public class FixTheErrors
{
    public static void printEvenElements(ArrayList list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            int d = (int)list.get(i);
            if (d % 2 == 0)
            {
                System.out.print(list.get(i) + ", ");
            }
        }
    }

    public static void main(String[] args)
    {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3, 2};
//        for (int i = 0; i < nums.length; i++)
//        {
//            values.add(nums[i]);
//        }

        for(int element: nums){
            values.add(element);
        }

        System.out.println("Expected Result:\t 44, -16, 2,");
        System.out.print("Your Result:\t\t ");
        printEvenElements(values);
    }
}

