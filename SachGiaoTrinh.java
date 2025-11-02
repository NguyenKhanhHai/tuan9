public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan,
                         int soLuong, double giaCoBan, String monHoc, String capDo) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public double tinhGiaBan() {
        double phuThu = capDo.equalsIgnoreCase("Đại học") ? 0.1 : 0.2;
        return getGiaCoBan() * (1 + phuThu);
    }

    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return getSoLuong() >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đã chuyển sách giáo trình [" + getTieuDe() + "] đến khu vực: " + viTriMoi);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMôn học: " + monHoc + "\nCấp độ: " + capDo;
    }
}
