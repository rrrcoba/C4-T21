package TA21.Calculator.dto;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame {
	
	private JPanel contentPane;
	private JTextField textResult;
	private JButton btn_result;
	private JButton btnPoint;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btnSum;
	private JButton btn_0;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btnMinus;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btnMultiply;
	private JButton btnDivide;
	private JButton btnX;
	private JButton btnDelete;
	private JButton btnC;
	private JButton btnCe;
	private JButton btnPercent;
	private JButton btnSqrt;
	private JButton btnElevated;
	private JTextField textField;
	/**
	 * Constructor ventana en blanco que llama a los otros elementos
	 */
	public Dashboard() {

		// Titulo de la ventana
				setTitle("Calculadora");

				// Coordenadas etc
				setBounds(400, 200, 799, 584);

				// Cerrar tambien el programa
				setDefaultCloseOperation(EXIT_ON_CLOSE);

				// Hacer visible la ventana
				setVisible(true);

				// Inicializamos el panel
				contentPane = new JPanel();

				// Asignar panel de la ventana
				setContentPane(contentPane);
				
				textResult = new JTextField();
				textResult.setFont(new Font("Arial Black", Font.PLAIN, 22));
				textResult.setColumns(10);
				
				JButton btnMoreLess = new JButton("+/-");
				btnMoreLess.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btn_result = new JButton("=");
				btn_result.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btnPoint = new JButton(",");
				btnPoint.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btn_1 = new JButton("1");
				btn_1.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btn_2 = new JButton("2");
				btn_2.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btn_3 = new JButton("3");
				btn_3.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btnSum = new JButton("+");
				btnSum.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btn_0 = new JButton("0");
				btn_0.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btn_4 = new JButton("4");
				btn_4.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btn_5 = new JButton("5");
				btn_5.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btn_6 = new JButton("6");
				btn_6.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btnMinus = new JButton("-");
				btnMinus.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btn_7 = new JButton("7");
				btn_7.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btn_8 = new JButton("8");
				btn_8.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btn_9 = new JButton("9");
				btn_9.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btnMultiply = new JButton("x");
				btnMultiply.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btnDivide = new JButton("/");
				btnDivide.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btnX = new JButton("1/x");
				btnX.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btnDelete = new JButton("Del");
				btnDelete.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btnC = new JButton("C");
				btnC.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btnCe = new JButton("CE");
				btnCe.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btnPercent = new JButton("%");
				btnPercent.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btnSqrt = new JButton("");
				btnSqrt.setIcon(new ImageIcon(Dashboard.class.getResource("/icons/1.png")));
				btnSqrt.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnSqrt.setForeground(Color.WHITE);
				btnSqrt.setBackground(Color.WHITE);
				btnSqrt.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				btnElevated = new JButton("x2");
				btnElevated.setFont(new Font("Arial Black", Font.PLAIN, 22));
				
				textField = new JTextField();
				textField.setFont(new Font("Arial Black", Font.PLAIN, 16));
				textField.setColumns(10);
				
				JLabel lblHistory = new JLabel("Historial");
				lblHistory.setFont(new Font("Arial Black", Font.PLAIN, 18));
				
				GroupLayout gl_contentPane = new GroupLayout(contentPane);
				gl_contentPane.setHorizontalGroup(
					gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(12)
										.addComponent(btnMoreLess, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btn_0, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(btnPoint, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(btn_result, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addContainerGap()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(textResult)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(btn_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btn_2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(btn_3, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(btnSum, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(btn_4, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btn_5, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btn_6, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnMinus, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(btn_7, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btn_8, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(btn_9, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(btnCe, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnPercent, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnSqrt, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnElevated, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnDivide, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnMultiply, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnX, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblHistory, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
									.addGap(187))
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)))
				);
				gl_contentPane.setVerticalGroup(
					gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(textResult, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(40)
									.addComponent(lblHistory, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnX, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnPercent, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnSqrt, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnElevated, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnDivide, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnCe, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
											.addComponent(btn_7, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
											.addComponent(btn_9, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
											.addComponent(btn_8, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
										.addComponent(btnMultiply, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btn_4, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addComponent(btn_5, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addComponent(btn_6, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnMinus, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btn_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addComponent(btn_2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
											.addComponent(btn_3, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
											.addComponent(btnSum, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnMoreLess, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
											.addComponent(btnPoint, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
											.addComponent(btn_result, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
										.addComponent(btn_0, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))))
							.addContainerGap())
				);
				contentPane.setLayout(gl_contentPane);
				



	}
}
