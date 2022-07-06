# SavingsAccount
This project is very similar in design to the Mouse2 class and Mouse2Driver example in the book.

Remember the project in Ch 4 about calculating the value of an account as it grows, which was enhanced in Ch 5 to look better? We’ll do the same work here but using OOP methodology.  

In this project, the user will specify the starting balance for a savings account, the interest rate, and the number of cycles it will grow at that interest rate. The program will display how much the account is worth at the end of that growth.  

We need a class that provides the blueprint for this savings account. What kind of variables do we need? The current balance is essential. Since this is a savings account that grows by adding earned interest, we need the value for the interest rate to be able to calculate that earned interest. You might want to know the customer who owns this account – but notice that the customer is the owner, not part of the account. Therefore, the customer info is not part of this account. So the data needed to provide the information about the account and its current state is balance and interest rate. What actions can this account take, what can it do? The first thing needed will be setting the balance and the interest rate, so we need “mutator” or “set” methods for those actions. We need to be able to see the balance, which is an “accessor” or “get” method. Is there any other method required for this class? We could stop here, and “grow” the account in the driver class or main method. But that doesn’t make the best use of OOP design and programming, so we’re going add a method to the class to “grow” the account.    

Next, consider if the instance variables are public or private – protected or open to the world? If you want methods outside of this class, other programmer’s methods, to be able to change the variable directly, then make it public. Most of the time, you’ll want to protect the variable, make sure it’s changed only by the methods provided in the class. For this account, we certainly want to protect the balance and interest rate, so they need to be private. Add a minus sign or hyphen in front of those two variables in the UML diagram to represent that access. Next consider the data type for each variable – double or integer? The balance is money, and interest rates require decimals, so the variables need to be doubles.

The next step is to consider the methods. Are they private or public, available to the world outside of this class? All of them need to be public, because we are going to execute them from the driver class, which is outside of this class. What type of data will each method return? The “get” method will return the current value in the instance variable for balance, so it must return a double, matching data type of that variable. The two “set” methods don’t need to return anything, so their return type is “void”. The growAccount method is going to do work to change the account balance – does it need to return anything? No, its results will be in the balance variable, and we can get that number with the get method. So the growAccount method is also void.  

Do any of those methods need information passed into them when they are called? Usually the “set” methods need data to change the values in the variables. Here, we need to know the starting balance, the interest rate, and the number of cycles to grow the account, information provided by the user. For this project, we are going to use the driver class to ask the user for all that information. Therefore the driver class needs to pass the data to the methods in this class – the data will be provided to the method inside of its parentheses. The setBalance and setInterestRate methods need doubles passed to them. The growAccount method needs an integer for the number of cycles to grow the account.   

Begin by creating a new project and name it “Ch6SavingsAccount”. The IDE provides you the main class heading, which is the driver for this project. We’ll code that later; first, we need the class that will be the basis for that driver.  

In the File menu, click on “New File” – not new project, new FILE. Specify that the File Type is “Java Class”, and name it “Account”. This is the name of the class – the file name must match the name of the class. The IDE has again given you the starting point for this type of file.   

Now that the class exists, turn your attention to the driver or main code. What needs to happen here? The user needs to provide the starting balance, interest rate, and number of cycles to grow the account. As you have done in previous projects, you’ll ask the user to enter the necessary information.  

Take a moment to consider the interest rate value. The interest rate must be a double because it is a fraction of one whole unit. If someone says an interest rate is 7%, we don’t use “7” for the calculations – we use 7 / 100. Always make it clear to the user if they are supposed to enter percentage rates (7 for 7%) or the mathematical percentage (0.07 for 7%). It is usually best to have the user type it as if there was a percent symbol following it – 7 for 7% makes a lot more sense to a user than 0.07 for 7%. If the user types in a number like 7, you must do the math in the program to convert that to its decimal equivalent of 0.07 – divide the interest rate by 100. That code is in the class above.   

Notice that there are variables for balance, interest rate, and cycles in this driver class, which seem like a repetition of the instance variables in the Account class. The variables in the driver class are used to communicate with the user, to get the data to pass to the Account class to create a specific account. As discussed in the book, we could use different names for the variables, like “newBalance” or “inputInterestRate”, and sometimes that is helpful to make it very clear what data is being stored in each variable. But they really are the same data here, so we’ll use the same variable names in the driver class and the Account class. The prefix “this.” in the Account class helps to clarify that the data passed into the method is assigned to the private instance variable in the Account class.  


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
