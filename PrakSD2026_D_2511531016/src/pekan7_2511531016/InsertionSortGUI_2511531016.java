package pekan7_2511531016;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class InsertionSortGUI_2511531016 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane_1016;
	private int[] array_1016;
	private JLabel[] labelArray_1016;
	private JButton stepButton_1016, resetButton_1016, setButton_1016;
	private JTextField inputField_1016;
	private JPanel panelArray_1016;
	private JTextArea stepArea_1016;
	
	private int i_1016 = 1, j_1016;
	private boolean sorting_1016 = false;
	private int stepCount_1016 = 1;
	
	/**
	 * Create the frame.
	 */
	public InsertionSortGUI_2511531016() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane_1016 = new JPanel();
		contentPane_1016.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_1016);
		
		setTitle("Insertion Sort Langkah per Langkah");
	    setSize(750, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    setLayout(new BorderLayout());

	    // Panel input
	    JPanel inputPanel_1016 = new JPanel(new FlowLayout());
	    inputField_1016 = new JTextField(30);
	    setButton_1016 = new JButton("Set Array");
	    inputPanel_1016.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
	    inputPanel_1016.add(inputField_1016);
	    inputPanel_1016.add(setButton_1016);

	    // Panel array visual
	    panelArray_1016 = new JPanel();
	    panelArray_1016.setLayout(new FlowLayout());

	    // Panel kontrol
	    JPanel controlPanel_1016 = new JPanel();
	    stepButton_1016 = new JButton("Langkah Selanjutnya");
	    resetButton_1016 = new JButton("Reset");
	    stepButton_1016.setEnabled(false);
	    controlPanel_1016.add(stepButton_1016);
	    controlPanel_1016.add(resetButton_1016);
	    
	    // Area teks untuk log langkah-langkah
	    stepArea_1016 = new JTextArea(8, 60);
	    stepArea_1016.setEditable(false);
	    stepArea_1016.setFont(new Font("Monospaced", Font.PLAIN, 14));
	    JScrollPane scrollPane_1016 = new JScrollPane(stepArea_1016);

	    // Tambahkan panel ke frame
	    add(inputPanel_1016, BorderLayout.NORTH);
	    add(panelArray_1016, BorderLayout.CENTER);
	    add(controlPanel_1016, BorderLayout.SOUTH);
	    add(scrollPane_1016, BorderLayout.EAST);

	    // Event Set Array
	    setButton_1016.addActionListener(e -> setArrayFromInput_1016());

	    // Event Langkah Selanjutnya
	    stepButton_1016.addActionListener(e -> performStep_1016());

	    // Event Reset
	    resetButton_1016.addActionListener(e -> reset_1016());
	}
	
	private void setArrayFromInput_1016() {
	    String text_1016 = inputField_1016.getText().trim();
	    if (text_1016.isEmpty()) return;
	    String[] parts_1016 = text_1016.split(",");
	    array_1016 = new int[parts_1016.length];
	    try {
	        for (int k_1016 = 0; k_1016 < parts_1016.length; k_1016++) {
	            array_1016[k_1016] = Integer.parseInt(parts_1016[k_1016].trim());
	        }
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan " + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }
	    i_1016 = 1;
	    sorting_1016 = true;
	    stepButton_1016.setEnabled(true);
	    stepArea_1016.setText("");
	    panelArray_1016.removeAll();
	    labelArray_1016 = new JLabel[array_1016.length];
	    for (int k_1016 = 0; k_1016 < array_1016.length; k_1016++) {
	        labelArray_1016[k_1016] = new JLabel(String.valueOf(array_1016[k_1016]));
	        labelArray_1016[k_1016].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_1016[k_1016].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_1016[k_1016].setPreferredSize(new Dimension(50, 50));
	        labelArray_1016[k_1016].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_1016.add(labelArray_1016[k_1016]);
	    }
	    panelArray_1016.revalidate();
	    panelArray_1016.repaint();
	}
	
	private void performStep_1016() {
	    if (i_1016 < array_1016.length && sorting_1016) {
	        int key_1016 = array_1016[i_1016];
	        j_1016 = i_1016 - 1;
	        StringBuilder stepLog_1016 = new StringBuilder();
	        stepLog_1016.append("Langkah ").append(stepCount_1016).
	                append(": Memasukkan ").append(key_1016).append("\n");
	        while (j_1016 >= 0 && array_1016[j_1016] > key_1016) {
	            array_1016[j_1016 + 1] = array_1016[j_1016];
	            j_1016--;
	        }
	        array_1016[j_1016 + 1] = key_1016;
	        updateLabels_1016();
	        stepLog_1016.append("Hasil: ").append(arrayToString_1016(array_1016)).append("\n\n");
	        stepArea_1016.append(stepLog_1016.toString());
	        i_1016++;
	        stepCount_1016++;
	        if (i_1016 == array_1016.length) {
	            sorting_1016 = false;
	            stepButton_1016.setEnabled(false);
	            JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        }
	    }
	}

	private void updateLabels_1016() {
	    for (int k_1016 = 0; k_1016 < array_1016.length; k_1016++) {
	        labelArray_1016[k_1016].setText(String.valueOf(array_1016[k_1016]));
	    }
	}

	private void reset_1016() {
	    inputField_1016.setText("");
	    panelArray_1016.removeAll();
	    panelArray_1016.revalidate();
	    panelArray_1016.repaint();
	    stepArea_1016.setText("");
	    stepButton_1016.setEnabled(false);
	    sorting_1016 = false;
	    i_1016 = 1;
	    stepCount_1016 = 1;
	}

	private String arrayToString_1016(int[] arr_1016) {
	    StringBuilder sb_1016 = new StringBuilder();
	    for (int k_1016 = 0; k_1016 < arr_1016.length; k_1016++) {
	        sb_1016.append(arr_1016[k_1016]);
	        if (k_1016 < arr_1016.length - 1) sb_1016.append(", ");
	    }
	    return sb_1016.toString();
	}

	public static void main(String[] args) {
	    SwingUtilities.invokeLater(() -> {
	        InsertionSortGUI_2511531016 gui_1016 = new InsertionSortGUI_2511531016();
	        gui_1016.setVisible(true);
	    });
	}	
}