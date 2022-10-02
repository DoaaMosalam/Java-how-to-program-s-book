import java.util.LinkedList;

/**
 * User: mattosaurus
 * Date: 1/30/12
 * Time: 8:10 PM
 */
class Queens {
    private int n;
    private LinkedList<Integer> state;

    public Queens(int n){
        this.n = n;
        this.state = new LinkedList<Integer>();
    }
    public Queens(){
        this(8);
    }

    private boolean isValid(LinkedList<Integer> state){
        if(state.size() == 1){
            return true;
        }


        /*
        We have to check for diagonal conflicts

        We do this by examining the "slope" of the last queen location on the stack against
        all the other queen positions. If the differences in x and y are equal, then the newest queen on the stack is in
        conflict with another queen.
         */
        int state_size = state.size() - 1;
        int last_x = state_size;
        int last_y = state.get(last_x);
        for(int i = 0; i < state_size; i++){

            //check horizontal conflict while we are at it:
            if(state.getLast() == state.get(i)){
                return false;
            }

            int xdiff = Math.abs(last_x - i);
            int ydiff = Math.abs(last_y - state.get(i));

            if(xdiff == ydiff){
                return false;
            }
        }
        return true;
    }

    private LinkedList<Integer> compute(LinkedList<Integer> state){
        //if the state size is equal to n we have a valid configuration
        if(this.n == state.size()){
            return state;
        }
        //branch computations
        for(int i = 0; i < this.n; i++){
            
            //push i onto the stack

            state.add(i);

            
            //check if placement onto stack is valid according to game rules 
            if(isValid(state)){

                //if the placement is valid, we need to try to place something in the next column
                LinkedList<Integer> tmp = this.compute(state);
                if(tmp != null){
                    //if compute returns something non null, then we have reached a valid configuration
                    //and must return it back up the stack.
                    return tmp;
                }
            }
            //if tmp is null here, then we have hit a "wall" and must backtrack

            state.removeLast();

        }
        /*
        If we reach this point, then we need to backtrack.
         */
        return null;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(this.state.toString());

        for(int i = 0; i < this.n; i++){
            //s.append("\n");
            //for(int z = 0; z < this.n; z++){s.append("---");}
            s.append("\n");
            for(int j = 0; j < this.n; j++){
                if(this.state.get(i) == j){
                    s.append("| Q");
                }
                else{
                    s.append("|  ");
                }
            }
            s.append("|");
        }
        return s.toString();
    }
    
    public void solve(){
        this.state = compute(new LinkedList<Integer>());
    }
    
}