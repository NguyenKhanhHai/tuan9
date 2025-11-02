import java.util.ArrayList;
import java.util.List;

public class QuanLySachImpl implements IQuanLySach {
    private List<Sach> danhSach = new ArrayList<>();

    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
    }

    @Override
    public Sach timKiemSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) return s;
        }
        return null;
    }

    @Override
    public boolean xoaSach(String maSach) {
        Sach s = timKiemSach(maSach);
        if (s != null) {
            danhSach.remove(s);
            return true;
        }
        return false;
    }

    @Override
    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        System.out.println("\n===== DANH SÁCH SÁCH =====");
        for (Sach s : danhSach) {
            System.out.println("--------------------------");
            System.out.println(s);
            System.out.println("Giá bán: " + s.tinhGiaBan() + " VNĐ");
        }
    }

    @Override
    public List<Sach> getDanhSach() {
        return danhSach;
    }
}
