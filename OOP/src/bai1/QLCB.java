package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> danhSachCanBo;

    public QLCB() {
        this.danhSachCanBo = new ArrayList<>();
    }

    // Thêm mới cán bộ
    public void themCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
    }

    // Tìm kiếm theo họ tên
    public void timKiemTheoHoTen(String hoTen) {
        for (CanBo canBo : danhSachCanBo) {
            if (canBo.getHoTen().equalsIgnoreCase(hoTen)) {
                System.out.println(canBo);
            }
        }
    }

    // Hiển thị thông tin về danh sách các cán bộ
    public void hienThiDanhSachCanBo() {
        for (CanBo canBo : danhSachCanBo) {
            System.out.println(canBo);
        }
    }

    // Thoát khỏi chương trình
    public void thoat() {
        System.exit(0);
    }

    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị thông tin danh sách cán bộ");
            System.out.println("4. Thoát chương trình");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại cán bộ: 1. Công nhân, 2. Kỹ sư, 3. Nhân viên");
                    int type = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Nhập họ tên: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Nhập giới tính: ");
                    String gioiTinh = scanner.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String diaChi = scanner.nextLine();

                    switch (type) {
                        case 1:
                            System.out.print("Nhập bậc: ");
                            int bac = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            qlcb.themCanBo(new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac));
                            break;
                        case 2:
                            System.out.print("Nhập ngành đào tạo: ");
                            String nganhDaoTao = scanner.nextLine();
                            qlcb.themCanBo(new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao));
                            break;
                        case 3:
                            System.out.print("Nhập công việc: ");
                            String congViec = scanner.nextLine();
                            qlcb.themCanBo(new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec));
                            break;
                        default:
                            System.out.println("Loại cán bộ không hợp lệ.");
                    }
                    break;

                case 2:
                    System.out.print("Nhập họ tên cần tìm: ");
                    String hoTenCanTim = scanner.nextLine();
                    qlcb.timKiemTheoHoTen(hoTenCanTim);
                    break;

                case 3:
                    qlcb.hienThiDanhSachCanBo();
                    break;

                case 4:
                    qlcb.thoat();
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}