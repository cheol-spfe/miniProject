package game01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RockPaperScissorsMain extends JFrame implements ActionListener { // (가위, 바위, 보) 게임 만들기

	// 필드
	private JTextField tf1, tf2, tf3, tf4, tf5;
	private JButton btRock, btPaper, btScissors;
	private JLabel lb1, lb2, lb3, lb4, lb5;

	private int win = 0;
	private int lose = 0;
	private int draw = 0;
	
	// 생성자
	public RockPaperScissorsMain() {

		//라벨 생성
		lb1 = new JLabel("상대 :");
		lb2 = new JLabel("결과 :");
		lb3 = new JLabel("WIN :");
		lb4 = new JLabel("LOSE :");
		lb5 = new JLabel("DRAW :");
		
		//텍스트 생성
		tf1 = new JTextField();
		tf1.setEditable(false);
		tf2 = new JTextField();
		tf2.setEditable(false);
		tf3 = new JTextField();
		tf3.setEditable(false);
		tf4 = new JTextField();
		tf4.setEditable(false);
		tf5 = new JTextField();
		tf5.setEditable(false);

		//이미지 추가
		ImageIcon imgScissors = new ImageIcon("src/game01/Scissors.png");
		ImageIcon imgRock = new ImageIcon("src/game01/Rock.png");
		ImageIcon imgPaper = new ImageIcon("src/game01/Paper.png");
		
		//버튼 생성
		btScissors = new JButton(imgScissors);
		btRock = new JButton(imgRock);
		btPaper = new JButton(imgPaper);
		
		//라벨 추가
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(lb5);
		
		//텍스트 추가
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(tf5);
		
		//버튼 추가
		add(btScissors);
		add(btRock);
		add(btPaper);
		
		//라벨, 텍스트 크기 설정
		lb1.setBounds(53, 0, 100, 30);
		tf1.setBounds(43, 30, 90, 30);
		lb2.setBounds(173, 0, 100, 30);
		tf2.setBounds(163, 30, 90, 30);
		lb3.setBounds(10, 70, 100, 30);
		tf3.setBounds(42, 76, 48, 20);
		lb4.setBounds(106, 70, 100, 30);
		tf4.setBounds(146, 76, 45, 20);
		lb5.setBounds(208, 70, 100, 30);
		tf5.setBounds(253, 76, 38, 20);

		//버튼 크기설정
		btScissors.setBounds(0, 105, 100, 100);
		btRock.setBounds(100, 105, 100, 100);
		btPaper.setBounds(200, 105, 100, 100);
		
		
		//액션리스너
		btScissors.addActionListener(this);
		btRock.addActionListener(this);
		btPaper.addActionListener(this);
		
		//폰트 설정
		Font font1 = new Font("맑은 고딕", Font.BOLD, 15);
		tf1.setFont(font1);
		tf2.setFont(font1);
		lb1.setFont(font1);
		lb2.setFont(font1);
		
		tf1.setForeground(new Color(65, 105, 225));
		tf2.setForeground(new Color(139, 54, 38));
		
		lb1.setForeground(new Color(70, 130, 180));
		lb2.setForeground(new Color(205, 92, 92));
		lb3.setForeground(new Color(72, 61, 139));
		lb4.setForeground(new Color(72, 61, 139));
		lb5.setForeground(new Color(72, 61, 139));
		
		// 메인 패널을 프레임의 루트 컨텐트에 저장
		setTitle("가위 바위 보");
		setSize(316,244);
		getContentPane().setBackground(Color.WHITE); //배경 색상 변경
		setResizable(false); //창의 크기를 변경하지 못하게
		setLocationRelativeTo(null); //창이 가운데 나오게
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	//메인
	public static void main(String[] args) {
		new RockPaperScissorsMain();
	}
	
	// 액션 리스너
	public void actionPerformed(ActionEvent e) {

		String result = null;
		String ai = null;
		int num = (int)(Math.random()*3);

		//가위
		if (e.getSource() == btScissors) {
			switch (num) {
			case 0: 
				ai = "가위";
				result = "비겼습니다";
				System.out.println("비겼습니다.");
				draw++;
				break;
				
			case 1: 
				ai = "바위";
				result = "졌습니다";
				System.out.println("졌습니다.");
				lose++;
				break;
				
			case 2: 
				ai = "보";
				result = "이겼습니다";
				System.out.println("이겼습니다.");
				win++;
				break;

			default:
				break;
			}
            tf1.setText(ai);
            tf2.setText(result);
		}
		//바위
		if (e.getSource() == btRock) {
			switch (num) {
			case 0: 
				ai = "가위";
				result = "이겼습니다";
				System.out.println("이겼습니다.");
				win++;
				break;
				
			case 1: 
				ai = "바위";
				result = "비겼습니다";
				System.out.println("비겼습니다.");
				draw++;
				break;
				
			case 2: 
				ai = "보";
				result = "졌습니다";
				System.out.println("졌습니다.");
				lose++;
				break;

			default:
				break;
			}
            tf1.setText(ai);
            tf2.setText(result);
		}
		//보
		if (e.getSource() == btPaper) {
			switch (num) {
			case 0: 
				ai = "가위";
				result = "졌습니다";
				System.out.println("졌습니다.");
				lose++;
				break;
				
			case 1: 
				ai = "바위";
				result = "이겼습니다";
				System.out.println("이겼습니다.");
				win++;
				break;
				
			case 2: 
				ai = "보";
				result = "비겼습니다";
				System.out.println("비겼습니다.");
				draw++;
				break;

			default:
				break;
			}
            tf1.setText(ai);
            tf2.setText(result);
		}
		
		tf3.setText(String.valueOf(win));
		tf4.setText(String.valueOf(lose));
		tf5.setText(String.valueOf(draw));
	}
	
}
