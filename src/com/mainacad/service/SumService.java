package com.mainacad.service;

public class SumService {

  public static Integer sumByConversion(Number number) {
    int result = 0;
    for (Character character :
        number.toString().toCharArray()) {
      if (!Character.isDigit(character)) {
        continue;
      }
      result += Integer.parseInt(String.valueOf(character));
    }
    return result;
  }

  public static Integer sumByMath(Integer number) {
    int result = 0;
    while (number != 0) {
      result += number % 10;
      number = number / 10;
    }
    return result;
  }
}
