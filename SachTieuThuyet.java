public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan,
                          int soLuong, double giaCoBan, String theLoai, boolean laSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSeries = laSeries;
    }

    @Override
    public double tinhGiaBan() {
        double phuThu = laSeries ? 0.15 : 0.0;
        return getGiaCoBan() * (1 + phuThu);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển tiểu thuyết [" + getTieuDe() + "] đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nThể loại: " + theLoai +
               "\nLà series: " + (laSeries ? "Có" : "Không");
    }
}
