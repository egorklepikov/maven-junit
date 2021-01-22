package com.test;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestCase {
  @Test
  public void doTest() {
    assertTrue(FirstCase.doSomething());
    assertTrue(SecondCaseMemberInInjection.doSomething());
    assertTrue(ThirdCaseMemberInInjection.doSomething());
  }
}
