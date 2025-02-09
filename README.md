# UTEP-Eats

1. Program Overview
The application simulates an interactive food ordering experience, allowing users to...
- Browse and select items from a pre-defined menu.
- View the contents of their cart.
- Clear the cart if needed.
- Choose between delivery or pickup at checkout.
- Apply tips during the delivery process.
- Calculate and display the final total, including tax and optional delivery fees.

2. Core Functionalities
- Main Menu Navigation: The main menu offers users five options to interact with the application...
    - Option 1: Add food items to the cart.
    - Option 2: View the cart summary.
    - Option 3: Clear the cart.
    - Option 4: Proceed to checkout.
    - Option 5: Exit the program.
- Adding Food Items: Users can add food items by typing the name of the item. Each item is associated with a pre-defined price. If a valid item is selected, users specify the quantity, and the total price is updated accordingly.
- Viewing the Cart: The cart displays the number of items added and the total price of the selected items.
- Clearing the Cart: The application provides a confirmation prompt before clearing all items and resetting the cart to zero.
- Checkout Process: Users can choose between...
    - Delivery: Adds a $5 delivery fee and prompts for the delivery address and optional tip.
    - Pickup: No additional fees are applied.

3. Key Features
- Menu and Prices: The available food options and their prices are displayed from a file named food.txt.
- Error Handling: The application checks for invalid inputs when selecting options and handles unavailable menu items with appropriate messages.
- Tip Calculation: Users can add a custom tip percentage during delivery, which is included in the final total.
- Tax Calculation: The total price is calculated with an 8.25% tax rate before displaying the final amount.

