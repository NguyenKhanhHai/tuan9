public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;
    
    public SachGiaoTrinh() {
        super();
    }

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, 
            int namXuatBan, int soLuong, String monHoc, String capDo, double giaCoBan) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Môn học: " + monHoc + "\n" +
               "Cấp độ: " + capDo + "\n" +
               "Giá Bán: " + String.format("%.0f", tinhGiaBan()) + " VNĐ";
    }
    
    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - getNamXuatBan();
        return getGiaCoBan() + (double)soNam * 5000;
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