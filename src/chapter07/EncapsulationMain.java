package chapter07;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		int side;
		int height;
		int Area;
		
		side=Integer.parseInt(JOptionPane.showInputDialog("밑변"));
		height=Integer.parseInt(JOptionPane.showInputDialog("높이"));
		
		//객체생성
		Encapsulation enc=new Encapsulation();
		
		Area=enc.Cal_Area(side, height);
		System.out.println("사각형의 넓이: "+Area+"입니다.");
		

	}

}
