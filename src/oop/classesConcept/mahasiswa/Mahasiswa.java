package oop.classesConcept.mahasiswa;

public class Mahasiswa {
    private String nim;
    private String nama;
    Prodi prodi = new Prodi();

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public Prodi getProdi() {
        System.out.print("[" + prodi.getKode() + "]");
        System.out.print("(" + prodi.getNama() + ")");
        return null;
    }

    public void getAngkatan(){
        int angkatan = Integer.parseInt(this.nim.substring(5,7));
        if(angkatan >= 90 && angkatan <= 99){
            System.out.println("19" + angkatan);
        } else if(angkatan >= 0 && angkatan <= 20){
            System.out.println("20" + angkatan);
        } else {
            System.out.println(0);
        }

    }

    public void setNama(String nama){
        if(!nama.isEmpty()){
            this.nama = nama;
        } else {
            System.out.println("Harus diisi!");
        }
    }

    public void setNim(String nim) {
        if(!nim.isEmpty()){
            this.nim = nim;
        } else {
            System.out.println("Harus diisi!");
        }
    }

    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }
}
