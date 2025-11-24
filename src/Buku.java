
public class Buku {
    private final String judul;
    private final String Pengarang;
    
    public Buku(String judul, String Pengarang){
        this.judul = judul;
        this.Pengarang = Pengarang;
    }
    
    public String getjudul(){
        return judul;
    }
    
    public String getPengarang(){
        return Pengarang;
    }
    
    public String tampil(){
        return "Judul: " + judul + ", Pengarang: " + Pengarang;
    }
    
}
