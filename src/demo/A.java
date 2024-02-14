package demo;

import java.util.Date;

public class A extends Z{


  private String str;
  private  int aVal;

  A(String str, int aVal) {
        super(7, 9.8, 7.89f);
        this.str = str;
        this.aVal = aVal;
        System.out.println("class A constructor");
    }
}
