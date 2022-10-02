/**
 * Created by IntelliJ IDEA.
 * User: mattosaurus
 * Date: 1/30/12
 * Time: 9:16 PM
 * To change this template use File | Settings | File Templates.
 */
class Main {
    public static void main(String argv[]){
        Queens queens = new Queens(8);
        queens.solve();
        
        System.out.println(queens);
    }
}