import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    List<ArrayList<Children>> familyTree;

    public List<ArrayList<Children>> makeTree(ArrayList<Children> family, List<ArrayList<Children>> familyTree){
        familyTree.add(family);
        this.familyTree=familyTree;
        return familyTree;
    }

    public ArrayList<Children> addNewChild(Children child){
        ArrayList<Children> newChild = new ArrayList<>();
        newChild.add(child);
        return newChild;
    }

    public ArrayList<Children> makeFamily(ArrayList<Children> family, Children partner){
        family.add(partner);
        return family;
    }

    @Override
    public String toString() {
        return ""+familyTree;
    }
}
