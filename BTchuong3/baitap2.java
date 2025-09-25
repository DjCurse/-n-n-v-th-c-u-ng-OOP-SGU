import java.util.Scanner;
class Human {
    private String ho; 
    private String ten; 
    private int namsinh; 
    private String quequan; 
    private String gioitinh; 

    public Human(){
        ho = ""; 
        ten = ""; 
        namsinh = 0; 
        quequan = ""; 
        gioitinh = ""; 
    } 
    public Human(String ho, String ten, int namsinh, String quequan, String gioitinh){
        this.ho = ho; 
        this.ten = ten; 
        this.namsinh = namsinh; 
        this.quequan = quequan; 
        this.gioitinh = gioitinh; 
    } 
    public Human(Human h){
        this.ho = h.ho; 
        this.ten = h.ten; 
        this.namsinh = h.namsinh; 
        this.quequan = h.quequan; 
        this.gioitinh = h.gioitinh; 
    } 
    public void nhap(){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Nhap ho: "); 
        ho = sc.nextLine(); 
        System.out.print("Nhap ten: "); 
        ten = sc.nextLine(); 
        System.out.print("Nhap nam sinh: "); 
        namsinh = sc.nextInt(); 
        sc.nextLine(); 
        System.out.print("Nhap que quan: "); 
        quequan = sc.nextLine(); 
        System.out.print("Nhap gioi tinh: "); 
        gioitinh = sc.nextLine(); 
    }  
    public void xuat(){
        System.out.printf("Ho: %s, Ten: %s, Nam sinh: %d, Que quan: %s, Gioi tinh: %s\n", ho, ten, namsinh, quequan, gioitinh); 
    }  
    public String getHo(){
        return ho; 
    } 
    public void setHo(String ho){
        this.ho = ho; 
    } 
    public String getTen(){
        return ten; 
    } 
    public void setTen(String ten){
        this.ten = ten; 
    } 
    public int getNamsinh(){
        return namsinh; 
    } 
    public void setNamsinh(int namsinh){
        this.namsinh = namsinh; 
    } 
    public String getQuequan(){
        return quequan; 
    } 
    public void setQuequan(String quequan){
        this.quequan = quequan; 
    } 
    public String getGioitinh(){
        return gioitinh; 
    } 
    public void setGioitinh(String gioitinh){
        this.gioitinh = gioitinh; 
    } 

} 

class Student extends Human {
    private String masv; 
    private String nganh; 
    private float diem; 

    public Student(){
        super(); 
        masv = ""; 
        nganh = ""; 
        diem = 0.0f; 
    } 
    public Student(Human h, String masv, String nganh, float diem){
        super(h); 
        this.masv = masv; 
        this.nganh = nganh; 
        this.diem = diem; 
    } 
    public Student(Student s){
        super((Human)s); 
        this.masv = s.masv; 
        this.nganh = s.nganh; 
        this.diem = s.diem; 
    } 

    @Override
    public void nhap() {  
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sv: ");
        masv = sc.nextLine();
        System.out.print("Nhap nganh: ");
        nganh = sc.nextLine();
        System.out.print("Nhap diem: ");
        diem = sc.nextFloat();
    } 

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("Ma sv: %s, Nganh: %s, Diem GPA: %.2f\n", masv, nganh, diem);
    }
    public String getMasv(){
        return masv; 
    } 

    public void setMasv(String masv){
        this.masv = masv; 
    }

    public String getNganh(){
        return nganh; 
    } 

    public void setNganh(String nganh){
        this.nganh = nganh; 
    }

    public float getDiem(){
        return diem; 
    } 

    public void setDiem(float diem){
        this.diem = diem; 
    }
    
} 

public class baitap2 {
    public static void main(String[] args) { 
        Human h = new Human(); 
        h.nhap(); 
        h.xuat(); 
        System.out.println();

        Student s1 = new Student(h, "3124410146", "CNTT", 3.5f);  
        s1.xuat();  
        System.out.println();   
        Human h1 = new Human("Nguyen", "An", 2000, "Ha Noi", "Nam");
        Student s2 = new Student(h1,  "3124420215", "CNTT", 3.5f); 
        s2.xuat();  
        System.out.println(); 
        System.err.println("Boxing va Unboxing");
        h1 = s2; // boxing
        h1.xuat();

        s1 = (Student)h1; // unboxing
        s1.xuat();
     
    }

}
