public class Test {
    public static void main(String[] args) {
        IQuanLySach ql = new QuanLySachImpl();
        Menu menu = new Menu(ql);
        menu.hienThiMenu();
    }
}
