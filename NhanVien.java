package QuanLiCuaHangThuoc;
import java.util.Scanner;

public class NhanVien {
    private String maNV;
    private String ho;
    private String ten;
    private String soDienThoai;
    private String gioiTinh;
    private String ngaySinh;

    public NhanVien(){
    } 

    public NhanVien(String maNV,String ho, String ten, String gioiTinh, String soDienThoai, String ngaySinh ) {
        this.maNV=maNV;
        this.ho=ho;
        this.ten=ten;
        this.gioiTinh=gioiTinh;
        this.soDienThoai=soDienThoai;
        this.ngaySinh=ngaySinh;
    }

    public String getMaNV() { return maNV; }
    public void setMaNV(String maNV) { this.maNV = maNV; }
    public String getHo() { return ho; }
    public void setHo( String ho) { this.ho=ho; }
    public String getTen() { return ten; }
    public void setTen( String ten ) { this.ten=ten; }
    public String getGioiTinh() { return gioiTinh; }
    public void setGioiTinh( String gioTinh ) { this.gioiTinh=gioTinh; }
    public String getSoDienThoai () { return soDienThoai; }
    public void setSodienThoai( String soDienThoai ) { this.soDienThoai=soDienThoai; }
    public  String getNgaySinh () { return ngaySinh; }
    public void setNgaySinh ( String ngaySinh ) { this.ngaySinh=ngaySinh; }
 
    public void nhapThongTin(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap ma nhan vien :");
        maNV=sc.nextLine();
        System.out.print("Nhap ho :");
        ho=sc.nextLine();
        System.out.print("Nhap ten ");
        ten=sc.nextLine();
        System.out.print("Gioi tinh ");
        gioiTinh=sc.nextLine();
        System.out.print("So dien thoai :");
        soDienThoai=sc.nextLine();
        System.out.print("Ngay sinh : ");
        ngaySinh=sc.nextLine();
    }
     public void xuatThongTin() {
        System.out.printf("%-10s %-15s %-10s %-10s %-15s %-20s\n ",
                                maNV,ho,ten,gioiTinh,soDienThoai,ngaySinh);
     }
}
