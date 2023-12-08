public class Mahasiswa extends Elemen{
    private int sks;
    
    public Mahasiswa(String nama, int sks){
        super(nama);
        this.sks=sks;
    }

    public Integer getJamSibuk(){
        return sks *3;
    }
}
