package giolythuyet;

public class Nhanvien {

    private int maNhanVien;
    private String ten;
    private String phongBan;

    public Nhanvien(){

    }
    public Nhanvien(int maNhanVien,String ten,String phongBan){
        this.maNhanVien = maNhanVien;
        this.ten = ten;
        this.phongBan = phongBan;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    @Override
    public String toString(){
        return "Ten nhan vien: "
                + this.ten
                + " ma nhan vien: "
                + this.maNhanVien
                + " phong ban: "
                + this.phongBan;
    }
}
