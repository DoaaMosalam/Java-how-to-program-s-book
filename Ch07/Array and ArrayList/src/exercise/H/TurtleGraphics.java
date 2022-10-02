package exercise.H;

//import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class TurtleGraphics {
    /**
     * Directions: 0 right, 1 down, 2 left, 3 up
     * سلحفاة ميكانيكية تتجول في الغرفة تحت سيطرة تطبيق Java. السلحفاة
     * يمسك القلم في أحد الوضعين ، لأعلى أو لأسفل. أثناء هبوط القلم ، تتتبع السلحفاة الأشكال
     * أثناء تحركها ، وأثناء رفع القلم ، تتحرك السلحفاة بحرية دون كتابة أي شيء. في هذا
     * المشكلة ، ستحاكي تشغيل السلحفاة وإنشاء لوحة رسم محوسبة.
     * استخدم مصفوفة أرضية حجمها 20 × 20 مهيأة إلى أصفار. اقرأ الأوامر من المصفوفة التي تحتوي عليها. تتبع الوضع الحالي للسلحفاة في جميع الأوقات وما إذا كان القلم حاليًا لأعلى أو لأسفل. افترض أن السلحفاة تبدأ دائمًا في وضع (0 ، 0) من الأرض بقلمها
     * فوق. مجموعة أوامر السلحفاة التي يجب على التطبيق الخاص بك معالجتها موضحة في الشكل
     * افترض أن السلحفاة في مكان ما بالقرب من مركز الأرض. "البرنامج" التالي
     * يرسم ويعرض مربعًا بحجم 12 × 12 ، مع ترك القلم في الوضع العلوي:
     * أثناء تحرك السلحفاة والقلم لأسفل ، اضبط العناصر المناسبة لأرضية المصفوفة على 1 ثانية. عندما
     * يتم إعطاء أمر 6 (عرض المصفوفة) ، أينما يوجد 1 في المصفوفة ، قم بعرض علامة النجمة أو أي منها
     * الشخصية التي تختارها. أينما كان هناك 0 ، اعرض فارغًا.
     * اكتب تطبيقًا لتنفيذ قدرات رسومات السلحفاة التي تمت مناقشتها هنا. اكتب عدة
     * برامج رسومات السلحفاة لرسم اشكال شيقة. أضف أوامر أخرى لزيادة قوة
     * لغة رسومات السلحفاة الخاصة بك.
     */
    private  static  final int[][]floor = new int[20][20];
    private static final int distance=0;
    private static int direction=0;
    private static int turtleX,turtleY;
    private static boolean penDown;
//    private static final int MAXCOMMANDS = 100;
//    private static int commandArray[][];

////This method display list
    public static void printMenu(){
        System.out.println("Command List is:\n " +
                "1. Pen Up\n" +
                "2.Pen Down\n" +
                "3.Turn Right\n" +
                "4.Turn Left\n" +
                "5 To 10.Move forward 10 space\n" +
                "6.Display the 20 by 20\n" +
                "9.End of data.\n");
    }
 //this method implementation command move turtle
    public static void commands() {
        initFloor(floor);
        Scanner input = new Scanner(System.in);
        printMenu();
        int executedCommand = input.nextInt();
        while (executedCommand!=9){
            switch (executedCommand){
                case 1:
                    penDown=false;
                    break;
                case 2:
                    penDown=true;
                    break;
                case 3:
                    //turn right
                    direction=turnRight(direction);
                    break;
                case 4:
                    //turn left
                   direction= turnLeft(direction);
                    break;
                case 5:
                    //Move forward 10 space.
                    System.out.println("How many steps do you want to move?");
                    int move = input.nextInt();
                    if (move<=10){
                        movesTurtle(penDown,floor,direction,distance);
                    }
                    break;
                case 6:// Display the 20 by 20 array.
                    System.out.println("Move turtle in draw is\n");
                    printArray();
                    break;
                default:
                    System.err.println("Unknow command, please try again:\n");
                    break;
            }
            movesTurtle(penDown,floor,direction,distance);
            System.out.println("Whats next:");
            executedCommand = input.nextInt();
        }
    }

    //display array
    public static void printArray() {
        for (int row = 0; row < floor.length; row++) {
            for (int col = 0; col < floor.length; col++)
                if (penDown)
                    floor[row][col]=1;
                    System.out.print(" ");
        }
        System.out.println( "*");
    }

    private static void initFloor(int[][] floor) {
        for (int i = 0; i < floor.length; i++) {
            for (int j = 1; j < floor[i].length; j++) {
                floor[i][j] = 0;
            }
        }
        System.out.println("*");
    }

    // method to turn turtle to the righ
    public static int turnRight(int d){
        return ++d > 3 ? 0 : d;
    }

    // method to turn turtle to the left
    public static int turnLeft(int d){
        return --d < 0 ? 3 : d;
    }

  // this method move turtle pen(move to right,down,left,up)
    public static void movesTurtle(boolean penDown , int floo[][],int dir,int dist){
        int j;
        switch (dir){
            case 0: // move to right
                for (j=1;j<=dist && turtleX+j <20;j++){
                    if (penDown){
                        floo[turtleX+j][turtleY]=1;
                        turtleX+=j-1;
                    }
                }
                break;
            case 1: //move to down
                for (j=1;j<= dist && turtleY+j <20;j++){
                    if (penDown){
                        floor[turtleX][turtleY+j]=1;
                        turtleY+=j-1;
                    }
                }
                break;
            case 2: //move to left
                for (j=1;j<=dist && turtleX-j >=0;j++){
                    if (penDown){
                        floor[turtleX-j][turtleY]=1;
                        turtleX-=j-1;
                    }
                }
                break;
            case 3://move to up
                for (j=1;j<=dist && turtleY-j >=0;j++){
                    if (penDown){
                        floor[turtleX][turtleY-j]=1;
                        turtleY-=j-1;
                    }
                }
        }
    }

}
