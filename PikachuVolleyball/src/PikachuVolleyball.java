
public class PikachuVolleyball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		import javax.swing.*;
		import java.awt.*;
		import java.awt.event.*;

		public class PikachuVolleyball extends JPanel implements ActionListener, KeyListener {

		    // 화면 크기
		    final int WIDTH = 800;
		    final int HEIGHT = 400;

		    // 타이머
		    Timer timer;

		    // 공
		    int ballX = 400, ballY = 100;
		    int ballVX = 4, ballVY = 0;
		    final int BALL_SIZE = 20;

		    // 중력
		    final int GRAVITY = 1;

		    // 플레이어
		    Rectangle p1 = new Rectangle(150, 300, 40, 60);
		    Rectangle p2 = new Rectangle(610, 300, 40, 60);

		    int p1YSpeed = 0;
		    int p2YSpeed = 0;

		    boolean a, d, w, left, right, up;

		    public PikachuVolleyball() {
		        JFrame frame = new JFrame("피카츄 배구 (Java)");
		        frame.setSize(WIDTH, HEIGHT);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.add(this);
		        frame.addKeyListener(this);
		        frame.setResizable(false);
		        frame.setVisible(true);

		        timer = new Timer(16, this);
		        timer.start();
		    }

		    @Override
		    public void paintComponent(Graphics g) {
		        super.paintComponent(g);

		        // 배경
		        g.setColor(Color.CYAN);
		        g.fillRect(0, 0, WIDTH, HEIGHT);

		        // 바닥
		        g.setColor(Color.GREEN);
		        g.fillRect(0, 360, WIDTH, 40);

		        // 네트
		        g.setColor(Color.WHITE);
		        g.fillRect(390, 250, 20, 110);

		        // 공
		        g.setColor(Color.YELLOW);
		        g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);

		        // 플레이어
		        g.setColor(Color.ORANGE);
		        g.fillRect(p1.x, p1.y, p1.width, p1.height);

		        g.setColor(Color.RED);
		        g.fillRect(p2.x, p2.y, p2.width, p2.height);
		    }

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // 공 이동
		        ballX += ballVX;
		        ballY += ballVY;
		        ballVY += GRAVITY;

		        // 벽 충돌
		        if (ballX <= 0 || ballX >= WIDTH - BALL_SIZE)
		            ballVX *= -1;

		        // 바닥
		        if (ballY >= 340) {
		            ballY = 340;
		            ballVY *= -1;
		        }

		        // 플레이어 이동
		        if (a) p1.x -= 5;
		        if (d) p1.x += 5;
		        if (left) p2.x -= 5;
		        if (right) p2.x += 5;

		        // 점프
		        p1.y += p1YSpeed;
		        p2.y += p2YSpeed;
		        p1YSpeed += GRAVITY;
		        p2YSpeed += GRAVITY;

		        if (p1.y >= 300) { p1.y = 300; p1YSpeed = 0; }
		        if (p2.y >= 300) { p2.y = 300; p2YSpeed = 0; }

		        // 충돌
		        Rectangle ball = new Rectangle(ballX, ballY, BALL_SIZE, BALL_SIZE);
		        if (ball.intersects(p1) || ball.intersects(p2)) {
		            ballVY = -12;
		        }

		        repaint();
		    }

		    @Override
		    public void keyPressed(KeyEvent e) {
		        switch (e.getKeyCode()) {
		            case KeyEvent.VK_A -> a = true;
		            case KeyEvent.VK_D -> d = true;
		            case KeyEvent.VK_W -> { if (p1.y == 300) p1YSpeed = -15; }
		            case KeyEvent.VK_LEFT -> left = true;
		            case KeyEvent.VK_RIGHT -> right = true;
		            case KeyEvent.VK_UP -> { if (p2.y == 300) p2YSpeed = -15; }
		        }
		    }

		    @Override
		    public void keyReleased(KeyEvent e) {
		        switch (e.getKeyCode()) {
		            case KeyEvent.VK_A -> a = false;
		            case KeyEvent.VK_D -> d = false;
		            case KeyEvent.VK_LEFT -> left = false;
		            case KeyEvent.VK_RIGHT -> right = false;
		        }
		    }

		    @Override
		    public void keyTyped(KeyEvent e) {}

		    public static void main(String[] args) {
		        new PikachuVolleyball();
		    }
		}

	}

}
