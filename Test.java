import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IQuanLySach quanLy = new QuanLySachImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm sách giáo trình");
            System.out.println("2. Thêm sách tiểu thuyết");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("4. Tìm kiếm sách theo mã");
            System.out.println("5. Xóa sách theo mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            sc.nextLine();
{
            switch (chon) {
                case 1 -> {
                    System.out.print("Mã: "); 
                    String ma = sc.nextLine();
                    System.out.print("Tiêu đề: "); 
                    String ten = sc.nextLine();
                    System.out.print("Tác giả: ");  
                    String tg = sc.nextLine();
                    System.out.print("Năm xuất bản");
                    int nxb = sc.nextInt();   
                    System.out.print("Số lượng: ") ;
                    int sl = sc.nextInt();
                    System.out.print("Môn học: "); 
                    String mh = sc.nextLine();
                    System.out.print("Cấp độ "); 
                    String cd = sc.nextLine();
                    System.out.print("Giá cơ bản: "); 
                    double gcb = sc.nextDouble();
                    quanLy.themSach(new SachGiaoTrinh(ma, ten, tg, nxb,sl, mh,cd, gcb));
                }
                case 2 -> {
                    System.out.print("Mã: "); 
                    String ma = sc.nextLine();
                    System.out.print("Tiêu đề: ");           
                    String ten = sc.nextLine();
                    System.out.print("Tác giả: "); 
                    String tg = sc.nextLine();
                    System.out.print("Năm xuất bản");
                    int nxb = sc.nextInt(); 
                    System.out.print("Số lượng: "); 
                    int sl = sc.nextInt();
                    System.out.print("Thể loại: "); String tl = sc.nextLine();
                    System.out.print("Là sách Series: "); Boolean vt = sc.nextBoolean();
                    System.out.print("Giá cơ bản: "); double gcb = sc.nextDouble();
                    quanLy.themSach(new SachTieuThuyet(ma, ten, tg, nxb, sl, tl, vt,gcb));
                }
                case 3 -> {
                    List<Sach> ds = quanLy.hienThiDanhSach();
                    if (ds.isEmpty()) System.out.println("Danh sách trống.");
                    else ds.forEach(s -> System.out.println(s.toString()));
                }
                case 4 -> {
                    System.out.print("Nhập mã sách cần tìm: ");
                    String ma = sc.nextLine();
                    Sach s = quanLy.timKiemSachTheoMa(ma);
                    if (s != null) System.out.println(s);
                    else System.out.println("Không tìm thấy!");
                }
                case 5 -> {
                    System.out.print("Nhập mã cần xóa: ");
                    String ma = sc.nextLine();
                    quanLy.xoaSach(ma);
                }
                case 0 -> {
                    System.out.println("Thoát chương trình...");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
}
