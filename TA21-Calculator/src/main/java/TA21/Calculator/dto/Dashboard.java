package TA21.Calculator.dto;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;

	private Operations operations = new Operations();

	private String num1;
	private String num2;
	private JButton operator;

	private JPanel contentPane;

	private JTextField textFieldResult;
	private JTextField textFieldHist;

	private JButton btnPoint;
	private JButton btn_0;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;

	private JButton btn_result;
	private JButton btnDelete;
	private JButton btnC;
	private JButton btnCe;

	private JButton btnSum;
	private JButton btnMinus;
	private JButton btnMultiply;
	private JButton btnDivide;
	private JButton btnX;
	private JButton btnPercent;
	private JButton btnSqrt;
	private JButton btnElevated;
	private JButton btnMoreLess;

	private JLabel lblHistory;

	private GroupLayout gl_contentPane;

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

		calculatorElements();

	}

	/**
	 * Inserta en el JFrame todos los elementos de la calculadora
	 */
	private void calculatorElements() {

		btnPoint = new JButton(",");
		btnPoint.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textFieldResult.getText();
				String buttonText = ".";
				textFieldResult.setText(text + buttonText);
			}
		});

		btn_0 = new JButton("0");
		btn_0.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textFieldResult.getText();
				String buttonText = btn_0.getText();
				textFieldResult.setText(text + buttonText);
			}
		});

		btn_1 = new JButton("1");
		btn_1.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textFieldResult.getText();
				String buttonText = btn_1.getText();
				textFieldResult.setText(text + buttonText);
			}
		});

		btn_2 = new JButton("2");
		btn_2.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textFieldResult.getText();
				String buttonText = btn_2.getText();
				textFieldResult.setText(text + buttonText);
			}
		});

		btn_3 = new JButton("3");
		btn_3.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textFieldResult.getText();
				String buttonText = btn_3.getText();
				textFieldResult.setText(text + buttonText);
			}
		});

		btn_4 = new JButton("4");
		btn_4.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textFieldResult.getText();
				String buttonText = btn_4.getText();
				textFieldResult.setText(text + buttonText);
			}
		});

		btn_5 = new JButton("5");
		btn_5.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textFieldResult.getText();
				String buttonText = btn_5.getText();
				textFieldResult.setText(text + buttonText);
			}
		});

		btn_6 = new JButton("6");
		btn_6.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textFieldResult.getText();
				String buttonText = btn_6.getText();
				textFieldResult.setText(text + buttonText);
			}
		});

		btn_7 = new JButton("7");
		btn_7.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textFieldResult.getText();
				String buttonText = btn_7.getText();
				textFieldResult.setText(text + buttonText);
			}
		});

		btn_8 = new JButton("8");
		btn_8.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textFieldResult.getText();
				String buttonText = btn_8.getText();
				textFieldResult.setText(text + buttonText);
			}
		});

		btn_9 = new JButton("9");
		btn_9.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textFieldResult.getText();
				String buttonText = btn_9.getText();
				textFieldResult.setText(text + buttonText);
			}
		});

		textFieldResult = new JTextField();
		textFieldResult.setFont(new Font("Arial Black", Font.PLAIN, 22));
		textFieldResult.setColumns(10);

		// TODO
		btn_result = new JButton("=");
		btn_result.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btn_result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = textFieldResult.getText();

				// Suma
				if (operator == btnSum) {
					if (num1.compareTo("") == 0) {
						num1 = "0";
					}
					if (num2.compareTo("") == 0) {
						num2 = "0";
					}
					Double result = operations.plus(num1, num2);
					String r = String.valueOf(result);
					textFieldResult.setText(r);
					addHist(r);
				}

				if(operator == btnMinus) {
					if (num1.compareTo("") == 0) {
						num1 = "0";
					}
					if (num2.compareTo("") == 0) {
						num2 = "0";
					}
					Double result = operations.minus(num1, num2);
					String r = String.valueOf(result);
					textFieldResult.setText(r);
					addHist(r);
				}

				if(operator == btnMultiply) {
					if (num1.compareTo("") == 0) {
						num1 = "0";
					}
					if (num2.compareTo("") == 0) {
						num2 = "0";
					}
					Double result = operations.multiply(num1, num2);
					String r = String.valueOf(result);
					textFieldResult.setText(r);
					addHist(r);
				}

				if(operator == btnX) {
					if (num2.compareTo("") == 0) {
						num2 = "0";
					}
					Double result = operations.oneDivide(num2);
					String r = String.valueOf(result);
					textFieldResult.setText(r);
					addHist(r);
				}
				if(operator == btnPercent) {
					if (num1.compareTo("") == 0) {
						num1 = "0";
					}
					if (num2.compareTo("") == 0) {
						num2 = "0";
					}
					Double result = operations.percent(num1, num2);
					String r = String.valueOf(result);
					textFieldResult.setText(r);
					addHist(r);
				}
				
			}
		});

		btnDelete = new JButton("Del");
		btnDelete.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Saca el texto del textField y le quita el último caracter de la cadena
				// utilizando StringBuffer y "deleteCharAt" .
				// Por último añade otra vez el resultado al textField en formato String.
				try {
					String text = textFieldResult.getText();
					StringBuffer sb = new StringBuffer(text);
					sb.deleteCharAt(sb.length() - 1);
					textFieldResult.setText(sb.toString());
				} catch (StringIndexOutOfBoundsException ex) {
					System.out.println("No hay más carácteres por eliminar.");
				}
			}
		});

		btnC = new JButton("C");
		btnC.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Pone el textField, los operandos y el operador en blanco
				textFieldResult.setText("");
				num1 = "";
				num2 = "";
				operator = null;
			}
		});

		btnCe = new JButton("CE");
		btnCe.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Pone el textField, los operandos, el operador y el historial en blanco
				textFieldResult.setText("");
				num1 = "";
				num2 = "";
				operator = null;
				textFieldHist.setText("");
			}
		});

		btnSum = new JButton("+");
		btnSum.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = textFieldResult.getText();
				textFieldResult.setText("");
				operator = btnSum;

			}
		});

		btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = textFieldResult.getText();
				textFieldResult.setText("");
				operator = btnMinus;

			}
		});

		btnMultiply = new JButton("x");
		btnMultiply.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = textFieldResult.getText();
				textFieldResult.setText("");
				operator = btnMultiply;

			}
		});

		btnDivide = new JButton("/");
		btnDivide.setFont(new Font("Arial Black", Font.PLAIN, 22));

		btnX = new JButton("1/x");
		btnX.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = textFieldResult.getText();			
				operator = btnX;
			}
		});


		btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Arial Black", Font.PLAIN, 22));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = textFieldResult.getText();
				textFieldResult.setText("");		
				operator = btnPercent;
			}
		});


		btnSqrt = new JButton("sqrt");
		btnSqrt.setFont(new Font("Arial Black", Font.PLAIN, 22));

		btnMoreLess = new JButton("+/-");
		btnMoreLess.setFont(new Font("Arial Black", Font.PLAIN, 22));

		btnElevated = new JButton("x2");
		btnElevated.setFont(new Font("Arial Black", Font.PLAIN, 22));

		textFieldHist = new JTextField();
		textFieldHist.setFont(new Font("Arial Black", Font.PLAIN, 16));
		textFieldHist.setColumns(10);

		lblHistory = new JLabel("Historial");
		lblHistory.setFont(new Font("Arial Black", Font.PLAIN, 18));

		initGroupLayout();
	}

	/**
	 * Añade otro resultado al historial
	 * 
	 * @param text
	 */
	public void addHist(String text) {
		String hist = textFieldHist.getText();
		textFieldHist.setText(hist + "\n" + text);
	}

	/**
	 * Inicializa el layout muy correctamente.
	 */
	private void initGroupLayout() {
		gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(btn_7, GroupLayout.PREFERRED_SIZE, 108,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btn_8, GroupLayout.PREFERRED_SIZE, 108,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btn_9,
														GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(btnCe, GroupLayout.PREFERRED_SIZE, 108,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 108,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnDelete,
														GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
								.addGroup(
										gl_contentPane.createSequentialGroup()
										.addComponent(btnPercent, GroupLayout.PREFERRED_SIZE, 108,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnSqrt, GroupLayout.PREFERRED_SIZE, 108,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnElevated,
												GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnDivide, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnMultiply, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnX, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup().addGap(12)
												.addComponent(btnMoreLess, GroupLayout.PREFERRED_SIZE, 106,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btn_0, GroupLayout.PREFERRED_SIZE, 108,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(btnPoint, GroupLayout.PREFERRED_SIZE, 108,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btn_result,
														GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
										.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(textFieldResult)
														.addGroup(gl_contentPane.createSequentialGroup()
																.addComponent(btn_1, GroupLayout.PREFERRED_SIZE, 108,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(btn_2, GroupLayout.PREFERRED_SIZE, 108,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(btn_3, GroupLayout.PREFERRED_SIZE, 108,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(btnSum, GroupLayout.DEFAULT_SIZE, 104,
																		Short.MAX_VALUE)))))
								.addGroup(Alignment.LEADING,
										gl_contentPane.createSequentialGroup().addContainerGap()
										.addComponent(btn_4, GroupLayout.PREFERRED_SIZE, 108,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btn_5, GroupLayout.PREFERRED_SIZE, 108,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(btn_6, GroupLayout.PREFERRED_SIZE, 108,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnMinus,
												GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))))
				.addGap(18).addGroup(
						gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblHistory, GroupLayout.PREFERRED_SIZE, 112,
										GroupLayout.PREFERRED_SIZE)
								.addGap(187))
						.addComponent(textFieldHist, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane
								.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(
										textFieldResult, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
								.addGroup(gl_contentPane
										.createSequentialGroup().addGap(40)
										.addComponent(lblHistory, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(textFieldHist, GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
										.createParallelGroup(Alignment.LEADING)
										.addComponent(btnX, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnPercent, GroupLayout.PREFERRED_SIZE, 66,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnSqrt, GroupLayout.PREFERRED_SIZE, 66,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnElevated, GroupLayout.PREFERRED_SIZE, 66,
												GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnDivide, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(
														btnCe, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(btn_7, GroupLayout.PREFERRED_SIZE, 66,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(btn_9, GroupLayout.PREFERRED_SIZE, 66,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(btn_8, GroupLayout.PREFERRED_SIZE, 66,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(
														btnMultiply, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btn_4, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(btn_5, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(btn_6, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(btnMinus, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btn_1, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(btn_2, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(btn_3, GroupLayout.PREFERRED_SIZE, 66,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(btnSum, GroupLayout.PREFERRED_SIZE, 66,
																GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(btnMoreLess, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(btnPoint, GroupLayout.PREFERRED_SIZE, 66,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(btn_result, GroupLayout.PREFERRED_SIZE, 66,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(btn_0, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE))))
						.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}
}
