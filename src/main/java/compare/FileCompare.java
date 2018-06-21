package compare;

import reader.XLSXReader;

import java.io.File;

public class FileCompare {

    public static void main(String[] args) {
        boolean filesFound=true;
        if(args.length!=2) {
            System.out.println("***************************");
            System.out.println("****Missing File Names*****");
            System.out.println("$> mvn exec:java -Dexec.args=\"Original.xlsx NewFile.xlsx\"");
            System.out.println("***************************");
        } else {
            System.out.println("***************************");
            System.out.println("** Original 1 : "+args[0]);
            System.out.println("** New File 2 : "+args[1]);
            System.out.println("***************************");

            File oFile=new File((new File(args[0])).getAbsolutePath());
            File nFile=new File((new File(args[1])).getAbsolutePath());
            if(!oFile.exists()) {
               System.out.println("ERR: Original file : "+args[0]+" not found !!");
               filesFound=false;
            } else {
                System.out.println("INFO: Original file : "+args[0]+" FOUND !!");
            }

            if(!nFile.exists()) {
                System.out.println("ERR: New file : "+args[1]+" not found !!");
                filesFound=false;
            } else {
                System.out.println("INFO: New file : "+args[1]+" FOUND !!");
            }

            if(filesFound) {
                XLSXReader oFReader=new XLSXReader(oFile);
                System.out.println("Total Sheets in Original = "+oFReader.getSheetCount());

            }


        }
    }
}
