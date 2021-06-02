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
        
        ArrayList<Integer> arri = new ArrayList<Integer>();
        ArrayList<String> arrs = new ArrayList<String>();
        ArrayList<Mahasiswa> arrm = new ArrayList<Mahasiswa>();
        
        arri.add(4);
        arri.add(5);
        arri.add(1);
        arri.add(2);
   
        
        arrs.add("Doni");
        arrs.add("Ayu");
        arrs.add("Bayu");
        arrs.add("Fikri");
        
        // arrm.add(new Mahasiswa(1001,"Doni"));
        // arrm.add(new Mahasiswa(1002,"Bayu"));
        // arrm.add(new Mahasiswa(1003,"Fikri"));
        /*
        System.out.println("Data Mahasiswa");
        System.out.print("Jumlah Mahasiswa: ");
        Scanner input = new Scanner(System.in);
        int jumlah=0, nim=0;
        String nama=null;
        jumlah = input.nextInt();
        
        for (int i=0; i < jumlah ; i++) 
        {
            System.out.print("Nim ke-"+(i+1)+": ");
            nim = input.nextInt();
            System.out.print("Nama ke-"+(i+1)+":  ");
            nama = input.next();
            arrm.add(new Mahasiswa(nim,nama));
        }
        
        
        System.out.println("Menampilkan Data Mahasiswa");
        for (Mahasiswa mhs: arrm)
        {
            System.out.println(mhs.getnimMhs()+" - "+ mhs.getnamaMhs());
        }
        
        for (Mahasiswa mhs: arrm)
        {
            System.out.println(mhs);
        }
        
        
        Collections.sort(arrm,new MahasiswaComparatorString());
        System.out.println("Menampilkan Data Mahasiswa setelah pengurutan");
        for (Mahasiswa mhs: arrm)
        {
            System.out.println(mhs.getnimMhs()+" - "+ mhs.getnamaMhs());
        }
        
        
        
        System.out.println("Menampilkan Data Mahasiswa");
        for (Mahasiswa mhs: arrm)
        {
            if(mhs.getnimMhs() == 1001)
            {
               arrm.indexOf(mhs);
               arrm.remove(arrm.indexOf(mhs));
               break;
            }
            System.out.println(mhs.getnimMhs()+" - "+ mhs.getnamaMhs());
        }
        
        
        */
        System.out.println("----------");
        System.out.println("----------");
        System.out.println("Menampilkan Nilai Array List dengan for biasa");
        for(int i=0; i < arri.size(); i++)
        {
            System.out.println(arri.get(i));
            //System.out.println(arrs.get(i));
        }
        
        arri.remove(2);
        
        System.out.println("Menampilkan Nilai Array List sebelum sort");
        for (Integer valx: arri)
        {
            System.out.println(valx);
        }
       
        Collections.sort(arri);
        System.out.println("Menampilkan Nilai Array List setelah sort");
        for (Integer valx: arri)
        {
            System.out.println(valx);
        }
        
        System.out.println("Menampilkan Nilai Array sebelum sort");
        for (String valx: arrs)
        {
            System.out.println(valx);
        }
        
          arrs.remove("Doni");
        Collections.sort(arrs);
        System.out.println("Menampilkan Nilai Array setelah sort");
        for (String valx: arrs)
        {
            System.out.println(valx);
        }
        
        /*
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
