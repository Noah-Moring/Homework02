public class Grove {
    public Tree[] spots;
    public String groveName;

    public Grove(String newGrove){
        this.spots = new Tree[12];
        this.groveName = newGrove;
        // for(int i = 0; i < 12; i++){
        //     this.spots[i] = new Tree(null,null, null);
        // }




    }

    public int PlantTree(Tree x){

        // Having problem with creating a for loop to test for empty spots in the array
        // My initial attempt would exit the loop on the first attemp because of the if else statement

        // if(x != null){
        //     for(int i = 0; i < 12; i++){
        //         if(spots[i] != null){
        //             spots[i] = x;
        //             return i;
        //         }
        //     }
        // }
        // else{
            
        // }

        for(int i = 0; i < 12; i++){
            if(spots[i] == null){
                spots[i] = x;
                return i;

            }
        }

        return -1;

    }

    public Tree RemoveTree(int y){

        if(spots[y] != null){
            Tree removedTree = spots[y];
            spots[y] = null;
            return removedTree;
        }
        else{
            return spots[y];
            // Tree removedTree = null;
            // return removedTree;

            // Pretty sure these both do the same thing because if the spot is null then we can just return the 
            // the null Tree anyway
        }

            // if(i == y){
            //     Tree removedTree = spots[i];
            //     spots[i] = null;
            //     return removedTree;
            // }
            // else{
            //     Tree removedTree = null;
            //     return removedTree;
            // }
            // Overcomplicated way of doing the same thing^
    }

    public String toString(){

        int x = 0;

        for(int i = 0; i < 12; i++){
            if(spots[i] != null){
                x = x + 1;
            }
        }

        String numberTrees = x + "";
        return numberTrees;
    }
}
