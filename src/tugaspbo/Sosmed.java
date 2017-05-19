package tugaspbo;


public class Sosmed {
    
    private String nama;
    private String email;
    private String jenisKelamin;
    
    public Sosmed(String nama, String email, String jenisKelamin){
        this.nama = nama;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jeniskelamin) {
        this.jenisKelamin = jeniskelamin;
    }
    
}
