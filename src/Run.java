import javax.swing.JFrame;

import java.awt.GraphicsConfiguration;

import java.util.List;

public class Run{

	static GraphicsConfiguration gc;
	public static void main(String[] args){
		JFrame myFrame = new JFrame(gc);
		myFrame.setTitle("Userlist");
		myFrame.setVisible(true);
		myFrame.setSize(300, 500);
		myFrame.setBounds(100, 200, 1200, 600);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//gegevens word hier gekoppeld aan Persoon bij naam bijv. kevin
		Mysqlcon mysqlcon = new Mysqlcon();
		mysqlcon.init();

		Persoon kevin = new Persoon();
		kevin.setVoornaam("Kevin");
		kevin.setAchternaam("Blank");
		kevin.setGeboorteDatum("11-01-1999");
		System.out.println(kevin);
//		mysqlcon.insertPerson(kevin);

		Persoon sidian = new Persoon();
		sidian.setVoornaam("Sidian");
		sidian.setAchternaam("Kon�");
		sidian.setGeboorteDatum("25-9-2001");
		System.out.println(sidian);
//		mysqlcon.insertPerson(sidian);

//		List<Persoon> alles = mysqlcon.getAll();
//		for (Persoon p : alles) {
//			System.out.println(p.getVoornaam());
//		}

//		Persoon edward = new Persoon();
//		edward.setVoornaam("Edward");
//		edward.setAchternaam("Hess");
//		edward.setGeboorteDatum("31-10-1958");
//		System.out.println(edward);
//
//		Persoon anouk = new Persoon();
//		anouk.setVoornaam("Anouk");
//		anouk.setAchternaam("Gemmer");
//		anouk.setGeboorteDatum("06-02-2002");
//		System.out.println(anouk);
//
//		Persoon jozef = new Persoon();
//		jozef.setVoornaam("Jozef");
//		jozef.setAchternaam("Tromp");
//		jozef.setGeboorteDatum("04-09-1999");
//		System.out.println(jozef);
//
//		Persoon lars = new Persoon();
//		lars.setVoornaam("Lars");
//		lars.setAchternaam("Stuursma");
//		lars.setGeboorteDatum("25-05-2001");
//		System.out.println(lars);
//
//		Persoon dylan = new Persoon();
//		dylan.setVoornaam("Dylan");
//		dylan.setAchternaam("Spin");
//		dylan.setGeboorteDatum("09-07-2002");
//		System.out.println(dylan);
//
//		Persoon angela = new Persoon();
//		angela.setVoornaam("Angela");
//		angela.setAchternaam("Blank");
//		angela.setGeboorteDatum("15-10-1967");
//		System.out.println(angela);
//
	}
}