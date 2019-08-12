package com.company.simulator;

import java.io.*;

public final class MyPrinter {
    public static MyPrinter myPrinter = new MyPrinter();

    private MyPrinter() {
    }

    public MyPrinter getMyPrinter(){
        if (myPrinter == null){
            return  new MyPrinter();
        }else
            return myPrinter;
    }

    public static void writetoFile(String date) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("simulation.txt", true));) {
            printWriter.write(date + "\n");
        } catch (FileNotFoundException a) {
            System.out.println("File not found exception ");
        } catch (UnsupportedEncodingException g) {
            System.out.println("unsupported enconding exception");
        } catch (IOException f) {
            System.out.println("exection ");
        }
    }
}
