import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        List<ArrayList<Children>> tree = new ArrayList<>();
        Adam adam = new Adam();
        Eva eva = new Eva();

        Children child1 = new Children(eva,adam,"Тор", "Одинсон","Одинович","01.01.0005",3);
        Children randomPartner1 = new Children(eva, adam,"Фрейя","Локсон","Хелевна", "01.02.0006", 4);
        child1.makeFamily(child1,randomPartner1);
        familyTree.makeTree(familyTree.makeFamily(familyTree.addNewChild(child1),randomPartner1), tree);
        Children child2 = child1.makeChild(randomPartner1,child1);
        Children randomPartner2 = new Children(eva, adam,"Гулльвейг","Торсон","Ньёрд", "01.02.0010", 5);
        child2.makeFamily(child2,randomPartner2);
        familyTree.makeTree(familyTree.makeFamily(familyTree.addNewChild(child2),randomPartner2), tree);
        Children child3 = child2.makeChild(randomPartner2,child2);
        familyTree.makeTree(familyTree.addNewChild(child3), tree);
        familyTree.makeTree(familyTree.makeFamily(familyTree.addNewChild(adam),randomPartner2), tree);
        System.out.println(familyTree);
    }
}
