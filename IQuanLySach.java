import java.util.List;

public interface IQuanLySach {
    void themSach(Sach sach);
    Sach timKiemSachTheoMa(String maSach);
    // Có thể trả về nhiều kết quả nếu tìm theo tiêu đề - ở đây đơn giản theo mã
    boolean xoaSach(String maSach);
    List<Sach> hienThiDanhSach();
}
