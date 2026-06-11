package pekan9_2511531016;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.*;

public class PetaBandara_2511531016 extends JFrame {
    private Map<String, List<String>> graph_1016 = new HashMap<>();
    private JComboBox<String> cmbAwal_1016;
    private JComboBox<String> cmbTujuan_1016;
    private JTextArea hasil_1016;
    private JLabel jalur_1016;
    private JLabel nodeDikunjungi_1016;
    private JLabel jumlahNode_1016;
    private GraphPanel_1016 panelGraf_1016;
    private List<String> visitedNodes_1016 = new ArrayList<>();

    public PetaBandara_2511531016() {
        setTitle("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS");
        setSize(1050, 750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createGraph_1016();
        initComponent_1016();
    }

    private void initComponent_1016() {
        JPanel top_1016 = new JPanel();
        cmbAwal_1016 = new JComboBox<>(graph_1016.keySet().toArray(new String[0]));
        cmbTujuan_1016 = new JComboBox<>(graph_1016.keySet().toArray(new String[0]));

        JButton btnBFS_1016 = new JButton("BFS");
        JButton btnDFS_1016 = new JButton("DFS");
        JButton btnReset_1016 = new JButton("RESET");

        top_1016.add(new JLabel("Lokasi Awal :"));
        top_1016.add(cmbAwal_1016);
        top_1016.add(new JLabel("Lokasi Tujuan :"));
        top_1016.add(cmbTujuan_1016);
        top_1016.add(btnBFS_1016);
        top_1016.add(btnDFS_1016);
        top_1016.add(btnReset_1016);
        add(top_1016, BorderLayout.NORTH);

        panelGraf_1016 = new GraphPanel_1016();
        add(panelGraf_1016, BorderLayout.CENTER);
        JPanel bawah_1016 = new JPanel();
        bawah_1016.setLayout(new GridLayout(4, 1));
        hasil_1016 = new JTextArea();
        hasil_1016.setEditable(false);
        jalur_1016 = new JLabel("Jalur :");
        nodeDikunjungi_1016 = new JLabel("Node Dikunjungi :");
        jumlahNode_1016 = new JLabel("Jumlah Node Dikunjungi : 0");

        bawah_1016.add(new JScrollPane(hasil_1016));
        bawah_1016.add(jalur_1016);
        bawah_1016.add(nodeDikunjungi_1016);
        bawah_1016.add(jumlahNode_1016);
        add(bawah_1016, BorderLayout.SOUTH);
        btnBFS_1016.addActionListener(e -> bfs_1016());
        btnDFS_1016.addActionListener(e -> dfs_1016());
        btnReset_1016.addActionListener(e -> resetGraph_1016());
    }

    private void addEdge_1016(String a, String b) {
        graph_1016.putIfAbsent(a, new ArrayList<>());
        graph_1016.putIfAbsent(b, new ArrayList<>());
        graph_1016.get(a).add(b);
        graph_1016.get(b).add(a);
    }

    private void createGraph_1016() {
    	 addEdge_1016("Terminal 1", "Terminal 2");
    	 addEdge_1016("Terminal 2", "Terminal 3");

    	 addEdge_1016("Terminal 1", "Parkir");
    	 addEdge_1016("Terminal 2", "Area Check-In");
    	 addEdge_1016("Terminal 3", "Area Bagasi");

    	 addEdge_1016("Parkir", "Area Check-In");
    	 addEdge_1016("Area Check-In", "Area Bagasi");

    	 addEdge_1016("Area Check-In", "Security Check");
    	 addEdge_1016("Security Check", "Ruang Tunggu");

    	 addEdge_1016("Ruang Tunggu", "Gate A");
    	 addEdge_1016("Ruang Tunggu", "Gate B");

    	 addEdge_1016("Gate A", "Terminal 1");
    	 addEdge_1016("Gate B", "Terminal 2");

    	 addEdge_1016("Area Bagasi", "Terminal 3");
    	 addEdge_1016("Area Bagasi", "Parkir");
    }

    private void bfs_1016() {
        String start_1016 = cmbAwal_1016.getSelectedItem().toString();
        String goal_1016 = cmbTujuan_1016.getSelectedItem().toString();
        Queue<String> queue_1016 = new LinkedList<>();
        Set<String> visited_1016 = new HashSet<>();
        Map<String, String> parent_1016 = new HashMap<>();
        visitedNodes_1016.clear();
        queue_1016.add(start_1016);
        visited_1016.add(start_1016);
        while (!queue_1016.isEmpty()) {
            String current_1016 = queue_1016.poll();
            visitedNodes_1016.add(current_1016);
            if (current_1016.equals(goal_1016))
                break;
            for (String neighbor_1016 : graph_1016.get(current_1016)) {
                if (!visited_1016.contains(neighbor_1016)) {
                    visited_1016.add(neighbor_1016);
                    parent_1016.put(neighbor_1016, current_1016);
                    queue_1016.add(neighbor_1016);
                }
            }
        }
        tampilkanHasil_1016(parent_1016, start_1016, goal_1016, "BFS");
    }

    private void dfs_1016() {
        String start_1016 = cmbAwal_1016.getSelectedItem().toString();
        String goal_1016 = cmbTujuan_1016.getSelectedItem().toString();
        Stack<String> stack_1016 = new Stack<>();
        Set<String> visited_1016 = new HashSet<>();
        Map<String, String> parent_1016 = new HashMap<>();
        visitedNodes_1016.clear();
        stack_1016.push(start_1016);
        while (!stack_1016.isEmpty()) {
            String current_1016 = stack_1016.pop();
            if (visited_1016.contains(current_1016))
                continue;
            visited_1016.add(current_1016);
            visitedNodes_1016.add(current_1016);
            if (current_1016.equals(goal_1016))
                break;
            for (String neighbor_1016 : graph_1016.get(current_1016)) {
                if (!visited_1016.contains(neighbor_1016)) {
                    parent_1016.put(neighbor_1016, current_1016);
                    stack_1016.push(neighbor_1016);
                }
            }
        }
        tampilkanHasil_1016(parent_1016, start_1016, goal_1016, "DFS");
    }

    private void tampilkanHasil_1016(Map<String, String> parent_1016, String start_1016, String goal_1016, String metode_1016) {
        List<String> path_1016 = new ArrayList<>();
        String current_1016 = goal_1016;
        while (current_1016 != null) {
            path_1016.add(current_1016);
            current_1016 = parent_1016.get(current_1016);
        }
        Collections.reverse(path_1016);
        hasil_1016.setText("Metode : " + metode_1016);
        displayPath_1016(path_1016);
        nodeDikunjungi_1016.setText("Node Dikunjungi : " + visitedNodes_1016);
        jumlahNode_1016.setText("Jumlah Node Dikunjungi : " + visitedNodes_1016.size());
        displayGraph_1016();
    }

    private void resetGraph_1016() {
        visitedNodes_1016.clear();
        hasil_1016.setText("");
        jalur_1016.setText("Jalur :");
        nodeDikunjungi_1016.setText("Node Dikunjungi :");
        jumlahNode_1016.setText("Jumlah Node Dikunjungi : 0");
        displayGraph_1016();
    }

    private void displayGraph_1016() {
        panelGraf_1016.repaint();
    }
    private void displayPath_1016(List<String> path_1016) {
        jalur_1016.setText("Jalur : " + String.join(" -> ", path_1016)
        );
    }
    
    class GraphPanel_1016 extends JPanel {
        Map<String, Point> posisi_1016 = new HashMap<>();
        public GraphPanel_1016() {
        	posisi_1016.put("Terminal 1", new Point(150, 80));
        	posisi_1016.put("Terminal 2", new Point(350, 80));
        	posisi_1016.put("Terminal 3", new Point(550, 80));

        	posisi_1016.put("Parkir", new Point(80, 220));
        	posisi_1016.put("Area Check-In", new Point(350, 220));
        	posisi_1016.put("Area Bagasi", new Point(620, 220));

        	posisi_1016.put("Security Check", new Point(350, 320));

        	posisi_1016.put("Ruang Tunggu", new Point(350, 420));

        	posisi_1016.put("Gate A", new Point(220, 520));
        	posisi_1016.put("Gate B", new Point(480, 520));
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (String node_1016 : graph_1016.keySet()) {
                Point p1 = posisi_1016.get(node_1016);
                for (String tetangga_1016 : graph_1016.get(node_1016)) {
                    Point p2 = posisi_1016.get(tetangga_1016);
                    g.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }
            for (String node_1016 : posisi_1016.keySet()) {
                Point p = posisi_1016.get(node_1016);
                if (visitedNodes_1016.contains(node_1016))
                    g.setColor(Color.GREEN);
                else
                    g.setColor(Color.LIGHT_GRAY);
                g.fillOval(p.x - 25, p.y - 25, 50, 50);
                g.setColor(Color.BLACK);
                g.drawOval(p.x - 25, p.y - 25, 50, 50);
                g.drawString(node_1016, p.x - 30, p.y - 35);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PetaBandara_2511531016().setVisible(true);
        });
    }
}