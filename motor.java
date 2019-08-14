class motor extends kendaraan {
    
    //variable
    int muatan;
    boolean jasHujan = true;

    //constructor
    motor(String mrk, String jns, String wrn, int jmlBan, int a) {
        super (mrk,jns,wrn,jmlBan);
        muatan = a;
    }

    //parameter
    public String print (motor b) {
        return "\n Merk :" + b.Merk + 
                "\n Jenis:" + b.Jenis +
                "\n Warna:" + b.Warna +
                "\n jmlBan:" + b.jumlahBan +
                "\n Muatan :" + muatan;  
    } 
}