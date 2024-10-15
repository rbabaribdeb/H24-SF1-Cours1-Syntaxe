package Cours10;

import java.util.Scanner;

public class ExempleDebug1 {
    public static void main(String[] args) {
     /*   int x,y ;
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir x : ");
         x = sc.nextInt();
        System.out.println("saisir y : ");
         y = sc.nextInt();

        int resultat = x / y ;
        System.out.println("resultat : " + resultat);

        String chaine = "Bonjour";
        System.out.println(chaine.charAt(15));

        String chaine2 = null;
        System.out.println(chaine2.length());

        String str = "abc";
        int nombre = Integer.parseInt(str);


*/
        recursive();
    }
    public static void recursive()
    {
        recursive(); // Notion de fonctin qu'on verra dans les prochaines cours
        /* java.lang.StackOverflowError (ExempleDebug1.java:32)
        Exception in thread "main" java.lang.StackOverflowError
	at Cours10.ExempleDebug1.recursive(ExempleDebug1.java:32)
         */
    }

}
/* InputMismatchException(ExempleDebug1.java:10)
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:947)
	at java.base/java.util.Scanner.next(Scanner.java:1602)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
	at Cours10.ExempleDebug1.main(ExempleDebug1.java:10)
 */

/*ArithmeticException (ExempleDebug1.java:14)
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Cours10.ExempleDebug1.main(ExempleDebug1.java:14)
* */

/* StringIndexOutOfBoundsException (ExempleDebug1.java:18)
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 15 out of bounds for length 7
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
	at java.base/java.lang.String.checkIndex(String.java:4832)
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:46)
	at java.base/java.lang.String.charAt(String.java:1555)
	at Cours10.ExempleDebug1.main(ExempleDebug1.java:18)

 */

/* NullPointerException (ExempleDebug1.java:21)
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "chaine2" is null
	at Cours10.ExempleDebug1.main(ExempleDebug1.java:21)
 */

/* NumberFormatException (ExempleDebug1.java:24)
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:662)
	at java.base/java.lang.Integer.parseInt(Integer.java:778)
	at Cours10.ExempleDebug1.main(ExempleDebug1.java:24)
 */