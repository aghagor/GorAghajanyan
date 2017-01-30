package other;

/**
 * Created by ADMIN on 24.01.2017.
 */
public class ReportCard {
    public static char convertCardes(int testResult) {
        char grade;
        if (testResult >= 90) {
            grade = 'A';
        } else if (testResult >= 80 && testResult < 90) {
            grade = 'B';
        } else if (testResult >= 70 && testResult < 80) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }

    public static void main(String[] args) {
//        ReportCard reportCard = new ReportCard();
        char yourGrade = convertCardes(91);

        switch (yourGrade) {
            case 'A':
                System.out.println("Perfect work");
                break;
            case 'B':
                System.out.println("Good work");
                break;
            case 'C':
                System.out.println("You need more work");
                break;
            case 'D':
                System.out.println("Be seriosly!!");
                break;
        }
//        System.out.println("Your first deegre is " + yourGrade);
//        yourGrade = reportCard.convertCardes(99);
//        System.out.println("Yoursecond deegre is " + yourGrade);
    }
}
