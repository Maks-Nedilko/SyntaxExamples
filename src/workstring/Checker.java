/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workstring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author makst
 */
public class Checker {
    
    static boolean check1(String test){
        Pattern pattern = Pattern.compile("^[0-9][0-9][0-9]$");
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
    }
    static boolean check2(String test){
        Pattern pattern = Pattern.compile("^[0-9a-zA-z_]{3,}$");
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
    }
    
    static boolean check3(String test){
        
        Pattern pattern = Pattern.compile("^[а-яА-Я]{1,5}$");
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
    }
    
    static boolean check4(String test){
        Pattern pattern = Pattern.compile("^[а-я]{1}[a-zA-Z]{3}[0-9]{2}$");
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
        
    }
    static boolean check5(String test){
        Pattern pattern = Pattern.compile("^[0]{3}[H-R]{2}[1-9]{7}$");
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
        
    }
    static boolean check6(String test){
        Pattern pattern = Pattern.compile("^(АВ|АА|ВЖ)-(89|95|73)$");
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
        
    }
    static boolean check7(String test){
        Pattern pattern = Pattern.compile("^.+[.](edu|com|fr)$");
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
        
    }
    
    static boolean check(String test){
        Pattern pattern = Pattern.compile("(яимаика|Ямаика|Ямайка|ямайка)");
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
        
    }
    
    static String rep(String s){
        return s.replaceAll("[яЯ]ма[ий]ка", "Гвинея");
    } 
    
    public static void main(String[] args) {
        
        String test="Я хочу на ямаика.Она хочет в Ямайка";
        System.out.println(rep(test));
    }
}
