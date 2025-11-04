public class SachGiaoTrinh extends Sach {
    private String monHoc;
    private String capDo;
    private int soNamPhatHanh;

    public SachGiaoTrinh() {}

    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                         double giaCoBan, String monHoc, String capDo, int soNamPhatHanh) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong, giaCoBan);
        this.monHoc = monHoc;
        this.capDo = capDo;
        this.soNamPhatHanh = soNamPhatHanh;
    }

    @Override
    public double tinhGiaBan() {
        return giaCoBan + (soNamPhatHanh * 5000);
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nMon hoc: " + monHoc +
               "\nCap do: " + capDo +
               "\nSo nam phat hanh: " + soNamPhatHanh +
               "\nGia ban: " + tinhGiaBan() + " VNĐ";
    }
}
