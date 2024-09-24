package org.lang;

public class StateDetails {
	public void southIndia() {
		System.out.println("Hindi,Enlgish,Tamil");

	}public void northIndia() {
		System.out.println("Hindi,Enlgish");

	}

	public static void main(String[] args) {
		LanguageInfo l=new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		
		StateDetails s=new StateDetails();
		s.southIndia();
		s.northIndia();
	}
		
	
}
