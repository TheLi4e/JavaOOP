import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //		Task1

        int[] arr = {123, 455, 214, 831, 10, 22};
        Lesson3.Print(Lesson3.SortArr(arr));


//		Task2
        Collection list = new Collection();
        list.Add(4);
        list.Add(1);
        list.Add(3);
        list.Add(5);
        for(Integer num : list){
            System.out.println(num);
        }
        System.out.println();
        System.out.println(list.Get(1));
    }
}
