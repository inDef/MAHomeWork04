package com.mainacad.service;

public class CharacterReverseService {

  public static String reverseWordExceptNumbers(String string) {

    if (string.replaceAll("\\D", "").equals(string)) {
      return string;
    }

    char[] chars = string.toCharArray();
    char placeholder;
    int headIndex = 0;
    int tailIndex = chars.length - 1;
    while (headIndex <= tailIndex) {
      while (Character.isDigit(chars[headIndex])) {
        headIndex++;
      }
      while (Character.isDigit(chars[tailIndex])) {
        tailIndex--;
      }
      placeholder = chars[headIndex];
      chars[headIndex] = chars[tailIndex];
      chars[tailIndex] = placeholder;
      headIndex++;
      tailIndex--;
    }
    return new String(chars);
  }

  public static String reverseStringExceptNumbers(String string) {
    StringBuilder stringBuilder = new StringBuilder();
    for (String word :
        string.split("\\s+")) {
      stringBuilder.append(reverseWordExceptNumbers(word)).append(" ");
    }
    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    return stringBuilder.toString();
  }
}
