import java.util.*;
import java.util.ArrayList;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        //Iterator<Integer> itr = list.iterator();
        ListIterator<Integer> integerListIterator = list.listIterator();
        //{
//           while(itr.hasNext()){
//               System.out.println(itr.next());
//           }
//        }

            integerListIterator.forEachRemaining(element -> System.out.println(element)); //USING listIterator

       // }
        System.out.println("Reverse order iteration :");
        while(integerListIterator.hasPrevious()){
            System.out.println(integerListIterator.previous());
        }

    }
}