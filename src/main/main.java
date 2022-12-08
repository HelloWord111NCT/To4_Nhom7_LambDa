package main;

import java.util.Arrays;
import java.util.List;

import entity.SinhVien;
import enums.codex;
import services.services1;
import services_lambda.methods_lambda;

public class main {
	public static methods_lambda lambdaExpress = new methods_lambda();
	public static void main(String args[]) {
		// Autowride
		List<SinhVien> listSv = Arrays.asList(
				new SinhVien(1,"Bui Quoc Dat", 4.0),
				new SinhVien(4,"Luong Tuan Vy", 8.5),
				new SinhVien(3,"Le Phuoc Lai", 8.0),
				new SinhVien(2,"Dang Trung Tinh", 7.0),
				new SinhVien(5,"Thanh Phuc", 2.0),
				new SinhVien(6,"Thanh Nam", 5.0),
				new SinhVien(7,"Thien", 1.0),
				new SinhVien(8,"Chi Thanh", 6.0),
				new SinhVien(9,"Minh Thu", 6.7));
		// bai 1: DS SV Tren Trung Binh
		List<SinhVien> resultx = lambdaExpress.danhSachSinhVienTrenTB(listSv);
		//lambdaExpress.InDanhSachSinhVien(resultx);
		lambdaExpress.outPutMessage(codex.sortByNameAsc.getCode());
	}
	
}
