void main() {
    Scanner in = new Scanner(System.in);
    String a, s1, s2;
    IO.print("Enter the string: ");
    a = in.next();
    boolean flag = isPalindrome(a);
    if (flag) IO.print("Is palindrome");
    else IO.print("Is not palindrome");
}

String rever_se(String str) {
    String ret_urn = "";
    for (int i = str.length() - 1; i >= 0; --i) {
        ret_urn += str.charAt(i);
    }
    return ret_urn;
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
    s2 = rever_se(s2);

    return s1.equals(s2);
}