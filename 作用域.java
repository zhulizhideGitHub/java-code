public class Var {             //作用域
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);//不出作用域即可访问到
    }
    //System.out.println(i);变量的作用域在整个main方法中是可以被访问，出了大括号｛｝即出作用域无法访问
}
