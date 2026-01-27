void main() {
    Scanner in = new Scanner(System.in);
    IO.print("Enter the numeric grade: ");
    int grade = in.nextInt();
    if (grade >= 95) IO.print("Grade is A");
    else if (grade >= 90) IO.print("Grade is A-");
    else if (grade >= 85) IO.print("Grade is B+");
    else if (grade >= 80) IO.print("Grade is B");
    else if (grade >= 75) IO.print("Grade is B-");
    else if (grade >= 70) IO.print("Grade is C+");
    else if (grade >= 65) IO.print("Grade is C");
    else if (grade >= 60) IO.print("Grade is C-");
    else if (grade >= 55) IO.print("Grade is D+");
    else if (grade >= 50) IO.print("Grade is D");
    else IO.print("Grade is F");
}
