package game01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuizMain extends JFrame implements ActionListener {	//사자성어 퀴즈 게임
	
	private JTextField tf1, tf2, tf3;
	private JButton bt1, bt2;
	private JLabel lb1, lb2, lb3;
	
	private List<QuizList> quizList;
	private String q;
	private String a;
	
	//생성자
	public QuizMain() {
		
		//기초데이터 (사자성어 퀴즈 문제 100개)
		quizList = new ArrayList<>();
		quizList.add(new QuizList("몇 명씩 무리를 지어 다니거나 함께 일을 하는 모양.", "삼삼오오"));
		quizList.add(new QuizList("열 가운데 여덟이나 아홉 정도로 거의 대부분이거나 거의 틀림없음.", "십중팔구"));
		quizList.add(new QuizList("도덕의 이론만 캐고 현실 사회의 일에 어두운 사람을 조롱하는 말.", "도학선생"));
		quizList.add(new QuizList("사람으로 산과 바다를 이룰 만큼 사람이 많다는 뜻.", "인산인해"));
		quizList.add(new QuizList("장기전을 피하고 속전으로 전국을 판가름하는 것.", "속전속결"));
		quizList.add(new QuizList("묻는 말에 대하여 아주 엉뚱한 방향으로 대답함", "동문서답"));
		quizList.add(new QuizList("병법에 관련된 36가지 계책을 뜻하며 곤란할 때에는 도망가는 것이 가장 좋다는 의미.", "삼십육계"));
		quizList.add(new QuizList("여러 가지 사물이 모두 차이가 있고 구별이 있음.", "천차만별"));
		quizList.add(new QuizList("장점이 있으면 단점도 있다고 하는 것.", "일장일단"));
		quizList.add(new QuizList("봄, 여름, 가을, 겨울의 네 계절.", "춘하추동"));
		quizList.add(new QuizList("죽을 고비를 여러 차례 넘기고 겨우 살아남을 이르는 말.", "구사일생"));
		quizList.add(new QuizList("큰 소리로 떠들고 마구 노래 부름.", "고성방가"));
		quizList.add(new QuizList("세 칸짜리 초가집이라는 뜻으로 작고 보잘것없는 집.", "삼간초가"));
		quizList.add(new QuizList("남의 말을 귀담아듣지 아니하고 지나쳐 흘려버림.", "마이동풍"));
		quizList.add(new QuizList("생각, 성질, 처지 등이 어느 면에서 한 가지로 서로 통함.", "일맥상통"));
		quizList.add(new QuizList("작은 것을 탐하다가 큰 것을 잃음", "소탐대실"));
		quizList.add(new QuizList("날로 달로 성장하고 발전한다는 뜻.", "일취월장"));
		quizList.add(new QuizList("옛것을 익히고 그것을 미루어서 새것을 앎.", "온고지신"));
		quizList.add(new QuizList("권세가 문 앞에 방문객으로 몹시 붐빔.", "문전성시"));
		quizList.add(new QuizList("한 번에 천금을 얻다. 즉 단 한 번에 큰 재산이나 이익을 얻는 것.", "일확천금"));
		quizList.add(new QuizList("하늘이나 땅에서 일어나는 재난이나 변사.", "천재지변"));
		quizList.add(new QuizList("오직 하나뿐 둘도 없음.", "유일무이"));
		quizList.add(new QuizList("제가 묻고 제가 대답함.", "자문자답"));
		quizList.add(new QuizList("한번 결심한 것이 사흘을 가진 않음. ", "작심삼일"));
		quizList.add(new QuizList("청산에 흐르는 물. 거침없이 잘하는 말에 비유.", "청산유수"));
		quizList.add(new QuizList("여러 방면의 일이 두루 능통한 사람.", "팔방미인"));
		quizList.add(new QuizList("보통 사람이 쉽게 짐작할 수 없을 정도로 엉뚱하고 기발한 생각.", "기상천외"));
		quizList.add(new QuizList("사회적으로 인정을 받고 출세하여 이름을 세상에 드날리다.", "입신양명"));
		quizList.add(new QuizList("한 가지 일을 하여 두 가지의 이득을 봄", "일거양득"));
		quizList.add(new QuizList("아주 명백함.", "명명백백"));
		quizList.add(new QuizList("늙지 않고 오래 산다.", "불로장생"));
		quizList.add(new QuizList("산에서의 전투와 물에서의 전투를 다 겪음. 온갖 일을 다 겪어 경험이 많음.", "산전수전"));
		quizList.add(new QuizList("여러 가지 일이 많은 데다 어려운 일도 많음.", "다사다난"));
		quizList.add(new QuizList("부산하게 이리저리 돌아다님.", "동분서주"));
		quizList.add(new QuizList("거짓인지, 참인지 갈피를 잡지 못함. 믿음과 의심이 반반 이어서 진위를 결정하지 못하는 것.", "반신반의"));
		quizList.add(new QuizList("혼자서는 장군을 못한다는 뜻으로, 남의 의견을 무시하고 혼자 모든 일을 처리하는 사람.", "독불장군"));
		quizList.add(new QuizList("마음이 공평하고 사심이 없으며 밝고 큼.", "공명정대"));
		quizList.add(new QuizList("총이나 활을 쏘면 어김없이 맞음. 또는, 예상한 일이 꼭 들어맞음.", "백발백중"));
		quizList.add(new QuizList("부자간에는 친애함이 있어야 함.", "부자유친"));
		quizList.add(new QuizList("몸과 태어난 땅은 하나라는 뜻으로, 제 땅에서 산출된 것이라야 채질에 잘 맞는다는 말.", "신토불이"));
		quizList.add(new QuizList("한마음 한 몸. 곧 굳은 결속.", "일심동체"));
		quizList.add(new QuizList("엎친 데 덮친 격으로 나쁜 일이 겹쳐서 일어남", "설상가상"));
		quizList.add(new QuizList("어떠한 실물을 보게 되면 그것을 가지고 싶은 욕심이 생김", "견물생심"));
		quizList.add(new QuizList("나라의 이익과 국민의 행복을 아울러 이르는 말.", "국리민복"));
		quizList.add(new QuizList("앞일을 미리 보아서 판단하는 총명. 앞일을 미리 내다보는 밝은 슬기.", "선견지명"));
		quizList.add(new QuizList("작은 일에서부터 시작해서 큰일을 이룸.", "이소성대"));
		quizList.add(new QuizList("사람의 목숨은 하늘에 달렸다.", "인명재천"));
		quizList.add(new QuizList("정신을 잃고 의식을 모름", "인사불성"));
		quizList.add(new QuizList("처지를 서로 바꾸어 생각함이란 뜻으로 상대방의 처지에서 생각해 봄.", "역지사지"));
		quizList.add(new QuizList("세 가지의 것이 서로 연관, 통합하여 목적하는 것이 하나가 되는 일.", "삼위일체"));
		quizList.add(new QuizList("입은 있으되 말을 하지 않는다는 뜻.", "유구불언"));
		quizList.add(new QuizList("자기의 수요를 자기가 생산하여 충당함.", "자급자족"));
		quizList.add(new QuizList("초가을 밤의 싱그런 느낌. 상쾌한 밤바람과 맑고 밝은 달빛.", "청풍명월"));
		quizList.add(new QuizList("재주와 주변이 좋아 큰 일이나 작은 일이나 임기응변으로 잘 처리해 냄.", "능대능소"));
		quizList.add(new QuizList("토끼가 잡히고 나면 충실했던 사냥개도 쓸모가 없어져 잡아먹게 된다는 뜻.", "토사구팽"));
		quizList.add(new QuizList("뼈를 가루로 만들고 몸을 부순다는 뜻으로, 있는 힘을 다해 노력함.", "분골쇄신"));
		quizList.add(new QuizList("분에 넘치는 듯싶어 매우 고맙게 여기는 모양.", "감지덕지"));
		quizList.add(new QuizList("비단위에 꽃을 더한다는 뜻으로 좋은 일 위에 좋은 일이 더하여 지는 것.", "금상첨화"));
		quizList.add(new QuizList("편안한 마음으로 분수를 알고 욕심을 내지 않으며, 만족하며 살아감.", "안분지족"));
		quizList.add(new QuizList("독서하는 데는 눈으로 보고, 입으로 읽고, 마음으로 깨우쳐야 한다는 뜻", "독서삼도"));
		quizList.add(new QuizList("괴로움과 즐거움을 함께 함", "동고동락"));
		quizList.add(new QuizList("백 번 싸워 백 번 모두 이긴다는 뜻으로, 싸울 때마다 번번이 이김", "백전백승"));
		quizList.add(new QuizList("아들의 성격이나 생활 습관 따위가 아버지로부터 대물림된 것처럼 같거나 비슷함.", "부전자전"));
		quizList.add(new QuizList("남의 비위를 맞추거나 이로운 조건을 내세워 꾀는 말", "감언이설"));
		quizList.add(new QuizList("많은 사람. 여러 갈래의 당파가 큰 덩어리로 한 데 뭉치다.", "대동단결"));
		quizList.add(new QuizList("특히 드러나게 큰 글자로 적어 표기함.", "대서특필"));
		quizList.add(new QuizList("자기의 나라와 겨레를 사랑함.", "애국애족"));
		quizList.add(new QuizList("예로부터 지금까지.", "자고이래"));
		quizList.add(new QuizList("널리 배우고 많이 안다는 뜻으로 견식이 풍부한 사람을 가리키는 말.", "박학다식"));
		quizList.add(new QuizList("한 말을 자꾸 되풀이함.", "중언부언"));
		quizList.add(new QuizList("많으면 많을수록 더욱 좋음.", "다다익선"));
		quizList.add(new QuizList("권세는 십 년을 못 간다는 말. 권세가 오래가지 못함을 이르는 말.", "권불십년"));
		quizList.add(new QuizList("인간으로서 지켜야 할 절의 와 분수. 방침으로서 표면상 내건 목적이나 이유.", "대의명분"));
		quizList.add(new QuizList("한 가지 일을 해서 두 가지의 이익을 얻음. 한 개의 돌로 두 마리 새을 잡음.", "일석이조"));
		quizList.add(new QuizList("바람 앞의 등불이란 말로, 상황이 오래 견디지 못하고 매우 위급한 형태에 놓여 있음.", "풍전등화"));
		quizList.add(new QuizList("두 사람이 맞붙어 싸우는 바람에 엉뚱한 제3자가 덕을 본다는 뜻.", "어부지리"));
		quizList.add(new QuizList("헛된 이치와 논의란 뜻으로, 사실에 맞지 않은 이론과 실제와 동떨어진 논의", "공리공론"));
		quizList.add(new QuizList("난처한 일이나 불행한 일이 계속해서 일어남, 엎친데 덮친격이다.", "설상가상"));
		quizList.add(new QuizList("사람은 죽어서 이름을 남긴다.", "인사유명"));
		quizList.add(new QuizList("자기가 저지른 일의 과보를 자기 자신이 받는 일. 나쁜 결과를 받는 경우에 사용된다.", "자업자득"));
		quizList.add(new QuizList("일각이 천금이라는 뜻. 극히 짧은 시각도 귀하고 소중하기가 천금과 같음을 일컬음.", "일각천금"));
		quizList.add(new QuizList("한두 번이 아님. 같은 일이 여러 번 일어날 때 쓰이는 말.", "비일비재"));
		quizList.add(new QuizList("한 그릇의 밥이 천금의 가치가 있음을 말함.", "일반천금"));
		quizList.add(new QuizList("뿌리도 잎도 없는 것. 전혀 사실에 근거하고 있지 않은 것.", "사실무근"));
		quizList.add(new QuizList("오 리나 되는 짙은 안개 속이라는 뜻으로 갈피를 잡지 못함.", "오리무중"));
		quizList.add(new QuizList("다른 산의 나쁜 돌이라도 자신의 옥돌을 가는데 소용이 됨. 남의 허물에서도 배울 것이 있다.", "타산지석"));
		quizList.add(new QuizList("이제야 처음으로 들음.", "금시초문"));
		quizList.add(new QuizList("기운이 굉장히 뻗치었다. 일이 뜻대로 되어 씩씩한 기운이 대단하게 뻗침.", "기고만장"));
		quizList.add(new QuizList("몹시 노하여 펄펄 뛰며 성을 냄.", "노발대발"));
		quizList.add(new QuizList("쓸모없는 물건이나 사람", "무용지물"));
		quizList.add(new QuizList("정도를 지나침은 미치지 못함과 같다는 뜻", "과유불급"));
		quizList.add(new QuizList("글자를 한 자도 모를 정도로 무식함", "일자무식"));
		quizList.add(new QuizList("눈 아래 사람이 없음. 곧 교만하여 다른 사람을 업신여김", "안하무인"));
		quizList.add(new QuizList("입은 있으나 말이 없다는 뜻으로 변명을 못함을 이름.", "유구무언"));
		quizList.add(new QuizList("이름만 그럴듯하고 실속은 없음.", "유명무실"));
		quizList.add(new QuizList("말을 하지 않더라도 서로 마음이 통하여 앎.", "이심전심"));
		quizList.add(new QuizList("한 사건이 그 사건에 그치지 않고 잇달아 많은 사건으로 번짐.", "일파만파"));
		quizList.add(new QuizList("지금까지 들어본 일이 없는 새로운 일을 이르는 말.", "전대미문"));
		quizList.add(new QuizList("쓴 것이 다하면 단 것이 온다는 말로, 고생 끝에 즐거움이 옴.", "고진감래"));
		quizList.add(new QuizList("대나무 말을 타고 같이 놀던 옛 친구. 어릴 때부터 같이 놀며 친하게 지내온 친구를 가리킴.", "죽마고우"));
		
		
		// 라벨 생성
		lb1 = new JLabel("문제 :");
		lb2 = new JLabel("정답 :");
		lb3 = new JLabel("결과 :");
		// 텍스트 생성
		tf1 = new JTextField();	//문제
		tf1.setEditable(false);
		tf2 = new JTextField();	//정답 기입칸
		tf3 = new JTextField();	//결과
		tf3.setEditable(false);
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
		add(tf3);
		// 버튼 추가
		add(bt1);
		add(bt2);

		// 라벨, 텍스트 크기 설정
		lb1.setBounds(7, 0, 100, 30);
		tf1.setBounds(53, 3, 510, 28);
		lb2.setBounds(7, 37, 100, 30);
		tf2.setBounds(53, 40, 80, 28);
		lb3.setBounds(157, 37, 100, 30);
		tf3.setBounds(202, 40, 220, 28);
		// 버튼 크기설정
		bt1.setBounds(570, 3, 87, 66);
		bt2.setBounds(440, 40, 123, 29);

		// 액션리스너
		bt1.addActionListener(this);
		bt2.addActionListener(this);

		// 폰트 설정
		Font font1 = new Font("맑은 고딕", Font.BOLD, 15);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 12);
		lb1.setFont(font1);
		tf1.setFont(font2);
		lb2.setFont(font1);
		tf2.setFont(font1);
		lb3.setFont(font1);
		tf3.setFont(font2);
		bt1.setFont(font2);
		bt1.setFont(font2);
		
		bt1.setBackground(new Color(230, 230, 250));
		bt2.setBackground(new Color(255, 240, 245));
		bt1.setForeground(new Color(72, 61, 139));
		bt2.setForeground(new Color(139, 105, 105));
		tf1.setForeground(new Color(54, 54, 54));
		tf2.setForeground(new Color(54, 54, 54));
		tf3.setForeground(new Color(54, 54, 54));
		lb1.setForeground(new Color(47, 79, 79));
		lb2.setForeground(new Color(47, 79, 79));
		lb3.setForeground(new Color(47, 79, 79));
		
		

		// 메인 패널을 프레임의 루트 컨텐트에 저장
		setTitle("사자성어 퀴즈");
		setSize(680, 115);
		getContentPane().setBackground(Color.WHITE); // 배경 색상 변경
		setResizable(false); // 창의 크기를 변경하지 못하게
		setLocationRelativeTo(null); // 창이 가운데 나오게
		setLayout(null);
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}

	//액션리스너
	public void actionPerformed(ActionEvent e) {
		String x = tf2.getText();
		
		if(e.getSource() == bt2) {
			Collections.shuffle(quizList);	//문제 셔플
			q = quizList.get(0).getQuestion();
			a = quizList.get(0).getAnswer();
			tf1.setText(q);
			tf3.setText("");
		}

		if (e.getSource() == bt1) {
			if (a.equals(x)) {
				System.out.println("정말 대단합니다!! 정답입니다.");
				tf3.setText("정말 대단합니다!! 정답입니다.");
				tf2.setText("");
			} else {
				System.out.println("틀렸습니다!! 정답은 [" + a + "] 입니다.");
				tf3.setText("틀렸습니다!! 정답은 [" + a + "] 입니다.");
				tf2.setText("");
			}
		}
	}


	public static void main(String[] args) {
		new QuizMain();
	}

}
