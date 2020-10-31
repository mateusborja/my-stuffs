
package com.mateusborja.appAreaRect;

import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author mateus.borja
 */
public class AppAreaSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat();

        double area;

        System.out.println("tell me side your square: =>");
        Quadrado.lado = sc.nextDouble();

        area = Quadrado.calcularArea();
        System.out.println("area is: => " + dc.format(area) + " square meters");

    }

}
