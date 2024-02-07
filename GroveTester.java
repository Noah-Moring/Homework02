public class GroveTester {
    
    public static void main(String[] args){
        Grove newGrove = new Grove("Grove1");

        System.out.println(newGrove);

        // Can I create a loop to instantiate 7 trees and add them to the grove?

        int treeID = 0;

        for(int i = 0; i < 7; i++){
            treeID = i;
            Tree addTree = new Tree(treeID, 37, "Spruce");
            newGrove.PlantTree(addTree);
        }

        System.out.println(newGrove);

        newGrove.RemoveTree(3);
        newGrove.RemoveTree(5);
        System.out.println(newGrove);

        Tree mapleTree = new Tree(treeID + 1, 13, "Maple");
        newGrove.PlantTree(mapleTree);
        System.out.println(newGrove);
    }
}
