import java.util.*;
import java.util.Scanner;
/**
 * class Main.
 *
 * @author dientaufan
 * @version 0.1
 */
public class Main
{
    public static void main(String args[])
    {
        ArrayList<String> als = new ArrayList<String>();
        ArrayList<String> alsi= new ArrayList<String>();
        
        // ArrayList dengan custom Object
        ArrayList<Mahasiswa> arraylistMhs= new ArrayList<Mahasiswa>();
        
        
        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        // take input from the user
        String nama = input.next();
        // nextInt()
        als.add("Doni");
        als.add("Budi");
        als.add("Ayu");
        als.add(nama);
        
        System.out.println(als);
        
        for(String alsv:als)
        {
            System.out.println(alsv);
        }
        
        als.remove("Budi");
        System.out.println("Setelah diremove");
        System.out.println(als);
        
        als.add("Budi");
        Collections.sort(als);
        System.out.println("Setelah disort");
        System.out.println(als);
        
        alsi.add(0,"Doni");
        alsi.add(1,"Ayu");
        alsi.add(2,"Budi");
        System.out.println(alsi);
        alsi.remove(1);
        System.out.println(alsi);
        
        alsi.set(1,"Imran");
        System.out.println(alsi);
        System.out.println(alsi.indexOf("Doni"));
        alsi.add("Muh. Imran");
        System.out.println(alsi);
        System.out.println(alsi.contains("Imran"));
        
        
        arraylistMhs.add(new Mahasiswa(2020002,"Katami"));
        arraylistMhs.add(new Mahasiswa(2020003,"Fikram"));
        arraylistMhs.add(new Mahasiswa(2020004,"Reski"));
        
        System.out.println("Sebelum diedit");
        for(Mahasiswa mhs:arraylistMhs)
        {
        
            System.out.println(mhs.getnimMhs() +" "+ mhs.getnamaMhs());;
           
        }
        
        System.out.println("Setelah diedit");
        for(Mahasiswa mhs:arraylistMhs)
        {
            if (mhs.getnimMhs() == 2020003)
            {
                mhs.setnamaMhs("Rudi");
            }
            
            System.out.println(mhs.getnimMhs() +" "+ mhs.getnamaMhs());
               
        }
        
    }
}
