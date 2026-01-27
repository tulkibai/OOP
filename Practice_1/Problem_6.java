void main() {
    Scanner in = new Scanner(System.in);
    String a, s1, s2;
    IO.print("Enter the string: ");
    a = in.next();
    boolean flag = isPalindrome(a);
    if (flag) IO.print("Is palindrome");
    else IO.print("Is not palindrome");
}

boolean isPalindrome(String a) {
    String s1, s2;
    if (a.length() % 2 == 0) {
        s1 = a.substring(0, a.length()/ 2);
        s2 = a.substring(a.length() / 2);
    }
    else {
        s1 = a.substring(0, (a.length() + 1) / 2);
        s2 = a.substring((a.length() + 1) / 2 - 1);
    }
    s2 = new StringBuilder(s2).reverse().toString();

    return s1.equals(s2);
}