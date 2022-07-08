package Condicionales;

import javax.swing.*;

// Hacer un programa que pase de kg a otra unidad de medida de masa, mostrar en pantalla un menú con las
//opciones posibles
public class ConvertirMedida14 {
    public static void main (String[] args){
        float pesoKg, pesoGr, pesoHg, pesoDag, pesoDg, pesoCg, pesoMg;
        pesoKg = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso en Kg"));

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("A que unidad de medida quisieras pasar los "+pesoKg +
                "Kg \n " +
                "1. Hectogramos \n " +
                "2. Decagramos \n" +
                "3. Gramos \n" +
                "4. Decigramos \n" +
                "5. Centigramos \n" +
                "6. Miligramo"));

        switch (opcion){
            case 1:
                pesoHg = pesoKg*10f;
                JOptionPane.showMessageDialog(null, pesoKg+"Kg ="+ pesoHg+"Hg");
                break;

            case 2:
                pesoDag = pesoKg*100;
                JOptionPane.showMessageDialog(null,pesoKg+"Kg ="+ pesoDag+"Dag" );
                break;

            case 3:
                pesoGr = pesoKg*1000;
                JOptionPane.showMessageDialog(null,pesoKg+"Kg ="+ pesoGr+"gr" );
                break;

            case 4:
                pesoDg = pesoKg*10000;
                JOptionPane.showMessageDialog(null, pesoKg+"Kg ="+ pesoDg+"dg" );
                break;

            case 5:
                pesoCg = pesoKg*100000;
                JOptionPane.showMessageDialog(null, pesoKg+"Kg ="+ pesoCg+"cg" );
                break;

            case 6:
                pesoMg = pesoKg*1000000;
                JOptionPane.showMessageDialog(null, pesoKg+"Kg ="+ pesoMg+"mg" );
                break;

            default:
                JOptionPane.showMessageDialog(null,"La opcion no esta disponible");
        }
    }
}
