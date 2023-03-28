package game01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class NumberMain extends JFrame implements ActionListener {
	
	private JTextField tf1, tf2;
	private JButton bt1, bt2;
	private JLabel lb1, lb2, lb3;
	
	private int a = 0;	//랜덤으로 생성된 숫자
	private int x = 0;		//정답 입력 값
	private int count = 0;	//시도횟수
	//생성자
	public NumberMain() {
		
		// 라벨 생성
		lb1 = new JLabel("1부터 100사이의 숫자 중 하나로 배정된 숫자를 맞추시오.");
		lb2 = new JLabel("정답 :");
		lb3 = new JLabel("결과 :");
		// 텍스트 생성

		tf1 = new JTextField(); // 정답 기입칸
		tf2 = new JTextField(); // 결과
		tf2.setEditable(false);
		// 버튼 생성
		bt1 = new JButton("정답 제출");
		bt2 = new JButton("Start / Reset");

		// 라벨 추가
		add(lb1);
		add(lb2);
		add(lb3);
		// 텍스트 추가
		add(tf1);
		add(tf2);
		// 버튼 추가
		add(bt1);
		add(bt2);

		// 라벨, 텍스트 크기 설정
		lb1.setBounds(7, 0, 500, 30);
		lb2.setBounds(7, 37, 100, 30);
		tf1.setBounds(53, 40, 52, 28);
		lb3.setBounds(112, 37, 100, 30);
		tf2.setBounds(157, 40, 225, 28);
		// 버튼 크기설정
		bt1.setBounds(390, 40, 123, 29);
		bt2.setBounds(405, 3, 108, 29);

		// 액션리스너
		bt1.addActionListener(this);
		bt2.addActionListener(this);

		// 폰트 설정
		Font font1 = new Font("맑은 고딕", Font.BOLD, 15);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 12);
		lb1.setFont(font1);
		lb2.setFont(font1);
		tf1.setFont(font1);
		lb3.setFont(font1);
		tf2.setFont(font2);
		bt1.setFont(font2);
		bt1.setFont(font2);
		
		bt1.setBackground(new Color(230, 230, 250));
		bt2.setBackground(new Color(255, 248, 220));
		bt1.setForeground(new Color(72, 61, 139));
		bt2.setForeground(new Color(250, 128, 114));
		tf1.setForeground(new Color(54, 54, 54));
		tf2.setForeground(new Color(54, 54, 54));
		lb1.setForeground(new Color(47, 79, 79));
		lb2.setForeground(new Color(47, 79, 79));
		lb3.setForeground(new Color(47, 79, 79));

		// 메인 패널을 프레임의 루트 컨텐트에 저장
		setTitle("랜덤 숫자 맞추기 게임");
		setSize(536, 115);
		getContentPane().setBackground(Color.WHITE); // 배경 색상 변경
		setResizable(false); // 창의 크기를 변경하지 못하게
		setLocationRelativeTo(null); // 창이 가운데 나오게
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

	//액션
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == bt2) {
			a = (int) ((Math.random()*100) + 1);
			System.out.println("랜덤 숫자가 생성되었습니다.");
			tf2.setText("랜덤 숫자가 생성되었습니다.");
			count = 0;
		}
		if (e.getSource() == bt1) {
			x = Integer.parseInt(tf1.getText());
			if (a > x) {
				if((a - x) <= 10) {
					System.out.println("틀렸습니다! 조금 높은 수를 입력하세요.");
					tf2.setText("틀렸습니다! 조금 높은 수를 입력하세요.");
					count++;
				} else {					
					System.out.println("틀렸습니다! 더 높은 수를 입력하세요.");
					tf2.setText("틀렸습니다! 더 높은 수를 입력하세요.");
					count++;
				}
			} else if (a < x) {
				if((x - a) <= 10) {
					System.out.println("틀렸습니다! 조금 낮은 수를 입력하세요.");
					tf2.setText("틀렸습니다! 조금 낮은 수를 입력하세요.");
					count++;
				} else {					
					System.out.println("틀렸습니다! 더 낮은 수를 입력하세요.");
					tf2.setText("틀렸습니다! 더 낮은 수를 입력하세요.");
					count++;
				}
			} else if (a == x) {
				count++;
				System.out.println("정답입니다! 생성된 숫자는 " + a + "입니다.");
				tf2.setText("정답! 랜덤 숫자 : " + a + ", 총 시도 횟수 : " + count + "회");
			}	
		}
	}

	public static void main(String[] args) {
		new NumberMain();
	}
	
	
}
