# Jeeb USSD Simulator

A Java console application that simulates the USSD menu experience of **Jeeb**, the mobile money service by Somnet Telecom (Somalia). It recreates the `*810#` dial flow, PIN authentication, and the full set of menu options a real user would see on their phone  all as an interactive, text-based simulation.

## Overview

Mobile money services in Somalia (like Jeeb, EVC Plus, ZAAD, Sahal) run through USSD codes rather than standalone apps. A user dials a code, sees a numbered menu appear on screen, and navigates by typing numbers. This project simulates that exact experience in Java, for learning and demonstration purposes.

## Features

- Simulated USSD dial screen (`*810#`)
- PIN authentication before menu access
- Full main menu with 9 services + exit
- Nested sub-menus for each service, each with its own inputs and confirmation step
- "Back" and "Exit" navigation matching real USSD conventions

## Menu Structure

```
JEEB MAIN MENU
1. Itus Haraaga        - Check balance
2. Kaarka Hadalka       - Airtime top-up (self or others)
3. Kaarka Internet      - Data bundle subscriptions
4. Lacag Dirid          - Send money to another number
5. Bixi Biil            - Pay bills (electricity, water, school)
6. Warbixin Kooban      - Mini statement (recent transactions)
7. Banks                - Bank transfer in/out
8. TAAJ                 - Remittance (local & international)
9. Maareynta            - Account management (change PIN, language)
0. KaBax                - Exit
```

## Requirements

- Java JDK 8 or higher

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/YOUR_USERNAME/jeeb-ussd-simulator.git
   cd jeeb-ussd-simulator
   ```

2. Compile the program:
   ```bash
   javac jeeb.java
   ```

3. Run it:
   ```bash
   java jeeb
   ```

4. When prompted, dial the USSD code:
   ```
   *810#
   ```

5. Enter the PIN when asked, then navigate the menu using the numbers shown.

## Project Structure

```
jeeb-ussd-simulator/
├── jeeb.java       # Main program (dial screen, PIN check, all menus)
└── README.md        # Project documentation
```

## Notes

- This is a learning/demo project and is not affiliated with or endorsed by Somnet Telecom or Jeeb.
- Built as a console simulation to practice core Java concepts (methods, loops, conditionals, string handling) using a real-world model familiar to Somali users.

## License

This project is open for educational use. Feel free to fork and modify it for your own learning.
