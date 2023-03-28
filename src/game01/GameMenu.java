package game01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameMenu extends JFrame implements ActionListener {
	
	private JLabel titleLabel;
    private JButton game1Button;
    private JButton game2Button;
    private JButton game3Button;
    private JButton exitButton;
	
	public GameMenu(){
		
		// 프레임 설정
        setTitle("Java Game");
        setLayout(new GridLayout(5, 1));
        setSize(250, 350);
		
        titleLabel = new JLabel("- 원하시는 게임 메뉴를 눌러주세요 -");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        add(titleLabel);
        
        
        game1Button = new JButton("가위 바위 보");
        game1Button.addActionListener(this);
        add(game1Button);
        
        game2Button = new JButton("사자성어 퀴즈");
        game2Button.addActionListener(this);
        add(game2Button);
        
        game3Button = new JButton("1~100 랜덤 숫자 맞추기");
        game3Button.addActionListener(this);
        add(game3Button);
        
        exitButton = new JButton("종료");
        exitButton.addActionListener(this);
        add(exitButton);
		
        //폰트, 색상
        Font font1 = new Font("맑은 고딕", Font.BOLD, 15);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 12);
		
		titleLabel.setFont(font2);
		game1Button.setFont(font1);
		game2Button.setFont(font1);
		game3Button.setFont(font1);
		exitButton.setFont(font1);
		
		titleLabel.setForeground(new Color(47, 79, 79));
		game1Button.setForeground(new Color(106, 90, 205));
		game2Button.setForeground(new Color(123, 104, 238));
		game3Button.setForeground(new Color(65, 105, 225));
		exitButton.setForeground(new Color(25, 25, 112));

		getContentPane().setBackground(new Color(255, 239, 213));
		game1Button.setBackground(new Color(255, 250, 205));
		game2Button.setBackground(new Color(255, 245, 238));
		game3Button.setBackground(new Color(240, 255, 240));
		exitButton.setBackground(new Color(230, 230, 250));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 창이 가운데 나오게
        setVisible(true);	
	}

	
	public void actionPerformed(ActionEvent e) {
		// 학생 등록폼이 눌렸냐?
        if (e.getSource() == game1Button) {
        	System.out.println("가위 바위 보 게임을 실행 합니다.");
            // 현재의 메인 메뉴 화면 닫기                
            this.dispose();
            // 이동해갈 화면 객체 생성(학생등록폼)
            RockPaperScissorsMain rpsForm = new RockPaperScissorsMain();
            // 이동해갈 화면 보이기
            rpsForm.setVisible(true);
        } else if (e.getSource() == game2Button) {
        	System.out.println("사자성어 퀴즈 게임을 실행 합니다.");
        	// 현재의 메인 메뉴 화면 닫기                
            this.dispose();
            // 이동해갈 화면 객체 생성(학생등록폼)
            QuizMain quizForm = new QuizMain();
            // 이동해갈 화면 보이기
            quizForm.setVisible(true);
        } else if (e.getSource() == game3Button) {
        	System.out.println("랜덤 숫자 맞추기 게임을 실행 합니다.");
        	this.dispose();
        	NumberMain numberForm = new NumberMain();
        	numberForm.setVisible(true);
        } else if (e.getSource() == exitButton) {
        	System.exit(0);
        }
        
	}
	
	public static void main(String[] args) {
		new GameMenu();
	}

}
