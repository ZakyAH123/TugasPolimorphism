public class Asdos extends Mahasiswa{
    
    private int jamNgasdos;
    
    public Asdos (Integer jamNgasdos, Integer sks, String nama){
            super(nama, sks);
            this.jamNgasdos = jamNgasdos;
    }
        
    public Integer getJamSibuk(){
            return super.getJamSibuk() + jamNgasdos;
    }
    
    public String getNama() {
            return null;
    }
        
}
    
