public class Dosen extends Elemen{
    private int jumlahHariKerja;
    
    public Dosen(String nama, Integer jumlahHariKerja){
        super(nama);
        this.jumlahHariKerja = jumlahHariKerja;
    }

    public Integer getJamSibuk(){
        return jumlahHariKerja;
    } 
}
