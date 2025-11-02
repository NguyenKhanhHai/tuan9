import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm Sách Giáo Trình");
            System.out.println("2. Thêm Sách Tiểu Thuyết");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm sách theo mã");
            System.out.println("5. Xóa sách theo mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Mã sách: "); String ma1 = sc.nextLine();
                    System.out.print("Tiêu đề: "); String td1 = sc.nextLine();
                    System.out.print("Tác giả: "); String tg1 = sc.nextLine();
                    System.out.print("Năm xuất bản: "); int nx1 = sc.nextInt();
                    System.out.print("Số lượng: "); int sl1 = sc.nextInt();
                    System.out.print("Giá cơ bản: "); double gb1 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Môn học: "); String mh = sc.nextLine();
                    System.out.print("Cấp độ: "); String cd = sc.nextLine();
                    quanLy.themSach(new SachGiaoTrinh(ma1, td1, tg1, nx1, sl1, gb1, mh, cd));
                    break;

                case 2:
                    System.out.print("Mã sách: "); String ma2 = sc.nextLine();
                    System.out.print("Tiêu đề: "); String td2 = sc.nextLine();
                    System.out.print("Tác giả: "); String tg2 = sc.nextLine();
                    System.out.print("Năm xuất bản: "); int nx2 = sc.nextInt();
                    System.out.print("Số lượng: "); int sl2 = sc.nextInt();
                    System.out.print("Giá cơ bản: "); double gb2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Thể loại: "); String tl = sc.nextLine();
                    System.out.print("Là series (true/false): "); boolean series = sc.nextBoolean();
                    quanLy.themSach(new SachTieuThuyet(ma2, td2, tg2, nx2, sl2, gb2, tl, series));
                    break;

                case 3:
                    quanLy.hienThiDanhSach();
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();
                    Sach s = quanLy.timKiemSach(maTim);
                    if (s != null)
                        System.out.println("Tìm thấy:\n" + s + "\nGiá bán: " + s.tinhGiaBan());
                    else
                        System.out.println("Không tìm thấy sách.");
                    break;

                case 5:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    if (quanLy.xoaSach(maXoa))
                        System.out.println("Đã xóa thành công!");
                    else
                        System.out.println("Không tìm thấy sách để xóa!");
                    break;

                case 0:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);

        sc.close();
    }
}
