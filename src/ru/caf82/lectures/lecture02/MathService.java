/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package ru.caf82.lectures.lecture02;

    /**
     *
     * @author kasuc
     */
    public class MathService {
       /*  public static float dotProduct(double[] a, double[] b) {
         float result = 0;
         for (int i=0; i<a.length; i++) {
             result += a[i]*b[i];
         }
         }*/ 
         public static double doProduct(double[] a, double[] b) {
             double  result=0; 
             for (int x=0; x<a.length; x++) {
             result=result+a[x]*b[x];
             }
             return result;
         }
        public static double sigmoid(double x){
            return (1/(1+Math.exp(-x))); 
        }
        public static double sigmoid(double[] x, double[] w) {
            double result=0;
            double k=doProduct(x,w);
            result=(1/(1+Math.exp(k)));
            return result;
        }

    }
