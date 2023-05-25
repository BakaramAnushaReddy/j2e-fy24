import java.util.*;
class Q9 {
    Stack<int[]> s;
      public Q9() {
          s = new Stack<>();
      }
      public int next(int price) {
          int span=1;
          while(!s.isEmpty() && price>=s.peek()[0]){
              span+=s.peek()[1];
              s.pop();
          }
          s.push(new int[]{price,span});
          return span;
      }
  }