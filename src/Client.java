public class Client {
    public static void main(String[] args) {

        Context context = new Context();

        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        //变量存储到环境当中
        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);
        //获取抽象语法树
        AbstractExpression expression = new Plus(a,new Plus(new Plus(c,d),d));
        System.out.println(expression.toString());
    }
}
