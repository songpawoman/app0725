package org.sp.app0725.calendar;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;

//날짜를 표현할 박스 정의
public class NumCell extends Cell{
	
	//DiaryMain 에 Calendar 객체가 존재하기 때문에, 그 객체를 접근하려고..
	DiaryMain diaryMain;
	
	public NumCell(DiaryMain diaryMain, Color color, int width, int height) {
		super(color, width, height);
		
		this.diaryMain = diaryMain;
		
		//라벨의 텍스트 크기 조정 
		la_title.setFont(new Font("돋움", Font.BOLD, 20));
		
		//마우스 이벤트 연결 
		this.addMouseListener(new MouseAdapter() {
			//클릭 
			public void mouseClicked(MouseEvent e) {
				int yy=diaryMain.cal.get(Calendar.YEAR);
				int mm=diaryMain.cal.get(Calendar.MONTH);
				String n=la_title.getText();
				
				System.out.println(yy+"-"+(mm+1)+"-"+n+" 클릭햇어?");
			}
		});
	}
	
}







