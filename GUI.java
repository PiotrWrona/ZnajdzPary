import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * Tworzy graficzny interfejs gry
 * 
 * @author Piotr Wrona
 * @version 1.1
 */

public class GUI extends Gra{

	static public JButton b01,b02,b03,b04,b05,b06,b07,b08,b09,b10,b11,b12,b13,b14,b15,b16,b17,b18,
							b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36;
	public static Icon img00, img01,img02,img03,img04,img05,img06,img07,img08,img09,img10,img11,img12,img13,img14,img15,img16,img17,img18,
						img19,img20,img21,img22,img23,img24,img25,img26,img27,img28,img29,img30,img31,img32,img33,img34,img35,img36;
	public static Icon[] tabelaGrafik = new Icon[liczbaKart];
	
	
	/**
	 * Konstruuje ekran gry
	 */	
	public GUI(){
		setSize(550,550);
		setTitle("Pary");
		setLayout(null);
		
		stworzIkony();
		stworzPrzyciski();	
		
	}	




	/**
	 * Tworzy ikony
	 */
	public void stworzIkony() {
		
		try {
			img00 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/tylKarty.png")));
			
			tabelaGrafik[0] = img01 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b01.png")));
			tabelaGrafik[1] = img02 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b02.png")));	
			tabelaGrafik[2] = img03 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b03.png")));
			tabelaGrafik[3] = img04 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b04.png")));
			tabelaGrafik[4] = img05 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b05.png")));	
			tabelaGrafik[5] = img06 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b06.png")));
			tabelaGrafik[6] = img07 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b07.png")));
			tabelaGrafik[7] = img08 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b08.png")));	
			tabelaGrafik[8] = img09 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b09.png")));	
			tabelaGrafik[9] = img10 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b10.png")));
			tabelaGrafik[10] = img11 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b11.png")));	
			tabelaGrafik[11] = img12 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b12.png")));
			tabelaGrafik[12] = img13 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b13.png")));
			tabelaGrafik[13] = img14 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b14.png")));	
			tabelaGrafik[14] = img15 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b15.png")));
			tabelaGrafik[15] = img16 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b16.png")));
			tabelaGrafik[16] = img17 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b17.png")));	
			tabelaGrafik[17] = img18 = new ImageIcon(ImageIO.read(ZrodloIkon.load("grafika/b18.png")));
			
			tabelaGrafik[18] = img01;
			tabelaGrafik[19] = img02;
			tabelaGrafik[20] = img03;
			tabelaGrafik[21] = img04;
			tabelaGrafik[22] = img05;
			tabelaGrafik[23] = img06;
			tabelaGrafik[24] = img07;
			tabelaGrafik[25] = img08;
			tabelaGrafik[26] = img09;
			tabelaGrafik[27] = img10;
			tabelaGrafik[28] = img11;
			tabelaGrafik[29] = img12;
			tabelaGrafik[30] = img13;
			tabelaGrafik[31] = img14;
			tabelaGrafik[32] = img15;
			tabelaGrafik[33] = img16;
			tabelaGrafik[34] = img17;
			tabelaGrafik[35] = img18;
			
		} catch (IOException e) {
			System.out.println("Nie zaladowano grafiki");
			e.printStackTrace();
		}	
	}

	/**
	 * Tworzy pszyciski
	 */
	public void stworzPrzyciski() {
		
		b01 = new JButton(img00);
		//b01.setRolloverIcon(img01);
		b01.setBounds(70,20,60,60);
		add(b01);
		b02 = new JButton(img00);
		b02.setBounds(140,20,60,60);
		add(b02);
		b03 = new JButton(img00);
		b03.setBounds(210,20,60,60);
		add(b03);
		b04 = new JButton(img00);
		b04.setBounds(280,20,60,60);
		add(b04);
		b05 = new JButton(img00);
		b05.setBounds(350,20,60,60);
		add(b05);
		b06 = new JButton(img00);
		b06.setBounds(420,20,60,60);
		add(b06);
		
		b07 = new JButton(img00);
		b07.setBounds(70,90,60,60);
		add(b07);
		b08 = new JButton(img00);
		b08.setBounds(140,90,60,60);
		add(b08);
		b09 = new JButton(img00);
		b09.setBounds(210,90,60,60);
		add(b09);
		b10 = new JButton(img00);
		b10.setBounds(280,90,60,60);
		add(b10);
		b11 = new JButton(img00);
		b11.setBounds(350,90,60,60);
		add(b11);
		b12 = new JButton(img00);
		b12.setBounds(420,90,60,60);
		add(b12);
		
		b13 = new JButton(img00);
		b13.setBounds(70,160,60,60);
		add(b13);
		b14 = new JButton(img00);
		b14.setBounds(140,160,60,60);
		add(b14);
		b15 = new JButton(img00);
		b15.setBounds(210,160,60,60);
		add(b15);
		b16 = new JButton(img00);
		b16.setBounds(280,160,60,60);
		add(b16);
		b17 = new JButton(img00);
		b17.setBounds(350,160,60,60);
		add(b17);
		b18 = new JButton(img00);
		b18.setBounds(420,160,60,60);
		add(b18);
		
		b19 = new JButton(img00);
		b19.setBounds(70,230,60,60);
		add(b19);
		b20 = new JButton(img00);
		b20.setBounds(140,230,60,60);
		add(b20);
		b21 = new JButton(img00);
		b21.setBounds(210,230,60,60);
		add(b21);
		b22 = new JButton(img00);
		b22.setBounds(280,230,60,60);
		add(b22);
		b23 = new JButton(img00);
		b23.setBounds(350,230,60,60);
		add(b23);
		b24 = new JButton(img00);
		b24.setBounds(420,230,60,60);
		add(b24);
		
		b25 = new JButton(img00);
		b25.setBounds(70,300,60,60);
		add(b25);
		b26 = new JButton(img00);
		b26.setBounds(140,300,60,60);
		add(b26);
		b27 = new JButton(img00);
		b27.setBounds(210,300,60,60);
		add(b27);
		b28 = new JButton(img00);
		b28.setBounds(280,300,60,60);
		add(b28);
		b29 = new JButton(img00);
		b29.setBounds(350,300,60,60);
		add(b29);
		b30 = new JButton(img00);
		b30.setBounds(420,300,60,60);
		add(b30);
		
		b31 = new JButton(img00);
		b31.setBounds(70,370,60,60);
		add(b31);
		b32 = new JButton(img00);
		b32.setBounds(140,370,60,60);
		add(b32);
		b33 = new JButton(img00);
		b33.setBounds(210,370,60,60);
		add(b33);
		b34 = new JButton(img00);
		b34.setBounds(280,370,60,60);
		add(b34);
		b35 = new JButton(img00);
		b35.setBounds(350,370,60,60);
		add(b35);
		b36 = new JButton(img00);
		b36.setBounds(420,370,60,60);
		add(b36);		
		
		b01.addActionListener(this);
		b02.addActionListener(this);
		b03.addActionListener(this);
		b04.addActionListener(this);
		b05.addActionListener(this);
		b06.addActionListener(this);
		b07.addActionListener(this);
		b08.addActionListener(this);
		b09.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
		b26.addActionListener(this);
		b27.addActionListener(this);
		b28.addActionListener(this);
		b29.addActionListener(this);
		b30.addActionListener(this);
		b31.addActionListener(this);
		b32.addActionListener(this);
		b33.addActionListener(this);
		b34.addActionListener(this);
		b35.addActionListener(this);
		b36.addActionListener(this);
	}




	public static void main(String[] args) {			
		GUI okno = new GUI();
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		okno.setBounds(200,50,550,550);
		Gra.przygotujKarty();
		okno.setVisible(true);
	}
	
	
}
