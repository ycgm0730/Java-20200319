package Day21;

import java.util.function.IntBinaryOperator;

public class MethodReferenceEx {

   public static void main(String[] args) {
      IntBinaryOperator operator;

      operator = new IntBinaryOperator() { // �͸�����ü

         @Override
         public int applyAsInt(int left, int right) {
            return Calculator.staticMethod(left, right);
         }
      };

      int result = operator.applyAsInt(10, 20);
      System.out.println(result);

      operator = (int left, int right) -> { // ���ٽ�
         return Calculator.staticMethod(left, right);
      };

      operator = (x, y) -> // ���ٽ�
      Calculator.staticMethod(x, y);
      result = operator.applyAsInt(10, 20);
      System.out.println(result);

   
      operator = Calculator::staticMethod;   //  ���� �޼ҵ� ����
      result = operator.applyAsInt(10, 20);
      System.out.println(result);
      
      Calculator calc =new Calculator();
      
      operator =calc::instanceMethod; //�ν��Ͻ� �޼ҵ� ����
   //   operator =Calculator::instanceMethod; //�ν��Ͻ� �޼ҵ�� Ŭ���������� ȣ�� �Ұ���
      result = operator.applyAsInt(10, 20);
      System.out.println(result);
      

   }

}