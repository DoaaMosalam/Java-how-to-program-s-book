package youtube;

import java.util.EnumSet;

public enum Section {
    Arabic(100,55),English(100,55),Math(50,35),Social(35,20),Science(35,20);

    private int degree;
    private int Mediam;

    Section(int degree,int med){
        this.degree=degree;
        this.Mediam=med;
    }


    public static void printAll(){

        for (Section s:Section.values()) {
            System.out.println(s+ " " + s.degree + " " + s.Mediam);
            System.out.println(s.ordinal());
        }

        for (Section ss : EnumSet.range(Arabic,Math)) {
            System.out.println(ss);
        }

        Section section = Section.Arabic;
        switch (section){
            case English:
            case Social:
            case Science:
                System.out.println("degree pass  start from 20 ");
                break;
            default:
                System.out.println("You have lower degree, you must study more");

        }
    }
}
