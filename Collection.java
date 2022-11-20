import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection implements Iterable<Integer>{

    List<Integer> number;

    public Collection(){
        this.number = new ArrayList<>();
    }

    public void Add(int num){
        number.add(num);
    }

    public int Get(int num){
        Iterator<Integer> iterator = new MyIterator();
        while (number.iterator().hasNext()){
            return iterator().next();
        }
        return -1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            return index < number.size();
        }

        @Override
        public Integer next() {
            return number.get(index++);
        }
    }
}

