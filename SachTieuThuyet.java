public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSerie;

    public SachTieuThuyet() {}

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                          double giaCoBan, String theLoai, boolean laSachSerie) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSerie = laSachSerie;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (laSachSerie ? 15000 : 0);
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nThe loai: " + theLoai +
               "\nLa sach series: " + (laSachSerie ? "Co" : "Khong") +
               "\nGia ban: " + tinhGiaBan() + " VNĐ";
    }
}
