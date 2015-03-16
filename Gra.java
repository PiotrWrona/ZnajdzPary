import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Klasa odpowiedzialna za mechanikê gry
 * 
 * @author Piotr Wrona
 * @version 1.1
 *
 */
public class Gra extends JFrame implements ActionListener{

	/**
	 * @param liczbaKart liczba  kart w grze
	 * @param listaPrzyciskow lista przycisków (kart)
	 */
	public static final int liczbaKart = 36;
	public static ArrayList<Icon> listaPrzyciskow = new ArrayList<Icon>();

	/**
	 * Tworzy karty w postaci przycisków do gry
	 * @see JButton
	 */
	public static void przygotujKarty(){
	
		int n = liczbaKart;
		int[] tablicaLiczb0do35 = new int[n];
		for (int i=0; i<n; i++){
			tablicaLiczb0do35[i]=i;
		}
	
		for(int i=0; i<n; i++){		
			listaPrzyciskow.add(GUI.img00);
		}	
		
		for(int i=0; i<liczbaKart; i++){		
			int wylosowana = (int)(Math.random()*n);
			listaPrzyciskow.set(tablicaLiczb0do35[wylosowana], GUI.tabelaGrafik[i]);
			tablicaLiczb0do35[wylosowana] = tablicaLiczb0do35[n-1];
			n--;
		}
	}

	
	
	public boolean bylJuzKlik,bylyJuzDwaKliki,rozneKarty;
	public JButton klikniety, klikniety1,klikniety2;	
	public Icon kliknietyIkona, kliknietyIkona1, kliknietyIkona2;
	
	/**
	 * Obs³uga klikniêæ myszk¹ na dane karty
	 */
	public void actionPerformed(ActionEvent e) {
		Object objektZdarzenia = e.getSource();
		
		if(rozneKarty){
			klikniety1.setIcon(GUI.img00);
			klikniety2.setIcon(GUI.img00);
			rozneKarty=false;
		}
		else{
			if(!bylJuzKlik){	
				kliknieto(objektZdarzenia, klikniety1);	
				bylJuzKlik=true;
			}
			else if(bylJuzKlik && !objektZdarzenia.equals(klikniety1)){	
				kliknieto(objektZdarzenia, klikniety2);
				bylJuzKlik=false;
				bylyJuzDwaKliki=true;
			}	
			
			
			if (bylyJuzDwaKliki){
				if (kliknietyIkona1.toString().equals(kliknietyIkona2.toString())){			
					klikniety1.setEnabled(false);
					klikniety2.setEnabled(false);
				}
				else{
					rozneKarty=true;
				}
				bylyJuzDwaKliki=false;
			}
		
		}
		

	}


	/**
	 * Ukazanie karty poprzez klikniêcie w ni¹
	 * @param zdarzenie klikniêcie myszk¹
	 * @param klikniety wybrana karta (przycisk)
	 */
	private void kliknieto(Object zdarzenie, JButton klikniety) {
			if (zdarzenie == GUI.b01){
				kliknietyIkona = (Icon) listaPrzyciskow.get(0);
				GUI.b01.setIcon(kliknietyIkona);
				klikniety = GUI.b01;
			}
			else if (zdarzenie == GUI.b02){
				kliknietyIkona = (Icon) listaPrzyciskow.get(1);
				GUI.b02.setIcon(kliknietyIkona);
				klikniety = GUI.b02;
			}
			else if (zdarzenie == GUI.b03){
				kliknietyIkona = (Icon) listaPrzyciskow.get(2);
				GUI.b03.setIcon(kliknietyIkona);
				klikniety = GUI.b03;
			}
			else if (zdarzenie == GUI.b04){
				kliknietyIkona = (Icon) listaPrzyciskow.get(3);
				GUI.b04.setIcon(kliknietyIkona);
				klikniety = GUI.b04;
			}
			else if (zdarzenie == GUI.b05){
				kliknietyIkona = (Icon) listaPrzyciskow.get(4);
				GUI.b05.setIcon(kliknietyIkona);
				klikniety = GUI.b05;
			}
			else if (zdarzenie == GUI.b06){
				kliknietyIkona = (Icon) listaPrzyciskow.get(5);
				GUI.b06.setIcon(kliknietyIkona);
				klikniety = GUI.b06;
			}
			else if (zdarzenie == GUI.b07){
				kliknietyIkona = (Icon) listaPrzyciskow.get(6);
				GUI.b07.setIcon(kliknietyIkona);
				klikniety = GUI.b07;
			}
			else if (zdarzenie == GUI.b08){
				kliknietyIkona = (Icon) listaPrzyciskow.get(7);
				GUI.b08.setIcon(kliknietyIkona);
				klikniety = GUI.b08;
			}
			else if (zdarzenie == GUI.b09){
				kliknietyIkona = (Icon) listaPrzyciskow.get(8);
				GUI.b09.setIcon(kliknietyIkona);
				klikniety = GUI.b09;
			}
			else if (zdarzenie == GUI.b10){
				kliknietyIkona = (Icon) listaPrzyciskow.get(9);
				GUI.b10.setIcon(kliknietyIkona);
				klikniety = GUI.b10;
			}
			else if (zdarzenie == GUI.b11){
				kliknietyIkona = (Icon) listaPrzyciskow.get(10);
				GUI.b11.setIcon(kliknietyIkona);
				klikniety = GUI.b11;
			}
			else if (zdarzenie == GUI.b12){
				kliknietyIkona = (Icon) listaPrzyciskow.get(11);
				GUI.b12.setIcon(kliknietyIkona);
				klikniety = GUI.b12;
			}
			else if (zdarzenie == GUI.b13){
				kliknietyIkona = (Icon) listaPrzyciskow.get(12);
				GUI.b13.setIcon(kliknietyIkona);
				klikniety = GUI.b13;
			}
			else if (zdarzenie == GUI.b14){
				kliknietyIkona = (Icon) listaPrzyciskow.get(13);
				GUI.b14.setIcon(kliknietyIkona);
				klikniety = GUI.b14;
			}
			else if (zdarzenie == GUI.b15){
				kliknietyIkona = (Icon) listaPrzyciskow.get(14);
				GUI.b15.setIcon(kliknietyIkona);
				klikniety = GUI.b15;
			}
			else if (zdarzenie == GUI.b16){
				kliknietyIkona = (Icon) listaPrzyciskow.get(15);
				GUI.b16.setIcon(kliknietyIkona);
				klikniety = GUI.b16;
			}
			else if (zdarzenie == GUI.b17){
				kliknietyIkona = (Icon) listaPrzyciskow.get(16);
				GUI.b17.setIcon(kliknietyIkona);
				klikniety = GUI.b17;
			}
			else if (zdarzenie == GUI.b18){
				kliknietyIkona = (Icon) listaPrzyciskow.get(17);
				GUI.b18.setIcon(kliknietyIkona);
				klikniety = GUI.b18;
			}
			else if (zdarzenie == GUI.b19){
				kliknietyIkona = (Icon) listaPrzyciskow.get(18);
				GUI.b19.setIcon(kliknietyIkona);
				klikniety = GUI.b19;
			}
			else if (zdarzenie == GUI.b20){
				kliknietyIkona = (Icon) listaPrzyciskow.get(19);
				GUI.b20.setIcon(kliknietyIkona);
				klikniety = GUI.b20;
			}
			else if (zdarzenie == GUI.b21){
				kliknietyIkona = (Icon) listaPrzyciskow.get(20);
				GUI.b21.setIcon(kliknietyIkona);
				klikniety = GUI.b21;
			}
			else if (zdarzenie == GUI.b22){
				kliknietyIkona = (Icon) listaPrzyciskow.get(21);
				GUI.b22.setIcon(kliknietyIkona);
				klikniety = GUI.b22;
			}
			else if (zdarzenie == GUI.b23){
				kliknietyIkona = (Icon) listaPrzyciskow.get(22);
				GUI.b23.setIcon(kliknietyIkona);
				klikniety = GUI.b23;
			}
			else if (zdarzenie == GUI.b24){
				kliknietyIkona = (Icon) listaPrzyciskow.get(23);
				GUI.b24.setIcon(kliknietyIkona);
				klikniety = GUI.b24;
			}
			else if (zdarzenie == GUI.b25){
				kliknietyIkona = (Icon) listaPrzyciskow.get(24);
				GUI.b25.setIcon(kliknietyIkona);
				klikniety = GUI.b25;
			}
			else if (zdarzenie == GUI.b26){
				kliknietyIkona = (Icon) listaPrzyciskow.get(25);
				GUI.b26.setIcon(kliknietyIkona);
				klikniety = GUI.b26;
			}
			else if (zdarzenie == GUI.b27){
				kliknietyIkona = (Icon) listaPrzyciskow.get(26);
				GUI.b27.setIcon(kliknietyIkona);
				klikniety = GUI.b27;
			}
			else if (zdarzenie == GUI.b28){
				kliknietyIkona = (Icon) listaPrzyciskow.get(27);
				GUI.b28.setIcon(kliknietyIkona);
				klikniety = GUI.b28;
			}
			else if (zdarzenie == GUI.b29){
				kliknietyIkona = (Icon) listaPrzyciskow.get(28);
				GUI.b29.setIcon(kliknietyIkona);
				klikniety = GUI.b29;
			}
			else if (zdarzenie == GUI.b30){
				kliknietyIkona = (Icon) listaPrzyciskow.get(29);
				GUI.b30.setIcon(kliknietyIkona);
				klikniety = GUI.b30;
			}
			else if (zdarzenie == GUI.b31){
				kliknietyIkona = (Icon) listaPrzyciskow.get(30);
				GUI.b31.setIcon(kliknietyIkona);
				klikniety = GUI.b31;
			}
			else if (zdarzenie == GUI.b32){
				kliknietyIkona = (Icon) listaPrzyciskow.get(31);
				GUI.b32.setIcon(kliknietyIkona);
				klikniety = GUI.b32;
			}
			else if (zdarzenie == GUI.b33){
				kliknietyIkona = (Icon) listaPrzyciskow.get(32);
				GUI.b33.setIcon(kliknietyIkona);
				klikniety = GUI.b33;
			}
			else if (zdarzenie == GUI.b34){
				kliknietyIkona = (Icon) listaPrzyciskow.get(33);
				GUI.b34.setIcon(kliknietyIkona);
				klikniety = GUI.b34;
			}
			else if (zdarzenie == GUI.b35){
				kliknietyIkona = (Icon) listaPrzyciskow.get(34);
				GUI.b35.setIcon(kliknietyIkona);
				klikniety = GUI.b35;
			}
			else if (zdarzenie == GUI.b36){
				kliknietyIkona = (Icon) listaPrzyciskow.get(35);
				GUI.b36.setIcon(kliknietyIkona);
				klikniety = GUI.b36;
			}
			else{System.out.println("blad001");}
			
			doUzycia(klikniety, kliknietyIkona);
		}

	/**
	 * Mechanizm sprawdzaj¹cy identyczne pary wybranych kart.
	 * W przypadku wybrania dwóch takich samych kart - zatwierdzenie.
	 * W przypadku wybrania ró¿nych kart - ukrycie ich.
	 * @param klikniety wybrana karta (przycisk)
	 * @param kliknietyIkona wybrana karta (grafika karty)
	 */
	private void doUzycia(JButton klikniety, Icon kliknietyIkona) {
		if (!bylJuzKlik){
			klikniety1=klikniety;
			kliknietyIkona1=kliknietyIkona;
		}
		else{
			klikniety2=klikniety;
			kliknietyIkona2=kliknietyIkona;
		}
	}

}
