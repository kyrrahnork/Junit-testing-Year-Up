class Main {
  public static void main(String[] args) {
    TestMe testMe = new TestMe();

    System.out.println("multiply 4 * 7: " + testMe.multiply(4, 7));
    System.out.println("Add 3 + 6: " + testMe.add(3, 6));
    System.out.println("Subtract 9 - 4: " + testMe.subtract(9, 4));
    System.out.println("Divide 8 + 3: " + testMe.divide(8, 3));
    System.out.println("isOdd 12: " + testMe.isOdd(12));
  }
}