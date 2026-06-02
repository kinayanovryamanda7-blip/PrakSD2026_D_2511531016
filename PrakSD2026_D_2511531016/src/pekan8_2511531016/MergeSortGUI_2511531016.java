package pekan8_2511531016;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font; 
import java.util.Queue;
import java.util.LinkedList;

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

public class MergeSortGUI_2511531016 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane_1016;
	private int[] array_1016;
	private JLabel[] labelArray_1016;
	private JButton stepButton_1016, resetButton_1016, setButton_1016;
	private JTextField inputField_1016;
	private JPanel panelArray_1016;
	private JTextArea stepArea_1016;
	
	private boolean sorting_1016 = false;
	private boolean copying_1016 = false;
	private boolean isMerging_1016 = false;
	
	private int stepCount_1016 = 1;
	private java.util.Queue<int[]> mergeQueue_1016 = new java.util.LinkedList<>();
	private int left_1016, mid_1016, right_1016;
	private int[] temp_1016;
	private int i_1016, j_1016, k_1016;

	/**
	 * Create the frame.
	 */
	public MergeSortGUI_2511531016() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane_1016 = new JPanel();
		contentPane_1016.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_1016);
		
		setTitle("Merge Sort Langkah per Langkah");
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
	    String text = inputField_1016.getText().trim();
	    if (text.isEmpty()) return;
	    String[] parts = text.split(",");
	    array_1016 = new int[parts.length];
	    try {
	        for (int i = 0; i < parts.length; i++) {
	            array_1016[i] = Integer.parseInt(parts[i].trim());
	        }
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }
	    labelArray_1016 = new JLabel[array_1016.length];
	    panelArray_1016.removeAll();

	    for (int i = 0; i < array_1016.length; i++) {
	        labelArray_1016[i] = new JLabel(String.valueOf(array_1016[i]));
	        labelArray_1016[i].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_1016[i].setOpaque(true);
	        labelArray_1016[i].setBackground(Color.WHITE);
	        labelArray_1016[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_1016[i].setPreferredSize(new Dimension(50, 50));
	        labelArray_1016[i].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_1016.add(labelArray_1016[i]);
	    }
	    mergeQueue_1016.clear();
	    generateMergeSteps_1016(0, array_1016.length - 1);
	    
	    stepButton_1016.setEnabled(true);
	    stepArea_1016.setText("");
	    stepCount_1016 = 1;
	    isMerging_1016 = false;
	    
	    panelArray_1016.revalidate();
	    panelArray_1016.repaint();
	}
	
	private void generateMergeSteps_1016(int left_1016, int right_1016) {
	    if (left_1016 >= right_1016) {
	        return;
	    }
	    int mid_1016 = (left_1016 + right_1016) / 2;

	    generateMergeSteps_1016(left_1016, mid_1016);
	    generateMergeSteps_1016(mid_1016 + 1, right_1016);

	    mergeQueue_1016.add(new int[] {
	    		left_1016, mid_1016, right_1016
	    		});
	}
	
	private void performStep_1016() {
	    resetHighlights_1016();
	    if (!isMerging_1016 && !mergeQueue_1016.isEmpty()) {
	        int[] range_1016 = mergeQueue_1016.poll();

	        left_1016 = range_1016[0];
	        mid_1016 = range_1016[1];
	        right_1016 = range_1016[2];
	        temp_1016 = new int[right_1016 - left_1016 + 1];

	        i_1016 = left_1016;
	        j_1016 = mid_1016 + 1;
	        k_1016 = 0;

	        copying_1016 = false;
	        isMerging_1016 = true;
	        stepArea_1016.append("Langkah " + stepCount_1016++ + ": Mulai merge dari indeks " + left_1016 + " sampai " + right_1016 + "\n");
	        return;
	    }

	    if (isMerging_1016 && !copying_1016) {
	        if (i_1016 <= mid_1016 && j_1016 <= right_1016) {
	            labelArray_1016[i_1016].setBackground(Color.CYAN);
	            labelArray_1016[j_1016].setBackground(Color.CYAN);
	            if (array_1016[i_1016] <= array_1016[j_1016]) {
	                temp_1016[k_1016++] = array_1016[i_1016++];
	            } else {
	                temp_1016[k_1016++] = array_1016[j_1016++];
	            }
	            stepArea_1016.append(
	            	    "Langkah " + stepCount_1016++
	            	    + ": Bandingkan dan salin elemen\n"
	            	    + "Hasil: "
	            	    + arrayToString_1016(array_1016)
	            	    + "\n\n"
	            	);
	            return;
	        }
	        else if (i_1016 <= mid_1016) {
	            temp_1016[k_1016++] = array_1016[i_1016++];
	            stepArea_1016.append(
	            	    "Langkah " + stepCount_1016++
	            	    + ": Salin sisa kiri\n"
	            	    + "Hasil: "
	            	    + arrayToString_1016(array_1016)
	            	    + "\n\n"
	            	);
	            return;
	        }
	        else if (j_1016 <= right_1016) {
	            temp_1016[k_1016++] = array_1016[j_1016++];
	            stepArea_1016.append(
	            	    "Langkah " + stepCount_1016++
	            	    + ": Salin sisa kanan\n"
	            	    + "Hasil: "
	            	    + arrayToString_1016(array_1016)
	            	    + "\n\n"
	            	);
	            return;
	        }
	        else {
	            copying_1016 = true;
	            k_1016 = 0;
	            return;
	        }
	    }

	    if (copying_1016 && k_1016 < temp_1016.length) {
	        array_1016[left_1016 + k_1016] = temp_1016[k_1016];
	        labelArray_1016[left_1016 + k_1016].setText(String.valueOf(temp_1016[k_1016]));
	        labelArray_1016[left_1016 + k_1016].setBackground(Color.GREEN);
	        k_1016++;
	        stepArea_1016.append(
	        	    "Langkah " + stepCount_1016++
	        	    + ": Tempelkan ke array utama\n"
	        	    + "Hasil: "
	        	    + arrayToString_1016(array_1016)
	        	    + "\n\n"
	        	);
	        return;
	    }
	    if (copying_1016 && k_1016 == temp_1016.length) {
	        isMerging_1016 = false;
	        copying_1016 = false;
	    }
	    if (mergeQueue_1016.isEmpty() && !isMerging_1016) {
	        stepArea_1016.append("Selesai.\n");
	        stepButton_1016.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
	    }
	}
	    
	private void resetHighlights_1016() {
	    if (labelArray_1016 == null) {
	        return;
	    }
	    for (JLabel label_1016 : labelArray_1016) {
	        label_1016.setBackground(Color.WHITE);
	    }
	}
	
	private void reset_1016() {
	    inputField_1016.setText("");
	    panelArray_1016.removeAll();
	    panelArray_1016.revalidate();
	    panelArray_1016.repaint();
	    stepArea_1016.setText("");
	    stepButton_1016.setEnabled(false);
	    mergeQueue_1016.clear();
	    isMerging_1016 = false;
	    stepCount_1016 = 1;
	}

	private String arrayToString_1016(int[] arr_1016) {
	    StringBuilder sb_1016 = new StringBuilder();
	    for (int k_1016 = 0; k_1016 < arr_1016.length; k_1016++) {
	        sb_1016.append(arr_1016[k_1016]);
	        if (k_1016 < arr_1016.length - 1) {
	            sb_1016.append(", ");
	        }
	    }
	    return sb_1016.toString();
	}

	public static void main(String[] args) {
	    SwingUtilities.invokeLater(() -> {
	        MergeSortGUI_2511531016 gui_1016 = new MergeSortGUI_2511531016();
	        gui_1016.setVisible(true); });
	}
}