package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
  @Test 
  public void testGreet() {
    String expected = "Hello From App!";
    String actual = App.greet();
    assertEquals(expected, actual, "Greeting message should match");
  }
