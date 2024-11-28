package FileHandling.ProblemStatement;

import java.io.*;
import java.util.Scanner;

public class ProblemOne {
    public static void CreateFile(){
        //        how to read Content From Source File
        try{
            File file=new File("C:/Users/HP/OneDrive/Desktop/source.txt");
            if(file.createNewFile()){
                System.out.println("File Created.......");

            }
            else {
                System.out.println("File already Exists");
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void WriteOnFile(){
//        Write on the file
        try{
            FileWriter file=new FileWriter("C:/Users/HP/OneDrive/Desktop/source.txt");
            try{
                file.write("Hy this is me ");
            }
            finally {
                file.close();
            }
            System.out.println("Successfully wrote in the file ");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void ReadFromFile(){
//        how to read from the file
        try{
            FileReader File =new FileReader("C:/Users/HP/OneDrive/Desktop/source.txt");
            int Data=File.read();
            while (File.ready()){
                System.out.print((char) Data);
                Data=File.read();
            }
            System.out.println();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void ReadFromFileBuffer() throws IOException {
        FileReader file=new FileReader("C:/Users/HP/OneDrive/Desktop/source.txt");
        BufferedReader FileB=new BufferedReader(file);
        String line;
        while ((line=FileB.readLine())!=null){
            System.out.println(line);
        }
        FileB.close();
    }
    public static void writeToFileBuffer(Scanner sc){
//        write on the file
        try{
//            BufferedWriter bw=new BufferedWriter(new FileWriter("C:/Users/HP/OneDrive/Desktop/source.txt",true) );
//            if we remove this true from here so it start overwiting on the countWordsOfFile().
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:/Users/HP/OneDrive/Desktop/source.txt") );
            System.out.println("Write some thing on file ");
            bw.write(sc.nextLine());

            bw.close();
            System.out.println("Succesfully Write");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void countWordsOfFile(){
        try{
            FileReader f=new FileReader("C:/Users/HP/OneDrive/Desktop/source.txt");
            BufferedReader BR=new BufferedReader(f);
            int count=0;
            int charData;
            while ((charData=BR.read())!=-1){
                System.out.print((char)charData);
                count++;
            }
            BR.close();
            System.out.println("\ncount of words : "+count);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void ReverseContent(){
//        reverse the content of file
        try {
            FileReader f=new FileReader("C:/Users/HP/OneDrive/Desktop/source.txt");
            BufferedReader br=new BufferedReader(f);
            StringBuilder sb=new StringBuilder();
            String line;
            while((line=br.readLine())!=null){
                sb.append(line).append("\n");
            }
            f.close();
            br.close();
            sb.reverse();
            FileWriter fw=new FileWriter("C:/Users/HP/OneDrive/Desktop/source.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(sb.toString());
            bw.close();
            fw.close();
            System.out.println(sb);
            System.out.println("Successfully wrote");

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }



    public static void main(String[] args) {
//        ProblemOne.WriteOnFile();
        Scanner sc=new Scanner(System.in);
//        ProblemOne.writeToFileBuffer(sc);
//        ProblemOne.ReadFromFile();
//        ProblemOne.countWordsOfFile();
//        ProblemOne.ReverseContent();
//        ProblemOne.ReadFromFile();
//        ProblemOne.CreateDummyData();
//        ProblemOne.fileProcessing();
        ProblemOne.copyFile();
    }

    private static void copyFile() {

        try{
            FileReader fr=new FileReader("C:/Users/HP/OneDrive/Desktop/1.xlsx");
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter("C:/Users/HP/OneDrive/Desktop/dd1.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
            String line;
            while ((line=br.readLine())!=null){
                bw.write(line);
                System.out.println(line);
            }
            System.out.println();
            bw.close();
            fw.close();
            fr.close();
            br.close();
            System.out.println("Successfuly created");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static void fileProcessing() {

        String inputFilePath = "C:/Users/HP/OneDrive/Desktop/transactions.txt";
        String outputFilePath = "C:/Users/HP/OneDrive/Desktop/filtered_transactions.txt";
        double amount = 4000.0;

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String transactionID = fields[0];
                String customerID = fields[1];
                double transactionAmount = Double.parseDouble(fields[2]);
                String date = fields[3];


                if (transactionAmount > amount) {
                    bw.write(transactionID + "," + customerID + "," + transactionAmount + "," + date);
                    bw.newLine();
                }
            }

            System.out.println("Filtered transactions have been written to " + outputFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void CreateDummyData() {
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:/Users/HP/OneDrive/Desktop/transactions.txt"));
            bw.write("T001,C001,4500.50,2024-11-25");
            bw.newLine();
            bw.write("T002,C002,6000.00,2024-11-26");
            bw.newLine();
            bw.write("T003,C003,7500.25,2024-11-27");
            bw.newLine();
            bw.write("T004,C004,3200.00,2024-11-28");
            bw.newLine();
            bw.write("T005,C005,12000.75,2024-11-29");
            bw.newLine();
            bw.write("T006,C006,4000.00,2024-11-30");
            bw.newLine();
            bw.close();
            System.out.println("Transections successfully created..........");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
