import java.io.*;

public class Main {
    public static void main(String[] args){

        // FileReader = read the contents of a file as a stream of characters .One by one
        //              read() returns an int value which contains the byte value
        //              when read() returns -1, there is no more data to be read

            //FileReader reader = new FileReader("art.txt");

            try{
                FileReader reader = new FileReader("art.txt");
                 int data = reader.read();
                while(data != -1){
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();
            }
            catch(FileNotFoundException e){
                e.printStackTrack();
            }
            catch(IOException e){
                e.printStackTrack();
            }


    }
}
