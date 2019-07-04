/*
	Создаётся специализированный класс для астрономических расчётов.
Для каждой планеты солнечной системы создать именованную константу, выражающую 
массу данной планеты. Написать метод, возвращающий массив удельных масс планет
по отношению к Земле, т.е. во сколько раз масса данной планеты больше массы
Земли. У дельные массы в массиве расположить  в след. порядке:  Меркурий, 
Венера, Земля, Марс, Юпитер, Сатурн, Уран, Нептун, Плутон.
(массы планет отыскать в Интернете).
 */
package homework;

import static java.lang.System.out;
import java.util.Arrays;


public class Fourth {
    
    public static final double MERCURY=330.2;
    public static final double VENUS=4868.5;
    public static final double EARTH=5973.6;
    public static final double MARS=641.85;
    public static final double JUPITER=1898600;
    public static final double SATURN=568460;
    public static final double URANUS=86832;
    public static final double NEPTUN=102430;
    public static final double CENTAURS=13.105;
    
    public static double[] Array(){
        double [] array = new double[9];
        array[0]= MERCURY/EARTH;
        array[1]= VENUS/EARTH;
       array[2]= 1;
       array[3]= MARS/EARTH;
       array[4]=JUPITER/EARTH;
       array[5]=SATURN/EARTH;
       array[6]=URANUS/EARTH;
       array[7]=NEPTUN/EARTH;
       array[8]=CENTAURS/EARTH;
            return array;
    }
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(Array()));
         double[] planetsMass = Array();
         for (double p: planetsMass) {
            out.println(p);
        }
    }
    
    
}
