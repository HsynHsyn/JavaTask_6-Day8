package m06_selection_statements;


import org.junit.jupiter.api.Test;
import testbase.TestBase;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
### Android is one of the popular mobile operating systems.
The versions in android systems follow names related to sweets.
You will need to take the given `version` value to output the name of the current version.
Use the follow chart to determine the versions:

#### Note: The `version` will be given as a `String`
when version is "1.5", you need to print "Cupcake"

Full list of versions to cover:
**Versions**
> - 1.5 - Cupcake
> - 1.6 - Donut
> - 2.1 - Eclair
> - 2.2 - Froyo
> - 2.3 - Gingerbread
> - 3.1 - Honeycomb
> - 4.0 - Ice Cream Sandwich
> - 4.1 - Jelly Bean
> - 4.4 - KitKat
> - 5.0 - Lollipop
> - 8.0 - Oreo
> - 9.0 - Pie
> - Any other number is invalid and should display: Not a valid version

#### Note: Its possible to use if statements to complete this, but use switch statement for practice. Or for even more practice, complete the task twice, once using each different conditional statement.

Main topics: switch statements, primitive variables, Scanner

Examples:
```
Ex:
  Input:
    1.5

  Output:
    Cupcake
```
```
Ex:
  Input:
    9.0

  Output:
    Pie
```
```
Ex:
  Input:
    11.0

  Output:
    Not a valid version
```
 */

public class AndroidVersions1 extends TestBase {
    public static void main(String[] args) {
        // Do not change below lines. Needed for unit tests below.
        // You can run main method and pass your value from console using scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your phone model: ");
        String version = input.nextLine();

        //WRITE YOUR CODE BELOW:
        switch (version) {
            case "1.5":
                System.out.println("Cupcake");
                break;
            case "1.6":
                System.out.println("Donut");
                break;
            case "2.1":
                System.out.println("Eclair");
                break;
            case "2.2":
                System.out.println("Froyo");
                break;
            case "2.3":
                System.out.println("Gingerbread");
                break;
            case "3.1":
                System.out.println("Honeycomb");
                break;
            case "4.0":
                System.out.println("Ice Cream Sandwich");
                break;
            case "4.1":
                System.out.println("Jelly Bean");
                break;
            case "4.4":
                System.out.println("KitKat");
                break;
            case "5.0":
                System.out.println("Lollipop");
                break;
            case "8.0":
                System.out.println("Oreo");
                break;
            case "9.0":
                System.out.println("Pie");
                break;
            default:
                System.out.println("Not a valid version");


        }

    }

}






