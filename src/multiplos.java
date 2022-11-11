import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class multiplos extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField div1;
	private JTextField div2;
	private JLabel resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					multiplos frame = new multiplos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public multiplos() {
		setType(Type.UTILITY);
		setResizable(false);
		setTitle("Múltiplos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Escriba un número:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(26, 38, 147, 14);
		contentPane.add(lblNewLabel);

		num1 = new JTextField();
		num1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		num1.setBounds(176, 35, 86, 20);
		contentPane.add(num1);
		num1.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Divisor 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(26, 78, 126, 20);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Divisor 2");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(26, 118, 126, 14);
		contentPane.add(lblNewLabel_1_1);

		div1 = new JTextField();
		div1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		div1.setColumns(10);
		div1.setBounds(176, 78, 86, 20);
		contentPane.add(div1);

		div2 = new JTextField();
		div2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		div2.setColumns(10);
		div2.setBounds(176, 115, 86, 20);
		contentPane.add(div2);

		JLabel resultado = new JLabel("");
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		resultado.setBounds(26, 170, 275, 14);
		contentPane.add(resultado);

		JButton btnNewButton = new JButton("CALCULAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final String MULT1 = " es múltiplo de ";
				final String MULT2 = " y de ";
				final String ERROR = "Ninguno de los dos es multiplo";
				int n1 = Integer.parseInt(num1.getText());
				int d1 = Integer.parseInt(div1.getText());
				int d2 = Integer.parseInt(div2.getText());
				String mensaje;

				if (n1 % d1 == 0) {
					mensaje = n1 + MULT1 + d1;
					if (n1 % d2 == 0) {
						mensaje += MULT2 + d2;
					}

				} else {
					if (n1 % d2 == 0) {
						mensaje = n1 + MULT1 + d2;
					} else {
						mensaje = ERROR;
					}

				}
				resultado.setText(mensaje);

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(120, 212, 112, 40);
		contentPane.add(btnNewButton);
	}

}
