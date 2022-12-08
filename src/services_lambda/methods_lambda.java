package services_lambda;

import java.util.List;
import java.util.stream.Collectors;

import entity.SinhVien;

public class methods_lambda {
	public List<SinhVien> danhSachSinhVienTrenTB(List<SinhVien> lst) {
		List<SinhVien> result = null;
		result = lst.stream().filter(x -> x.getDiemthi() >=5 )
					.collect(Collectors.toList());
		return result;
	};
	
	public void InDanhSachSinhVien(List<SinhVien> lst) {
		lst.forEach(e -> {
			System.out.println(">> Ten : "+ e.getTensv() + " Diem: "+ e.getDiemthi());
		});	
	};
	
	public void outPutMessage(String message) {
		System.out.println(message);
	}
	
}
