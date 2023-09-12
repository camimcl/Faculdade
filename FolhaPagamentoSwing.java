/*2 - Faça um programa para o cálculo de uma folha de pagamento, 
sabendo que os descontos são do imposto de Renda, que depende do 
salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS 
corresponde a 11% do salário bruto, mas não é descontado
(é a empresa que deposita.)O salário líquido corresponde ao salário 
bruto menos os descontos O programa deverá pedir ao usuário o valor da sua 
hora e a quantidade de horas trabalhadas no mês.

a. Desconto do IR;
b. Salário Bruto ate R$900,00 (inclusive) – Isento;
c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
d. Salario bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
e. Salário bruto acima de 2500 – Desconto de 20%.

Imprima na tela as informações, dispostas conforme o exemplo abaixo,
no exemplo valor da hora é 5 e a quantidade de horas é 220.  

Salário bruto (5 * 220)           : R$   1100,00
( – ) IR (5%)                     : R$     55,00
( – ) INSS ( 10% )                 : R$     110,00
FGTS ( 11%)                       : R$     121,00
Total de descontos                 : R$     165,00
Salário Líquido                   : R$     935,00 
*/





package pagamentoswing_teste;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FolhaPagamentoSwing extends JFrame {
    double ir; 
    private final JTextField valorHoraField;
    private final JTextField horasTrabalhadasField;
    private final JLabel salarioBrutoLabel;
    private final JLabel irLabel;
    private final JLabel inssLabel;
    private final JLabel fgtsLabel;
    private final JLabel descontosTotalLabel;
    private final JLabel salarioLiquidoLabel;

    public FolhaPagamentoSwing() {
        setTitle("Cálculo de Folha de Pagamento");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        
       
                
                
        JPanel panel = new JPanel();
        panel.setSize(600, 20);
        setResizable(false);
        getContentPane().setBackground(Color.green);//muda cor do background
        panel.setLayout(new GridLayout(3, 8, 2, 2));
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JLabel valorHoraLabel = new JLabel("Valor da Hora:");
        JLabel horasTrabalhadasLabel = new JLabel("Horas Trabalhadas:");
        valorHoraField = new JTextField();
        horasTrabalhadasField = new JTextField();
        

        panel.add(valorHoraLabel);
        panel.add(valorHoraField);
        valorHoraField.setPreferredSize(new Dimension(1,1));
        panel.add(horasTrabalhadasLabel);
        panel.add(horasTrabalhadasField);

        JButton calcularButton = new JButton("Calcular");
        calcularButton.setPreferredSize(new Dimension(3, 3)); // Largura x Altura
        calcularButton.setMargin(new Insets(5, 5, 5, 5)); 


        panel.add(calcularButton);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        salarioBrutoLabel = new JLabel("Salário Bruto: ");
        irLabel = new JLabel("IR: ");
        inssLabel = new JLabel("INSS: ");
        fgtsLabel = new JLabel("FGTS: ");
        descontosTotalLabel = new JLabel("Total de Descontos: ");
        salarioLiquidoLabel = new JLabel("Salário Líquido: ");

        panel.add(salarioBrutoLabel);
        panel.add(irLabel);
        panel.add(inssLabel);
        panel.add(fgtsLabel);
        panel.add(descontosTotalLabel);
        panel.add(salarioLiquidoLabel);

        add(panel);
    }

    private void calcular() {
        double valorHora = Double.parseDouble(valorHoraField.getText());
        double horasTrabalhadas = Double.parseDouble(horasTrabalhadasField.getText());
        double salarioBruto = valorHora * horasTrabalhadas;
        
         if (salarioBruto<=900){
        ir=salarioBruto*0;
        }
        else if (salarioBruto>900&& salarioBruto<=1500){
        ir=salarioBruto*5/100;
        }
        else if (salarioBruto>1500&& salarioBruto<=2500){
        ir=salarioBruto*10/100;
        }
        else if (salarioBruto>2500){
        ir=salarioBruto*20/100;
        }
         
        double inss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double descontosTotal = inss+ir;
        double salarioLiquido = salarioBruto - descontosTotal;
       
        
       
        

        salarioBrutoLabel.setText("Salário Bruto: R$ " + salarioBruto);
        irLabel.setText("IR:"+ir );  
        inssLabel.setText("INSS: R$ " + inss);
        fgtsLabel.setText("FGTS: R$ " + fgts);
        descontosTotalLabel.setText("Total de Descontos: R$ " + descontosTotal);
        salarioLiquidoLabel.setText("Salário Líquido: R$ " + salarioLiquido);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FolhaPagamentoSwing().setVisible(true);
        });
    }
}