
/**
 * class Mahasiswa.
 *
 * @author dientaufan
 * @version 0.1
 */
public class Mahasiswa
{
    // instance variables - replace the example below with your own
    private int nim;
    private String nama;
    
    public Mahasiswa(int nim, String nama)
    {
        this.nim = nim;
        this.nama = nama;
    }
   
    public String getnamaMhs()
    {
         return this.nama;
    }
    
   public int getnimMhs()
    {
         return this.nim;
    }
    public void setnamaMhs(String nama)
    {
        this.nama = nama;
    }
    
    public void setnimMhs(int nim)
    {
         this.nim = nim;
    }
    
    

    
}
