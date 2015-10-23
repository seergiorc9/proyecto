package proyecto;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio Roa Campos
 */
public class Proyecto {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int respuesta = 1, seleccion = 1, op = 1;

        JOptionPane.showMessageDialog(null, "Scotiabank Opening Championship 2015-2016");
        
        do {

            try {
                respuesta = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE EQUIPO:  \n 1.- Antofagasta \n 2.- Audax Italiano \n 3.- Cobresal \n 4.- Colo-Colo \n 5.- Deportes Iquique \n 6.- Huachipato \n 7.- O'Higgins \n 8.- Palestino \n 9.- San Luis \n 10.- Santiago Waderers \n 11.- San Marcos De Arica \n 12.- U. De Concepcion \n 13.- Union Española \n 14.- Union La Calera \n 15.- U. Catolica \n 16.- U. De Chile \n 17.- Salir"));

                switch (respuesta) {
                    case 1:
                        System.out.println(leerEquipo("Antofagasta"));
                        seleccion = JOptionPane.showOptionDialog(null, "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 2:
                        System.out.println(leerEquipo("Audax Italiano"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 3:
                        System.out.println(leerEquipo("Cobresal"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 4:
                        System.out.println(leerEquipo("Colo Colo"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 5:
                        System.out.println(leerEquipo("Deportes Iquique"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 6:
                        System.out.println(leerEquipo("Huachipato"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 7:
                        System.out.println(leerEquipo("O'Higgins"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 8:
                        System.out.println(leerEquipo("Palestino"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 9:
                        System.out.println(leerEquipo("San Luis"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 10:
                        System.out.println(leerEquipo("San Marcos de Arica"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 11:
                        System.out.println(leerEquipo("Santiago Wanderes"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 12:
                        System.out.println(leerEquipo("Union Española"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 13:
                        System.out.println(leerEquipo("Union La Calera"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 14:
                        System.out.println(leerEquipo("Universidad Catolica"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 15:
                        System.out.println(leerEquipo("Universidad de Chile"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;

                    case 16:
                        System.out.println(leerEquipo("Universidad de Concepcion"));
                        seleccion = JOptionPane.showOptionDialog(null,
                                "Desea seleccionar otro equipo", "Scotiabank Opening Championsship 2015-2016", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION INVALIDA");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " OPCION INVALIDA !! \n Ingrese numero");
            }

        } while ((op <= 16) && seleccion == 1);
        JOptionPane.showMessageDialog(null, "Hasta luego");
    }

    public static String leerEquipo(String equipo) {
        File archivo = new File("C:/equipos/" + equipo + ".txt");
        String retorno = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            retorno += "Equipo: " + equipo + "\n\n";
            retorno += br.readLine() + "\n\n";
            retorno += "Jugadores: \n";
            for (String linea; (linea = br.readLine()) != null;) {
                retorno += linea + "\n";
            }
        } catch (Exception e) {
            System.out.println("ERROR DE ARCHIVO");
        }
        return retorno;
    }
}