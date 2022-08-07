package TA21_Calculator.TA21_Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;
import java.awt.Font;

public class Window extends JFrame {

	private JPanel contentPane;

	private DecimalFormat numberFormat = new DecimalFormat("#.000");

	/**
	 * Panel de aplicacion
	 */
	public Window() {
		// Titulo de la ventana
		setTitle("Calculadora Estándar");

		// Coordenadas etc
		setBounds(400, 200, 560, 500);

		// Cerrar tambien el programa
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Hacer visible la ventana
		setVisible(true);

		// Inicializamos el panel
		contentPane = new JPanel();

		// Indicamos diseno
		contentPane.setLayout(null);

		// Asignar panel de la ventana
		setContentPane(contentPane);

		standardCalculator();
	}

	private void standardCalculator() {

		/* Boton sumar */
		JButton buttonPlus = new JButton("+");
		buttonPlus.setBounds(245, 322, 66, 56);
		contentPane.add(buttonPlus);
		// Creamos un listener para el boton sumar
		ActionListener plusButtonActLis = new ActionListener() {
			public void actionPerformed(ActionEvent plusEvent) {

				try {

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERROR! No rellenaste los operandos.");
					System.out.println(e.getMessage());
				}
			}
		};
		buttonPlus.addActionListener(plusButtonActLis);

		/* Boton resta */
		JButton buttonMinus = new JButton("-");
		buttonMinus.setBounds(245, 268, 66, 56);
		contentPane.add(buttonMinus);
		// Creamos un listener para el boton restar
		ActionListener minusButtonActLis = new ActionListener() {
			public void actionPerformed(ActionEvent minusEvent) {

				try {

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERROR! No rellenaste los operandos.");
					System.out.println(e.getMessage());
				}
			}
		};
		buttonMinus.addActionListener(minusButtonActLis);

		/* Boton multiplicar */
		JButton buttonProduct = new JButton("x");
		buttonProduct.setBounds(245, 213, 66, 56);
		contentPane.add(buttonProduct);
		// Creamos un listener para el boton multiplicar
		ActionListener productButtonActLis = new ActionListener() {
			public void actionPerformed(ActionEvent productEvent) {

				try {

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERROR! No rellenaste los operandos.");
					System.out.println(e.getMessage());
				}
			}
		};
		buttonProduct.addActionListener(productButtonActLis);

		/* Boton dividir */
		JButton buttonDivision = new JButton("/");
		buttonDivision.setBounds(245, 157, 66, 56);
		contentPane.add(buttonDivision);
		// Creamos un listener para el boton dividir
		ActionListener divideButtonActLis = new ActionListener() {
			public void actionPerformed(ActionEvent divideEvent) {

				try {

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERROR! No rellenaste los operandos.");
					System.out.println(e.getMessage());
				}
			}
		};
		buttonDivision.addActionListener(divideButtonActLis);

		/* Boton salir */
		JButton buttonExit = new JButton("Salir");
		buttonExit.setBounds(420, 414, 89, 23);
		contentPane.add(buttonExit);
		// Creamos un listener para el boton salir
		ActionListener exitButtonActLis = new ActionListener() {
			public void actionPerformed(ActionEvent exitEvent) {
				JOptionPane.showMessageDialog(null, "Gracias por su asistencia!");
				System.exit(0);
			}
		};
		buttonExit.addActionListener(exitButtonActLis);

		/* Boton about */
		JButton buttonAbout = new JButton("About");
		buttonAbout.setBounds(321, 414, 89, 23);
		contentPane.add(buttonAbout);
		// Creamos un listener para el boton about
		ActionListener aboutButtonActLis = new ActionListener() {
			public void actionPerformed(ActionEvent aboutEvent) {
				JOptionPane.showMessageDialog(null, "Hecho por Team 1.");
			}
		};
		buttonAbout.addActionListener(aboutButtonActLis);

		/* Boton porcentaje */
		JButton buttonPercentage = new JButton("%");
		buttonPercentage.setBounds(49, 102, 66, 56);
		contentPane.add(buttonPercentage);

		/* Boton CE */
		JButton buttonCE = new JButton("CE");
		buttonCE.setBounds(114, 102, 66, 56);
		contentPane.add(buttonCE);

		/* Boton C */
		JButton buttonC = new JButton("C");
		buttonC.setBounds(180, 102, 66, 56);
		contentPane.add(buttonC);

		/* Boton 1/x */
		JButton button1onX = new JButton("1/x");
		button1onX.setBounds(49, 157, 66, 56);
		contentPane.add(button1onX);

		/* Boton delete */
		JButton buttonDelete = new JButton("<--");
		buttonDelete.setBounds(245, 102, 66, 56);
		contentPane.add(buttonDelete);
		
		JButton buttonXPower2 = new JButton("x^2");
		buttonXPower2.setBounds(114, 157, 66, 56);
		contentPane.add(buttonXPower2);
		
		JButton buttonSqrt2 = new JButton("sqrt2");
		buttonSqrt2.setBounds(180, 157, 66, 56);
		contentPane.add(buttonSqrt2);
		
		JButton buttonEqual = new JButton("=");
		buttonEqual.setBounds(245, 375, 66, 56);
		contentPane.add(buttonEqual);
		
		JButton button7 = new JButton("7");
		button7.setBounds(49, 213, 66, 56);
		contentPane.add(button7);
		
		JButton button8 = new JButton("8");
		button8.setBounds(114, 213, 66, 56);
		contentPane.add(button8);
		
		JButton button9 = new JButton("9");
		button9.setBounds(180, 213, 66, 56);
		contentPane.add(button9);
		
		JButton button4 = new JButton("4");
		button4.setBounds(49, 268, 66, 56);
		contentPane.add(button4);
		
		JButton button5 = new JButton("5");
		button5.setBounds(114, 268, 66, 56);
		contentPane.add(button5);
		
		JButton button6 = new JButton("6");
		button6.setBounds(180, 268, 66, 56);
		contentPane.add(button6);
		
		JButton button1 = new JButton("1");
		button1.setBounds(49, 321, 66, 56);
		contentPane.add(button1);
		
		JButton button2 = new JButton("2");
		button2.setBounds(114, 321, 66, 56);
		contentPane.add(button2);
		
		JButton button3 = new JButton("3");
		button3.setBounds(180, 321, 66, 56);
		contentPane.add(button3);
		
		JButton buttonPlusMinus = new JButton("+/-");
		buttonPlusMinus.setBounds(49, 375, 66, 56);
		contentPane.add(buttonPlusMinus);
		
		JButton button0 = new JButton("0");
		button0.setBounds(114, 375, 66, 56);
		contentPane.add(button0);
		
		JButton buttonComma = new JButton(",");
		buttonComma.setBounds(180, 375, 66, 56);
		contentPane.add(buttonComma);
		
		JLabel labelResult = new JLabel("0");
		labelResult.setFont(new Font("Arial Black", Font.PLAIN, 30));
		labelResult.setBounds(49, 46, 117, 45);
		contentPane.add(labelResult);	
	}
}