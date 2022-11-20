import java.util.ArrayList;
import java.util.List;

public class FamilyTree<T> {
    List<ArrayList<T>> familyTree;

    public List<ArrayList<T>> makeTree(ArrayList<T> family, List<ArrayList<T>> familyTree){
        familyTree.add(family);
        this.familyTree=familyTree;
        return familyTree;
    }

    public ArrayList<T> addNewChild(T child){
        ArrayList<T> newChild = new ArrayList<>();
        newChild.add(child);
        return newChild;
    }

    public ArrayList<T> makeFamily(ArrayList<T> family, T partner){
        family.add(partner);
        return family;
    }

    @Override
    public String toString() {
        return ""+familyTree;
    }
}
