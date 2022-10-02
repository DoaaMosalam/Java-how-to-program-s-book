package MakkingDifferent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Information {

    public static List<Emergency> readData(String fileName){
        List<Emergency> record = new ArrayList<>();
        String path ="D:\\Coders Programming\\Java\\Java-How To Program\\Project in Book\\Ch08\\"+fileName;
        String line="";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line=reader.readLine())!=null){
                String[] token = line.split(",");
                Emergency emergency=CreateEmergency(token);
                record.add(emergency);
                System.out.println(emergency);
            }
        }catch (FileNotFoundException e){
            System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("Error while closing fileReader !!!");
            e.printStackTrace();

        }return record;
    }
    private static Emergency CreateEmergency(String[]mateData){
         String name=mateData[0];
         String address=mateData[1];
         String phoneNumber= mateData[2];
         String pSAP=mateData[3];
         return new Emergency(name,address,phoneNumber,pSAP);
    }

    public static List<Emergency>getAddress(List<Emergency>list){
        String address="";
        for (Emergency e :list) {
                address = e.getPhoneNumber();
                System.out.println(address);
        }
        return Collections.singletonList(list.get(Integer.parseInt(address)));
    }

    public static void ShowInfoCaller(){
        List<Emergency> list = readData("Emergency.csv");
        System.out.println(list);
        System.out.println("==================================================");
        System.out.println("All Phone: ");
        System.out.println(getAddress(list));
    }

//    public static Emergency getAddress(List<Emergency> list){
//       String address="";
//       for (Emergency emergency:list){
//           Scanner input = new Scanner(System.in);
//
//           String sb = input.next();
//       }
//    }
}
