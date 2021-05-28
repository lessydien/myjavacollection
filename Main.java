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
        int jumlah=0, nim=0;
        String nama=null;
        // create an object of Scanner
        Scanner input = new Scanner(System.in);
        // Jumlah mahasiswa yang mau di tambahkan
        System.out.print("Jumlah Mahasiswa: ");
        jumlah = input.nextInt();
        
        for(int a=0;a<jumlah;a++)
        {
            // todo list????
            int in = a+1;
            System.out.print("Nim mahasiswa ke-" + in +": ");
            nim = input.nextInt();
            System.out.print("Nama mahasiswa ke-" + in +": ");
            nama = input.next();
            arraylistMhs.add(new Mahasiswa(nim,nama));
        }
        
        System.out.println("Daftar Mahasiswa: ");
        for(Mahasiswa mhs:arraylistMhs)
        {
            System.out.println(mhs.getnimMhs() +" "+ mhs.getnamaMhs());  
        }
        
        System.out.print("Masukkan NIM yang akan dihapus: ");
        nim = input.nextInt();
        
        // for(int a=0; a < arraylistMhs.size(); a++)
        // {
            
            // int nim1 = mhs.nimMhs();
            // // if (nim1 == nim) 
            // // {
                
            // // }
            // System.out.println(arraylistMhs.get(a).getnimMhs() +" "+ arraylistMhs.get(a).getnamaMhs());  
        // }
        
        for(Mahasiswa mhs:arraylistMhs)
        {
            int nim1 = mhs.getnimMhs();
            if (nim1 == nim)
            {
                arraylistMhs.indexOf(mhs);
                arraylistMhs.remove(arraylistMhs.indexOf(mhs));
                break;
            }
        }
        
        System.out.println("Daftar mahasiswa setelah dihapus");
        for(Mahasiswa mhs:arraylistMhs)
        {
            System.out.println(mhs.getnimMhs()+" - "+mhs.getnamaMhs());
        }
        // take input from the user
        //String nama = input.next();
        // nextInt()
        
        /*
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
        */
        
    }
}
