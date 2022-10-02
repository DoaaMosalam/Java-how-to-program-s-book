package Exercise;

public enum trafficLight {
     Red("Red",30),
     Green("Green",59),
     Yellow("Yellow",5);

     private String light;
     private int duration;

     trafficLight(String color,int dura){
          this.light=color;
          this.duration=dura;
     }

     public static void display(){

          for (trafficLight light:
               trafficLight.values()) {
               System.out.println(light+" "+ light.duration);

          }
     }
}
