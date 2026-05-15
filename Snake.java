import javax.swing.JFrame;

public class Snake {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Snake");
        ventana.setSize(616, 700);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

        ventana.add(new MovimientoSnake());

        ventana.setVisible(true);
    }
}
