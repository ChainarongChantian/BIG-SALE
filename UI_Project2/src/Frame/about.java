package Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class about extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public about() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				int res = JOptionPane.showConfirmDialog(about.this, "Are you sure to closing window?", "Confirm closing", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(res == JOptionPane.YES_OPTION) {
					dispose();
				}
				else
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			}
		});
		setTitle("BIG SALE - About");
		Toolkit kit = Toolkit.getDefaultToolkit();
	    Image icons = kit.createImage("D:\\eclipse JAVA\\workspaceJAVA\\UI_Project2\\src\\Frame\\ICON.png");
	    setIconImage(icons);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 547, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(0, 11, 546, 146);
		contentPane.add(panel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Easy_IT\\Desktop\\\u0E42\u0E25\u0E42\u0E01\u0E49\u0E2A\u0E35\u0E02\u0E32\u0E273.png"));
		label.setBounds(174, 27, 107, 95);
		panel.add(label);
		
		JLabel label_1 = new JLabel("BIG SALE");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Trajan Pro", Font.BOLD, 26));
		label_1.setBounds(277, 44, 136, 56);
		panel.add(label_1);
		
		JLabel lblShopFinFun = new JLabel("Shop, fin, fun");
		lblShopFinFun.setForeground(Color.WHITE);
		lblShopFinFun.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 17));
		lblShopFinFun.setBounds(277, 88, 136, 26);
		panel.add(lblShopFinFun);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 156, 533, 383);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("Separator.background"));
		panel_2.setBounds(22, 22, 487, 335);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblBigSale = new JLabel("\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21 BIG SALE");
		lblBigSale.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBigSale.setBounds(166, 30, 186, 32);
		panel_2.add(lblBigSale);
		
		JLabel label_2 = new JLabel("\u0E40\u0E27\u0E2D\u0E23\u0E4C\u0E0A\u0E31\u0E48\u0E19 1.0.0.2");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_2.setBounds(205, 61, 102, 25);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21 \u0E1F\u0E23\u0E35");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_3.setBounds(62, 97, 102, 25);
		panel_2.add(label_3);
		
		JLabel lblBig = new JLabel("\u0E23\u0E32\u0E22\u0E25\u0E30\u0E40\u0E2D\u0E35\u0E22\u0E14 \u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21 BIG SALE");
		lblBig.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBig.setBounds(62, 143, 233, 25);
		panel_2.add(lblBig);
		
		JLabel label_4 = new JLabel("\u0E40\u0E1B\u0E47\u0E19\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E02\u0E32\u0E22\u0E2A\u0E34\u0E19\u0E04\u0E49\u0E32");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_4.setBounds(62, 189, 175, 25);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("\u0E1B\u0E23\u0E30\u0E40\u0E17\u0E28\u0E44\u0E17\u0E22");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		label_5.setBounds(62, 235, 94, 25);
		panel_2.add(label_5);
		
		JLabel lblBuu = new JLabel("\u0E1C\u0E25\u0E34\u0E15\u0E42\u0E14\u0E22 \u0E1A\u0E23\u0E34\u0E29\u0E31\u0E17 Buu Wifi by AIS");
		lblBuu.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBuu.setBounds(62, 282, 233, 25);
		panel_2.add(lblBuu);
	}
}
