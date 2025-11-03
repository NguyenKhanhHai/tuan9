import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach{
    private final List<Sach> danhSach;

    public QuanLySachImpl() {
        this.danhSach = new ArrayList<>();
    }

    @Override
    public void themSach(Sach sach) {
        // nếu đã tồn tại cùng mã -> không thêm (có thể cập nhật tùy yêu cầu)
        if (timKiemSachTheoMa(sach.getMaSach()) != null) {
            System.out.println("Mã sách đã tồn tại. Không thể thêm: " + sach.getMaSach());
            return;
        }
        danhSach.add(sach);
        System.out.println("Đã thêm sách: " + sach.getTieuDe());
    }

    @Override
    public Sach timKiemSachTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach() != null && s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach s = timKiemSachTheoMa(maSach);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("Đã xóa sách có mã: " + maSach);
            return true;
        } else {
            System.out.println("Không tìm thấy sách để xóa với mã: " + maSach);
            return false;
        }
    }

    @Override
    public List<Sach> hienThiDanhSach() {
        return new ArrayList<>(danhSach);
    }
}
