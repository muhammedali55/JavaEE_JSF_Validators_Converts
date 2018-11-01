package com.muhammet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="index2bean")
@SessionScoped
public class index2Bean {

	private String kullaniciAdi;
	
	private double sayi;
	
	private String  zorunluSekilChar;

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public double getSayi() {
		return sayi;
	}

	public void setSayi(double sayi) {
		this.sayi = sayi;
	}

	public String getZorunluSekilChar() {
		return zorunluSekilChar;
	}

	public void setZorunluSekilChar(String zorunluSekilChar) {
		this.zorunluSekilChar = zorunluSekilChar;
	}
	
	
	
}
