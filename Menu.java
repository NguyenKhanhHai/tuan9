import java.util.Scanner;

public class Menu {
    private IQuanLySach quanLySach;

    public Menu(IQuanLySach quanLySach) {
        this.quanLySach = quanLySach;
    }

    public void hienThiMenu() {
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n===== MENU QUẢN LÝ SÁCH =====");
            System.out.println("1. Them sach giao trinh");
            System.out.println("2. Them sach  tieu thuyet");
            System.out.println("3. Hien thi tat ca sach");
            System.out.println("4. Tim kiem sach theo ma");
            System.out.println("5. Xoa sach");
            System.out.println("0.Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    themSachGiaoTrinh(sc);
                    break;
                case 2:
                    themSachTieuThuyet(sc);
                    break;
                case 3:
                    quanLySach.hienThiTatCa();
                    break;
                case 4:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    Sach s = quanLySach.timKiemTheoMa(maTim);
                    if (s != null) System.out.println(s);
                    else System.out.println("Khong tim thay!");
                    break;
                case 5:
                    System.out.print("Nhap ma scah can xoa: ");
                    String maXoa = sc.nextLine();
                    quanLySach.xoaSach(maXoa);
                    break;
            }

        } while (chon != 0);
    }

    private void themSachGiaoTrinh(Scanner sc) {
        System.out.print("Ma sach: ");
        String ma = sc.nextLine();
        System.out.print("Tieu de: ");
        String td = sc.nextLine();
        System.out.print("Tac gia: ");
        String tg = sc.nextLine();
        System.out.print("Nam xuat ban: ");
        int nam = sc.nextInt();
        System.out.print("So luong: ");
        int sl = sc.nextInt();
        System.out.print("Gia co ban: ");
        double gia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Mon hoc: ");
        String mh = sc.nextLine();
        System.out.print("Cap do: ");
        String cd = sc.nextLine();
        System.out.print("So nam phat hanh: ");
        int sn = sc.nextInt();

        Sach gt = new SachGiaoTrinh(ma, td, tg, nam, sl, gia, mh, cd, sn);
        quanLySach.themSach(gt);
    }

    private void themSachTieuThuyet(Scanner sc) {
        System.out.print("Ma sach: ");
        String ma = sc.nextLine();
        System.out.print("Tieu de: ");
        String td = sc.nextLine();
        System.out.print("Tac gia: ");
        String tg = sc.nextLine();
        System.out.print("Nam xuat ban: ");
        int nam = sc.nextInt();
        System.out.print("So luong: ");
        int sl = sc.nextInt();
        System.out.print("Gia co ban: ");
        double gia = sc.nextDouble();
        sc.nextLine();
        System.out.print("TThe loai: ");
        String tl = sc.nextLine();
        System.out.print("La sach series (true/false): ");
        boolean ls = sc.nextBoolean();

        Sach tt = new SachTieuThuyet(ma, td, tg, nam, sl, gia, tl, ls);
        quanLySach.themSach(tt);
    }
}
