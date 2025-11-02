public abstract class Sach implements IGiaBan, IKiemKe {
    //Thuộc tính (Attributes)
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;
    // Constructor không tham số
    public Sach(){   
    }
     // Constructor có tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan)
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }
    public double getGiaCoBan()
    {
        return giaCoBan;
    }
    public void setGiaCoBan(Double giaCoBan)
    {
        this.giaCoBan = giaCoBan;
    }
    // Getter và Setter
    public String getMaSach() 
    {
        return maSach;
    }
    public void setMaSach(String maSach){
        this.maSach = maSach;
    }
    public String getTieuDe()
    {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe)
    {
        this.tieuDe = tieuDe;
    }
    public String getTacGia()
    {
        return tacGia;
    }
    public void setTacGia(String tacGia)
    {
        this.tacGia = tacGia;
    }
    public int getNamXuatBan()
    {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan)
    {
        this.namXuatBan = namXuatBan;
    }
    public int getSoLuong()
    {
        return soLuong;
    }
    public void setSoLuong(int soLuong)
    {
        this.soLuong = soLuong;
    }
    @Override
    public abstract double tinhGiaBan();
    @Override
    public boolean kiemTraTonKho(int soLuongToiThieu) {
        return soLuong >= soLuongToiThieu;
    }

    @Override
    public void capNhatViTri(String viTriMoi) {
        System.out.println("Đa chuyen sach '" + tieuDe + "' den khu vuc: " + viTriMoi);
    }

    @Override
    public String toString() {
        return "Ma sach: " + maSach +
               "\nTieu de: " + tieuDe +
               "\nTac gia: " + tacGia +
               "\nNam xuat ban: " + namXuatBan +
               "\nSo luong: " + soLuong +
               "\nGia co ban " + giaCoBan;
    }
}
