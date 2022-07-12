class FunctionOverload {
    void area(float x){
        System.out.println("Area of square = "+ (x*x) + " sq units");
    }
    void area(float x,float y){
        System.out.println("Area of rectanle = "+ (x*x) + " sq units");
    }
    void area(double x){
        System.out.println("Area of circle = "+ (3.14*x*x) + " sq units");
    }
    public static void main(String args[]){
        FunctionOverload fn = new FunctionOverload();
        fn.area(5);
        fn.area(10,5);
        fn.area(2.5);
    }
}