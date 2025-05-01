package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Veterinaria.DatosS;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VDatoS extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtVacunas;
	private JTextField txtEnfermedades;
	private JTextField txtDiscapacidad;
	private JButton btnNewButton;
	private JTextArea txtS;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VDatoS frame = new VDatoS();
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
	public VDatoS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N° de vacunas:");
		lblNewLabel.setBounds(10, 15, 126, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNDeEnfermedades = new JLabel("N° de enfermedades:");
		lblNDeEnfermedades.setBounds(10, 48, 126, 14);
		contentPane.add(lblNDeEnfermedades);
		
		JLabel lblDiscapacidad = new JLabel("Discapacidad");
		lblDiscapacidad.setBounds(10, 80, 126, 14);
		contentPane.add(lblDiscapacidad);
		
		txtVacunas = new JTextField();
		txtVacunas.setColumns(10);
		txtVacunas.setBounds(144, 12, 86, 20);
		contentPane.add(txtVacunas);
		
		txtEnfermedades = new JTextField();
		txtEnfermedades.setColumns(10);
		txtEnfermedades.setBounds(144, 45, 86, 20);
		contentPane.add(txtEnfermedades);
		
		txtDiscapacidad = new JTextField();
		txtDiscapacidad.setColumns(10);
		txtDiscapacidad.setBounds(144, 77, 86, 20);
		contentPane.add(txtDiscapacidad);
		
		btnNewButton = new JButton("Procesar");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(309, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 105, 414, 145);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(309, 61, 89, 23);
		contentPane.add(btnNewButton_1);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
		int numEnfermedades = Integer.parseInt(txtEnfermedades.getText());
		int numVacunas = Integer.parseInt(txtVacunas.getText());
		String discapacidad = txtDiscapacidad.getText();
		DatosS ds = new DatosS(numVacunas, numEnfermedades, discapacidad);
		txtS.setText("");
		Listado(ds);
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Error... Ingrese el valor correspondiente de cada cuadro.");
		}
	}
	public void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	public void Listado(DatosS d) {
		Imprimir("Números de Vacunas: "+d.getNumVacunas());
		Imprimir("Número de enfermedades: "+d.getNumEnfermedades());
		Imprimir("Discapacidad: "+d.getDiscapacidad());
	}
	
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		txtVacunas.setText("");
		txtEnfermedades.setText("");
		txtDiscapacidad.setText("");
		txtS.setText("");
	}
	}
