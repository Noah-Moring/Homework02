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

        // for(int i = 0; i < 12; i++){
        //     if(spots[i] == null){
        //         spots[i] = x;
        //         return i;

        //     }
        //     else{
        //             return -1;
        //     }
        // }
    }

    public Tree RemoveTree(int y){

        if(spots[y] != null){
            Tree removedTree = spots[y];
            spots[y] = null;
            return removedTree;
        }
        else{
            Tree removedTree = null;
            return removedTree;
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
