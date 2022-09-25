import java.io.File;

public class Main {

    public static void main(String [] args){

        // file  = an abstract representation of file and directory pathnames

        File file1 = new File("C:\\Users\\snehi\\Desktop\\secret_message.txt");

        if(file1.exists()){
            System.out.println("That file exists :O!");
            System.out.println(file1.getPath());
            System.out.println(file1.getAbsolutePath());
            System.out.println(file1.isFile());
            file1.delete();
        }
        else{
            System.out.println("That file does not exist :(");
        }

    }
}
