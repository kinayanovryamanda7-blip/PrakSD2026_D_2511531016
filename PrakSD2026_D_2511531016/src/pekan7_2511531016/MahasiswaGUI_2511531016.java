package pekan7_2511531016;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class MahasiswaGUI_2511531016 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtNama_1016;
    private JTextField txtNim_1016;
    private JTextField txtProdi_1016;
    private JButton btnTambah_1016;
    private JButton btnHapus_1016;
    private JButton btnSorting_1016;
    private JComboBox<String> comboSorting_1016;
    private JTable table_1016;
    private DefaultTableModel model_1016;
    private JTextArea textArea_1016;
    private ArrayList<Mahasiswa_2511531016> listMahasiswa_1016;

    public MahasiswaGUI_2511531016() {
        setTitle("Sorting Nama Mahasiswa");
        setSize(1250, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        listMahasiswa_1016 = new ArrayList<>();

        Font font_1016 = new Font("Arial", Font.PLAIN, 14);
        JPanel inputPanel_1016 = new JPanel();
        inputPanel_1016.setLayout(new FlowLayout( FlowLayout.LEFT, 10, 10));
        inputPanel_1016.setBorder(BorderFactory.createTitledBorder("Input Data Mahasiswa"));

        txtNama_1016 = new JTextField(10);
        txtNim_1016 = new JTextField(10);
        txtProdi_1016 = new JTextField(10);
        
        txtNama_1016.setFont(font_1016);
        txtNim_1016.setFont(font_1016);
        txtProdi_1016.setFont(font_1016);
        
        btnTambah_1016 = new JButton("Tambah Data");
        btnHapus_1016 = new JButton("Hapus Semua");
        btnSorting_1016 = new JButton("Mulai Sorting");
        btnTambah_1016.setPreferredSize(new Dimension(130, 30));
        btnHapus_1016.setPreferredSize(new Dimension(130, 30));
        btnSorting_1016.setPreferredSize(new Dimension(140, 30));

        comboSorting_1016 = new JComboBox<>();
        comboSorting_1016.addItem("Insertion Sort");
        comboSorting_1016.addItem("Selection Sort");
        comboSorting_1016.addItem("Bubble Sort");
        comboSorting_1016.setPreferredSize(new Dimension(160, 30));

        inputPanel_1016.add(new JLabel("Nama"));
        inputPanel_1016.add(txtNama_1016);
        inputPanel_1016.add(new JLabel("NIM"));
        inputPanel_1016.add(txtNim_1016);
        inputPanel_1016.add(new JLabel("Prodi"));
        inputPanel_1016.add(txtProdi_1016);
        inputPanel_1016.add(btnTambah_1016);
        inputPanel_1016.add(btnHapus_1016);
        inputPanel_1016.add(btnSorting_1016);
        inputPanel_1016.add(comboSorting_1016);
        add(inputPanel_1016, BorderLayout.NORTH);

        model_1016 = new DefaultTableModel();
        model_1016.addColumn("Nama");
        model_1016.addColumn("NIM");
        model_1016.addColumn("Program Studi");

        table_1016 = new JTable(model_1016);
        table_1016.setRowHeight(28);
        table_1016.setFont(font_1016);

        JScrollPane scrollTable_1016 = new JScrollPane(table_1016);
        scrollTable_1016.setBorder(BorderFactory.createTitledBorder("Data Mahasiswa"));
        add(scrollTable_1016, BorderLayout.CENTER);

        textArea_1016 = new JTextArea();
        textArea_1016.setEditable(false);
        textArea_1016.setFont(new Font("Monospaced", Font.PLAIN, 16));

        JScrollPane scrollText_1016 = new JScrollPane(textArea_1016);
        scrollText_1016.setBorder(BorderFactory.createTitledBorder("Visualisasi Sorting"));
        scrollText_1016.setPreferredSize(new Dimension(1200, 200));
        add(scrollText_1016, BorderLayout.SOUTH);

        btnTambah_1016.addActionListener(e -> tambahData_1016());
        btnHapus_1016.addActionListener(e -> hapusData_1016());
        btnSorting_1016.addActionListener(e -> prosesSorting_1016());

        setVisible(true);
    }

    private void tambahData_1016() {
        String nama_1016 = txtNama_1016.getText();
        String nim_1016 = txtNim_1016.getText();
        String prodi_1016 = txtProdi_1016.getText();
        if (nama_1016.isEmpty() || nim_1016.isEmpty() || prodi_1016.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!");
            return;
        }
        Mahasiswa_2511531016 mhs_1016 = new Mahasiswa_2511531016(nama_1016, nim_1016, prodi_1016);
        listMahasiswa_1016.add(mhs_1016);
        model_1016.addRow(new Object[] {
                nama_1016, nim_1016, prodi_1016
        });

        txtNama_1016.setText("");
        txtNim_1016.setText("");
        txtProdi_1016.setText("");
    }

    private void hapusData_1016() {
        listMahasiswa_1016.clear();
        model_1016.setRowCount(0);
        textArea_1016.setText("");
    }

    private void prosesSorting_1016() {
        textArea_1016.setText("");
        ArrayList<Mahasiswa_2511531016> backup_1016 = new ArrayList<>();
        for (Mahasiswa_2511531016 mhs_1016 : listMahasiswa_1016) {
            backup_1016.add(new Mahasiswa_2511531016(mhs_1016.getNama_1016(), mhs_1016.getNim_1016(), mhs_1016.getProdi_1016()));
        }
        String choice_1016 = comboSorting_1016.getSelectedItem().toString();
        if (choice_1016.equals("Insertion Sort")) {
            insertionSort_1016();
        }
        else if (choice_1016.equals("Selection Sort")) {
            selectionSort_1016();
        }
        else {
        	bubbleSort_1016();
        }
        listMahasiswa_1016 = backup_1016;
    }

    private void insertionSort_1016() {
        textArea_1016.append("=== INSERTION SORT ===\n\n");
        for (int i_1016 = 1;
             i_1016 < listMahasiswa_1016.size();
             i_1016++) {
            Mahasiswa_2511531016 key_1016 = listMahasiswa_1016.get(i_1016);
            int j_1016 = i_1016 - 1;
            while (j_1016 >= 0 && listMahasiswa_1016.get(j_1016).getNama_1016().compareToIgnoreCase(key_1016.getNama_1016()) > 0) {
                listMahasiswa_1016.set(j_1016 + 1, listMahasiswa_1016.get(j_1016));
                j_1016--;
            }
            listMahasiswa_1016.set(j_1016 + 1, key_1016);
            textArea_1016.append("Langkah " + i_1016 + " : " + tampilNama_1016() + "\n\n");
        }
    }

    private void selectionSort_1016() {
        textArea_1016.append("=== SELECTION SORT ===\n\n");
        for (int i_1016 = 0; i_1016 < listMahasiswa_1016.size() - 1; i_1016++) {
            int minIndex_1016 = i_1016;
            for (int j_1016 = i_1016 + 1; j_1016 < listMahasiswa_1016.size(); j_1016++) {
                if (listMahasiswa_1016.get(j_1016).getNama_1016().compareToIgnoreCase(listMahasiswa_1016.get(minIndex_1016).getNama_1016()) < 0) {
                    minIndex_1016 = j_1016;
                }
            }
            Mahasiswa_2511531016 temp_1016 = listMahasiswa_1016.get(i_1016);
            listMahasiswa_1016.set(i_1016, listMahasiswa_1016.get(minIndex_1016));
            listMahasiswa_1016.set(minIndex_1016, temp_1016);
            textArea_1016.append("Pass " + (i_1016 + 1) + " : " + tampilNama_1016() + "\n\n");
        }
    }

    private void bubbleSort_1016() {
        textArea_1016.append("=== BUBBLE SORT ===\n\n");
        for (int i_1016 = 0; i_1016 < listMahasiswa_1016.size() - 1; i_1016++) {
            for (int j_1016 = 0; j_1016 < listMahasiswa_1016.size() - i_1016 - 1; j_1016++) {
                if (listMahasiswa_1016.get(j_1016).getNama_1016().compareToIgnoreCase(listMahasiswa_1016.get(j_1016 + 1).getNama_1016()) > 0) {
                    Mahasiswa_2511531016 temp_1016 = listMahasiswa_1016.get(j_1016);
                    listMahasiswa_1016.set(j_1016,listMahasiswa_1016.get(j_1016 + 1));
                    listMahasiswa_1016.set(j_1016 + 1, temp_1016);
                }
            }
            textArea_1016.append("Pass " + (i_1016 + 1) + " : " + tampilNama_1016() + "\n\n");
        }
    }

    private String tampilNama_1016() {
        String hasil_1016 = "[";
        for (int i_1016 = 0; i_1016 < listMahasiswa_1016.size(); i_1016++) {
            hasil_1016 += listMahasiswa_1016.get(i_1016).getNama_1016();
            if (i_1016 < listMahasiswa_1016.size() - 1) {
                hasil_1016 += ", ";
            }
        }
        hasil_1016 += "]";
        return hasil_1016;
    }

    private void tampilData_1016() {
        model_1016.setRowCount(0);
        for (Mahasiswa_2511531016 mhs_1016 : listMahasiswa_1016) {
            model_1016.addRow(new Object[] {
                    mhs_1016.getNama_1016(),
                    mhs_1016.getNim_1016(),
                    mhs_1016.getProdi_1016()
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MahasiswaGUI_2511531016();
        });
    }
}