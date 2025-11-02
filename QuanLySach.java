import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach;

    public QuanLySach() {
        danhSach = new ArrayList<>();
    }

    public void themSach(Sach sach) {
        danhSach.add(sach);
    }

    public boolean xoaSach(String maSach) {
        for (Sach sach : danhSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.remove(sach);
                return true;
            }
        }
        return false;
    }

    public boolean capNhatSach(String maSach, Sach sachMoi) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equalsIgnoreCase(maSach)) {
                danhSach.set(i, sachMoi);
                return true;
            }
        }
        return false;
    }

    public Sach timSachTheoMa(String maSach) {
        for (Sach sach : danhSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    public void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách sách trống.");
        } else {
            System.out.println("===== DANH SÁCH SÁCH =====");
            for (Sach sach : danhSach) {
                System.out.println("--------------------------");
                System.out.println(sach);
                System.out.println("Giá bán ước tính: " + sach.tinhGiaBan() + " VNĐ");
            }
        }
    }
}
