import java.util.ArrayList;
import java.util.Scanner;

class CongViec {

	String ten;
	boolean hoanThanh;

	CongViec(String ten) {
		this.ten = ten;
		this.hoanThanh = false;
	}
}

public class todolist {

	public static void main(String[] args) {

		ArrayList<CongViec> danhSach = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n===== QUẢN LÝ CÔNG VIỆC =====");

			System.out.println("1. Thêm công việc");
			System.out.println("2. Xem danh sách");
			System.out.println("3. Hoàn thành công việc");
			System.out.println("4. Xóa công việc");
			System.out.println("5. Thoát");
			System.out.print("Bạn muốn chọn gì: ");
			int luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon == 1) {
				System.out.print("Nhập tên công việc: ");

				String ten = sc.nextLine();

				danhSach.add(new CongViec(ten));

				System.out.println("Đã thêm!");
			} else if (luaChon == 2) {

				System.out.println("\n===== DANH SÁCH =====");
				for (int i = 0; i < danhSach.size(); i++) {
					CongViec cv = danhSach.get(i);
					System.out.println(i + ". " + cv.ten + " | Hoàn thành: " + cv.hoanThanh);
				}
			} else if (luaChon == 3) {
				System.out.print("Nhập vị trí công việc: ");
				int viTri = sc.nextInt();
				danhSach.get(viTri).hoanThanh = true;
				System.out.println("Đã hoàn thành!");
			} else if (luaChon == 4) {
				System.out.print("Nhập vị trí cần xóa: ");
				int viTri = sc.nextInt();
				danhSach.remove(viTri);
				System.out.println("Đã xóa!");
			} else if (luaChon == 5) {
				System.out.println("Tạm biệt!");
				break;
			} else {
				System.out.println("Lựa chọn không hợp lệ!");
			}
		}
	}
}