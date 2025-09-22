import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class sumaGUI {

    private Frame f;
    private Panel pan1, pan2, pan3;
    private JLabel lblInstruccion1, lblInstruccion2, lblNum1, lblnum2, lblResultado;
    private TextField tfNum1, tfNum2, tfResultado;
    private Button btSalir, btCalcular;
    private CheckboxGroup operaciones;
    private Checkbox cbSuma, cbResta, cbMultiplicacion, cbDivision;

    public sumaGUI() {
        f = new Frame("Suma de dos números");
        pan1 = new Panel();
        pan2 = new Panel();
        pan3 = new Panel();

        lblInstruccion1 = new JLabel("Instrucciones:");
        lblInstruccion2 = new JLabel("Ingrese los números y seleccione la operación.");
        lblNum1 = new JLabel("Primer número:");
        lblnum2 = new JLabel("Segundo número:");
        lblResultado = new JLabel("Resultado:");

        tfNum1 = new TextField(5);
        tfNum2 = new TextField(5);
        tfResultado = new TextField(8);
        tfResultado.setEditable(false);

        btCalcular = new Button("Calcular");
        btSalir = new Button("Salir");

        operaciones = new CheckboxGroup();
        cbSuma = new Checkbox("Suma", operaciones, true);
        cbResta = new Checkbox("Resta", operaciones, false);
        cbMultiplicacion = new Checkbox("Multiplicacion", operaciones, false);
        cbDivision = new Checkbox("Division", operaciones, false);
    }

    public void acomodarEnFrame() {
        btCalcular.addActionListener(new MnjBotonCalcular());
        btSalir.addActionListener(new MnjBotonSalir());

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        pan1.setLayout(new GridLayout(2, 1));
        pan1.add(lblInstruccion1);
        pan1.add(lblInstruccion2);
        f.add(pan1, BorderLayout.NORTH);

        pan2.setLayout(new GridLayout(3, 2));
        pan2.add(lblNum1);
        pan2.add(tfNum1);
        pan2.add(lblnum2);
        pan2.add(tfNum2);
        pan2.add(lblResultado);
        pan2.add(tfResultado);
        f.add(pan2, BorderLayout.CENTER);

        Panel panOperaciones = new Panel(new GridLayout(2, 2));
        panOperaciones.add(cbSuma);
        panOperaciones.add(cbResta);
        panOperaciones.add(cbMultiplicacion);
        panOperaciones.add(cbDivision);
        f.add(panOperaciones, BorderLayout.EAST);

        pan3.setLayout(new GridLayout(1, 2));
        pan3.add(btCalcular);
        pan3.add(btSalir);
        f.add(pan3, BorderLayout.SOUTH);

        f.setSize(400, 300);
        f.setVisible(true);
    }

    class MnjBotonCalcular implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            try {
                double n1 = Double.parseDouble(tfNum1.getText());
                double n2 = Double.parseDouble(tfNum2.getText());
                double res = 0;

                Checkbox seleccionada = operaciones.getSelectedCheckbox();
                String operacion = seleccionada.getLabel();

                switch (operacion) {
                    case "Suma":
                        res = n1 + n2;
                        break;
                    case "Resta":
                        res = n1 - n2;
                        break;
                    case "Multiplicacion":
                        res = n1 * n2;
                        break;
                    case "Division":
                        if (n2 != 0) {
                            res = n1 / n2;
                        } else {
                            tfResultado.setText("Error: división por cero");
                            return;
                        }
                        break;
                    default:
                        tfResultado.setText("Operación no reconocida");
                        return;
                }

                tfResultado.setText(Double.toString(res));
            } catch (NumberFormatException e) {
                tfResultado.setText("Entrada inválida");
            }
        }
    }

    class MnjBotonSalir implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        sumaGUI ventanaSuma = new sumaGUI();
        ventanaSuma.acomodarEnFrame();
    }
}