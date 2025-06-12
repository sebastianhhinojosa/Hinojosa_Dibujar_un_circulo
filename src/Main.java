import figuras.CirculoDibujable;
import figuras.CuadradoDibujable;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        CirculoDibujable circulo = new CirculoDibujable(100, 50, 50);
        CuadradoDibujable cuadrado = new CuadradoDibujable(100, 200, 50);

        System.out.println("El área del círculo es: " + circulo.getArea());
        System.out.println("El perímetro del círculo es: " + circulo.getPerimetro());
        System.out.println("El área del cuadrado es: " + cuadrado.getArea());
        System.out.println("El perímetro del cuadrado es: " + cuadrado.getPerimetro());

        JFrame frame = new JFrame("Dibujar Figuras");
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                circulo.dibujar2D(g);
                cuadrado.dibujar2D(g);
            }
        };

        panel.setPreferredSize(new Dimension(350, 350));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


