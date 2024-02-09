package com.driver;

public class Main {
    //1. create class Product inside main class
    public static void main(String[] args) {
        //2. create object of product in main function called p
        //Main.Product p = new Main.Product();
        Product p = new Product();
        int ans = p.product(10, 20);

        int ans1 = p.product(1, 2, 3);

        double ans2 = p.product(1.0, 2.0);

    }
    
    //1.
    //public static 
    public class Product{
        public int product(int x, int y){
            return x*y;

        }

        public int product(int x, int y, int z){
            return x*y*z;
        }

        public double product(double x, double y){
        return x*y;
        }

}
}