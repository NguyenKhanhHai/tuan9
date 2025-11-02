import java.util.ArrayList;

public class QuanLySachImpl implements IQuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySachImpl() {
        danhSach = new ArrayList<>();
    }

    @Override
    public void themSach(Sach sach) {
        danhSach.add(sach);
    }

    @Override
    public void xoaSach(String maSach) {
        Sach s = timKiemTheoMa(maSach);
        if (s != null) {
            danhSach.remove(s);
            System.out.println(" Đa xoa sach co ma: " + maSach);
        } else {
            System.out.println(" Khong tim thay sach can xoa!");
        }
    }

    @Override
    public void capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.set(i, sachMoi);
                System.out.println(" Đa cap nhat sach co ma: " + maSach);
                return;
            }
        }
        System.out.println(" Khong tim thay sach de cap nhat!");
    }

    @Override
    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) return s;
        }
        return null;
    }

    @Override
    public void hienThiTatCa() {
        System.out.println("\n===== DANH SACH SACH =====");
        if (danhSach.isEmpty()) {
            System.out.println("Khong co sach nao trong danh sach!");
            return;
        }
        for (Sach s : danhSach) {
            System.out.println(s);
            System.out.println("---------------------------");
        }
    }
}
