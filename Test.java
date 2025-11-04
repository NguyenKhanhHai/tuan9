import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Khởi tạo đối tượng quản lý theo kiểu Interface
        IQuanLySach quanLy = new QuanLySachImpl();
        
        // Thêm dữ liệu mẫu
        quanLy.themSach(new SachGiaoTrinh("GT01", "Giải tích 1", "Nguyễn Văn A", 2020, 150, "Toán", "Đại cương", 80000));
        quanLy.themSach(new SachTieuThuyet("TT01", "Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 2019, 200, 50000, "Thiếu nhi", true));
        quanLy.themSach(new SachTieuThuyet("TT02", "Lão Hạc", "Nam Cao", 2021, 100, 30000, "Văn học hiện thực", false));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n======== MENU QUẢN LÝ SÁCH ========");
            System.out.println("1. Hiển thị danh sách sách");
            System.out.println("2. Xóa sách theo mã");
            System.out.println("3. Kiểm tra tồn kho");
            System.out.println("4. Cập nhật vị trí sách");
            System.out.println("0. Thoát chương trình");
            System.out.print(">> Mời bạn chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    quanLy.hienThiDanhSach();
                    break;
                case 2:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    quanLy.xoaSach(maXoa);
                    break;
                case 3:
                    System.out.print("Nhập mã sách cần kiểm tra tồn kho: ");
                    String maKiemTra = sc.nextLine();
                    Sach sachKiemTra = quanLy.timKiemSach(maKiemTra);
                    if (sachKiemTra != null) {
                        System.out.print("Nhập số lượng tối thiểu cần có: ");
                        int sl = sc.nextInt();
                        sc.nextLine();
                        boolean duHang = sachKiemTra.kiemTraTonKho(sl);
                        System.out.println("-> Kết quả: " + (duHang ? "Đủ hàng" : "Không đủ hàng"));
                    } else {
                        System.out.println("-> Không tìm thấy sách!");
                    }
                    break;
                case 4:
                    System.out.print("Nhập mã sách cần cập nhật vị trí: ");
                    String maCapNhat = sc.nextLine();
                    Sach sachCapNhat = quanLy.timKiemSach(maCapNhat);
                    if (sachCapNhat != null) {
                        System.out.print("Nhập vị trí mới: ");
                        String viTriMoi = sc.nextLine();
                        sachCapNhat.capNhatViTri(viTriMoi);
                    } else {
                        System.out.println("-> Không tìm thấy sách!");
                    }
                    break;
                case 0:
                    System.out.println("Đang thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (choice != 0);

        sc.close();
    }
}