# EMI-Calculator
EMI Calculator
📊 EMI Calculator
This is a simple Java console application that calculates the Equated Monthly Installment (EMI) for a loan based on the principal amount, annual interest rate, and loan tenure in years.

📌 Features
Takes user input for:

Loan amount (principal)

Annual interest rate (in %)

Loan tenure (in years)

Calculates the monthly EMI

Displays the EMI in USD

🧮 Formula Used
The EMI is calculated using the standard formula:

ini
Copy
Edit
EMI = [P × r × (1 + r)^n] / [(1 + r)^n – 1]
Where:

P = Principal loan amount

r = Monthly interest rate (annual interest rate divided by 12 × 100)

n = Loan tenure in months

🛠️ How to Run
Clone or download this repository.

Open the file EMIcalculator.java in your IDE (like IntelliJ, Eclipse) or a text editor.

Compile and run the program:

bash
Copy
Edit
javac EMIcalculator.java
java EMIcalculator
Follow the console prompts to enter:

Loan amount (e.g., 10000)

Annual interest rate (e.g., 8.5)

Loan tenure in years (e.g., 5)

View the EMI result displayed in the terminal.

📌 Example
mathematica
Copy
Edit
Enter loan amount in USD:
10000
Enter annual interest rate (in %):
8.5
Enter loan tenure:
5

Your monthly EMI is 205.19
🧠 Notes
Ensure the annual interest rate is entered as a percentage (e.g., enter 7.5 for 7.5%).

The calculation assumes a fixed interest rate and equal payments over the loan term.

📁 Package Structure
bash
Copy
Edit
src/
└── day4/
    └── EMIcalculator.java
✅ To-Do (Optional Enhancements)
Add total interest and total repayment calculations.

Implement a monthly amortization schedule.

Include input validation for edge cases.
