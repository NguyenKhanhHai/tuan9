public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Thể loại: " + theLoai + "\n" +
               "Là sách series: " + (laSachSeries ? "Có" : "Không") + "\n" +
               "Giá Bán: " + String.format("%.0f", tinhGiaBan()) + " VNĐ";
    }

    @Override
    public double tinhGiaBan() {
        if (this.laSachSeries) {
            return getGiaCoBan() + 15000;
        } else {
            return getGiaCoBan();
        }
    }
    
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách '" + getTieuDe() + "' đến khu vực: " + viTriMoi);
    }
}