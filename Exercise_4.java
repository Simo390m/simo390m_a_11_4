import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exercise_4

{
    public List<Integer> partition(List<Integer> list, Integer e)
    {
        Iterator<Integer> iterator = list.iterator();
        int temp;
        LinkedList<Integer> tempList = new LinkedList<>();
        LinkedList<Integer>tempList2 = new LinkedList<>();

        try
        {
            for (int i = 0; i < list.size() ; i++)
            {
                temp = iterator.next();
                if (temp < e)
                {
                    tempList2.add(temp);
                }
                else
                {
                    tempList.add(temp);
                }

            }

        }catch (ConcurrentModificationException CME)
        {

        }


        tempList2.addAll(tempList);
        System.out.println(tempList2);
     return tempList2;
    }



    public static void main(String[] args)
    {
        Exercise_4 exercise_4 = new Exercise_4();

        LinkedList<Integer> list = new LinkedList<>();
        int e = 5;

        list.add(17);
        list.add(16);
        list.add(15);
        list.add(14);
        list.add(13);
        list.add(12);
        list.add(11);
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        exercise_4.partition(list, e);
    }
}
