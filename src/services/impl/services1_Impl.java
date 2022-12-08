package services.impl;

import java.util.List;
import java.util.stream.Collectors;

import entity.SinhVien;
import services.services1;

public class services1_Impl implements services1{
	@Override
	public List<SinhVien> danhSachSinhVienTrenTB(List<SinhVien> lst) {
		List<SinhVien> result = null;
		result = lst.stream().filter(x -> x.getDiemthi() >=5 )
					.collect(Collectors.toList());
		return result;
	}

}
