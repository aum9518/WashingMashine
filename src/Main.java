import javax.lang.model.type.ArrayType;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Clothe clothe = new Clothe(EnumOption.JACKET,EnumOption.BLACK,4.2,EnumOption.SYNTHETIC,EnumOption.HOT);
        Clothe clothe1 = new Clothe(EnumOption.JEANS,EnumOption.BLACK,1.8,EnumOption.SYNTHETIC,EnumOption.MAX);
        Clothe clothe2 = new Clothe(EnumOption.JACKET,EnumOption.BLUE,2,EnumOption.SYNTHETIC,EnumOption.HOT);
        Clothe clothe3 = new Clothe(EnumOption.JACKET,EnumOption.BLACK,4.2,EnumOption.SYNTHETIC,EnumOption.HOT);
        Clothe clothe4 = new Clothe(EnumOption.SHORTS,EnumOption.BLACK,0.8,EnumOption.COTTON,EnumOption.WARM);

        Clothe[] clothes = {clothe,clothe1,clothe3,clothe4};

        WashingMashine washingMashine = new WashingMashine("LG","Q7",12,EnumOption.BLACK,clothes);
        washingMashine.setStatus("Pause");
        try{
            System.out.println("Name: "+washingMashine.getBrand()+"\nModel: "+washingMashine.getModel()+"\nAvailable weight: "+
                    washingMashine.getAvailableWeight()+"\nColor: "+washingMashine.getColor()+"\nStatus: "+washingMashine.getStatus());
            System.out.println("Please choose spin(400,600,800,1000): ");
            int spin = new Scanner(System.in).nextInt();
            if (spin==400){
                washingMashine.setSpin(spin);
            } else if (spin==600) {
                washingMashine.setSpin(spin);
            }else if (spin==800) {
                washingMashine.setSpin(spin);
            }else if (spin==1000) {
                washingMashine.setSpin(spin);
            }else {
                throw new Exception("There is not such a spin");
            }
            System.out.println("Please choose temperature(0,30,40,60,95): ");
            int temperature = new Scanner(System.in).nextInt();
            if (temperature==0){
                washingMashine.setTemperature(temperature);
            } else if (temperature==30) {
                washingMashine.setTemperature(temperature);
            }else if (temperature==40) {
                washingMashine.setTemperature(temperature);
            }else if (temperature==60) {
                washingMashine.setTemperature(temperature);
            }else if (temperature==95) {
                washingMashine.setTemperature(temperature);
            }else {
                throw new Exception("There is no such a temperature");
            }
            System.out.println("Please choose mode: \n1.Very dirty\n2.Fast 30\n3.Spin\n4.Rinsing Spin\n5.Cotton\n6.Synthetic\nHand washing of wool");
            int mode = new Scanner(System.in).nextInt();
            if (mode==1){
                washingMashine.veryDirty();
            } else if (mode==2) {
                washingMashine.fast30();
            } else if (mode==3) {
                washingMashine.spin();
            } else if (mode==4) {
                washingMashine.rinsingSpin();
            } else if (mode==5) {
                washingMashine.cotton();
            } else if (mode==6) {
                washingMashine.synthetic();
            } else if (mode==7) {
                washingMashine.handWashingOfWool();
            }else {
                throw new Exception("No such a mode");
            }
            double weight = 0;
            for (Clothe a:clothes) {
               weight = weight+a.getWight();
            }
            if (washingMashine.getAvailableWeight()>=weight){
                washingMashine.setStatus("Start");
            }else {
                throw new Exception("Over loaded please take some cloth.");
            }
            System.out.println("Total weight of clothes: "+weight);
            System.out.println("Status:"+washingMashine.getStatus()+"\nSpin: "+washingMashine.getSpin()+"\nTemperarure: "+washingMashine.getTemperature());
            if (washingMashine.getTemperature()==60){
                washingMashine.setStatus("Stop");
               System.out.println("In this temperature clothes decreased and lose weight\nStatus: "+washingMashine.getStatus());

            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}