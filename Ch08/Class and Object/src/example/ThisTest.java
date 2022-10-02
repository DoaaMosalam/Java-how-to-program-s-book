package example;

public class ThisTest {
    public  void test() {

        SimpleTime Time = new SimpleTime(15, 13, 19);
        System.out.println(Time.buildString());
    }

}
// class SimpleTime demonstrates the "this" reference
class SimpleTime{
    private int hour;
    private int minutes;
    private int second;
// if the constructor uses parameter names identical to
// instance variable names the "this" reference is
// required to distinguish between the names

    SimpleTime(int h,int m,int s){
        this.hour=h;
        this.minutes=m;
        this.second=s;
    }
    // use explicit and implicit "this" to call toUniversalString
    public String buildString() {
        return String.format("%24s: %s\n%24s: %s", "this.toUniversalString()", this.toUniversalString(),
                "toUniversalString()", toUniversalString());
    }// end method buildString

    public String toUniversalString(){
// "this" is not required here to access instance variables,
// because method does not have local variables with same
// names as instance variables
        return String.format( "%02d:%02d:%02d", this.hour, this.minutes, this.second );

    }
}

