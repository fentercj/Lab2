class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
  int total = 605;
  double blue = .24 * total;
    System.out.println("blue: " + blue);
  double brown = .13 * total;
    System.out.println("brown: " + brown);
  double green = .16 * total;
    System.out.println("green: " + green);
  double orange = .20 * total;
    System.out.println("orange: " + orange);
  double red = .13 * total;
    System.out.println("red: " + red);
  double yellow = .14 * total;
    System.out.println("yellow: " + yellow);
  double sum = blue + brown + green + orange + red +yellow;
    System.out.println("sum: " + sum);
  if (blue > brown && red > orange)
     System.out.println("Blue over Brown and Red over Orange");
  if (brown <= green)
     System.out.println("Brown is less than or equal to Green");
  if (sum == total)
     System.out.println("Numbers match");
  }
};