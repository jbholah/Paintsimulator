package com.tsi.training.bholah.jacob.paintsimulator;
import java.util.Scanner;

public class paintsimulator
{
    private static double TPM = 0.1;
    private static double APT = 30;
    private static int CPH = 15;


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What is the Area being painted in Meters squared?");
        double AOW = reader.nextInt();
        System.out.println(AOW);

        System.out.println("How many coats of paint are required?");
        int NOC = reader.nextInt();
        System.out.println(NOC);

        System.out.println("What is the price of a single tin of paint in £?");
        int POT = reader.nextInt();
        System.out.println(POT);
        int NOT = (int) Math.ceil((AOW/APT)*NOC);
        System.out.println("Time for the job is "+(AOW*TPM)*NOC+" hours");
        System.out.println("Using "+NOT+" tins the cost for the paint is £"+((AOW/APT)*POT)*NOC);
        System.out.println("With Labour costs at £"+((AOW*TPM)*NOC)*CPH+" the total cost for the job is £"+((((AOW/APT)*POT)*NOC)+(((AOW*TPM)*NOC)*CPH)));
    }

}
