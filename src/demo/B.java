package demo;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import static java.time.LocalTime.now;

public class B extends A{

  private String s;

    public B(String s) {
        super("Pandey", 6);
        this.s = s;
        System.out.println("class B constructor");
    }
}
