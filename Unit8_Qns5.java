import java.io.*;
public class Unit8_Qns5 {
    public static void main(String[] args)  {
        try {
            File dir = new File("testDir");
            dir.mkdir(); //creates directory
            File f = new File(dir, "note.txt"); //creates file inside directory
            f.createNewFile(); //creates file

            FileWriter wri = new FileWriter(f);
            wri.write("BCA Notes");
            wri.close();

            System.out.println("Content Written");

        } catch (IOException e) {
            e.printStackTrace();
        }
}
}
