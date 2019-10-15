/* 
 * Copyright 2019 mon-mode - 0mon.mode@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mon-mode
 */
public class Main {

    // Instanciar Scanner
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final Calendar CAL = Calendar.getInstance();

    public static void main(String[] args) {
        // Formato, instancia y llamada a los datos de Calendario CAL. 
        SimpleDateFormat SDF = new SimpleDateFormat("HH:mm:ss");
        Date date = CAL.getTime();

        //Declaramos variables hour, min, sec...
        int hour, min, sec, hourTot, minTot, secTot;

        /* Lineas comentadas, usamos la expresión directamente en la resta de
        hourTot, minTot y secTot.  (lineas 59 a 61)
        
        int hourCal = CAL.get(Calendar.HOUR_OF_DAY);
        int minCal = CAL.get(Calendar.MINUTE);
        int secCal = CAL.get(Calendar.SECOND); */
        try {
            System.out.printf("Hora inicio.....: ");
            hour = SCN.nextInt();
            System.out.printf("Minuto inicio...: ");
            min = SCN.nextInt();
            System.out.printf("Segundo inicio..: ");
            sec = SCN.nextInt();

            //Operamos la resta de las horas.
            hourTot = Math.abs(hour - CAL.get(Calendar.HOUR_OF_DAY));
            minTot = Math.abs(min - CAL.get(Calendar.MINUTE));
            secTot = Math.abs(sec - CAL.get(Calendar.SECOND));

            //Salida por consola
            System.out.println("\nHora actual.....: " + SDF.format(date));
            System.out.printf("Hora inicio.....: %02d:%02d:%02d%n", hour, min, sec);
            System.out.printf("Tiempo de clase.: %02d:%02d:%02d%n%n", hourTot, minTot, secTot);

            /* Pruebas sout
            System.out.println(hourTot);
            System.out.println(minTot);
            System.out.println(secTot);
             */
        } catch (Exception e) {
            System.out.println("OOOOPPPS!");
        }
    }
}
