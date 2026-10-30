package Collections_clasies;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

    public static void main(String[] args) {
        Set<String> str = new HashSet<>();
        str.add("кот");
        str.add("арбуз");
        str.add("яблоко");
        str.add("кот");

        for (String e : str){
            System.out.println(e);
        }

        System.out.println();

        Set<String> treeStr = new TreeSet<>();
        treeStr.add("кот");
        treeStr.add("арбуз");
        treeStr.add("яблоко");
        treeStr.add("кот");

        for (String e : treeStr){
            System.out.println(e);
        }

        System.out.println();

        Set<String> set = new HashSet<>();
        System.out.println(set.add("кот"));
        System.out.println(set.add("кот"));
    }
}
