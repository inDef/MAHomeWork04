package com.mainacad;

import com.mainacad.service.CharacterReverseService;
import com.mainacad.service.SumService;

public class AppRunner {

  public static void main(String[] args) {
    // task 1
    System.out.println(SumService.sumByConversion(999999999));
    System.out.println(SumService.sumByMath(999999999));

    // task 2
    String string = "123 a123b as3df3g";
    System.out.println(string);
    System.out.println(CharacterReverseService.reverseStringExceptNumbers(string));
  }
}
