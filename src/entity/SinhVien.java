package entity;

public class SinhVien {
	private int masv;
	private String tensv;
	private Double diemthi;
	
	public SinhVien(int masv, String tensv, Double diemthi) {
		// TODO Auto-generated constructor stub
		this.masv = masv;
		this.tensv = tensv;
		this.diemthi = diemthi;
	}

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getTensv() {
		return tensv;
	}

	public void setTensv(String tensv) {
		this.tensv = tensv;
	}

	public Double getDiemthi() {
		return diemthi;
	}

	public void setDiemthi(Double diemthi) {
		this.diemthi = diemthi;
	}
}
