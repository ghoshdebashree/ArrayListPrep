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
        Iterator<Integer> itr = list.iterator();
        {
//           while(itr.hasNext()){
//               System.out.println(itr.next());
//           }
//        }
            itr.forEachRemaining(element -> System.out.println(element));

        }

    }
}