package emg.demos.camel;

import emg.demos.camel.files.CamelFileCopier;

public class Main {

    public static void main(String[] args) {
	    System.out.print("******************************");
        System.out.print("File demo");
        System.out.print("******************************");

        CamelFileCopier copier = new CamelFileCopier();
        try {
            copier.CopyFile();
        } catch (Exception ex){
            System.err.print(ex.getStackTrace());
        }
    }
}
