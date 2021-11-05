package oop.classesConcept.mahasiswa;

public class Prodi {
    private String kode;
    private String nama;

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public void setKode(String kode) {
        if(kode.length() == 2){
            this.kode = kode;
        }
    }

    public void setNama(String nama) {
        if(!nama.isEmpty()){
            this.nama = nama;
        }
    }
}
