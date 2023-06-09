# PhoneApp

This is a phone application that allows users to manage contacts, send text messages, make calls, and view call and message history. The application supports multiple phone brands and models and provides a hierarchy of Phone classes to handle different phone types.

## Features

- Create new contacts with separate properties
- View existing contacts
- Send text messages
- View all messages for a specific contact
- Make calls
- View call history

## Requirements

To run this application, ensure you have the following:

- Java Development Kit (JDK) installed
- IDE or text editor of your choice

## Getting Started

Follow the steps below to set up and run the application:

1. Clone the repository:

```bash
git clone https://github.com/your-username/phone-application.git
```

2. Open the project in your preferred IDE or text editor.

3. Build the project to resolve any dependencies.

4. Run the `Main` class to start the application.

## Usage

To use the application, follow the provided API examples:

```java
// Create a new phone object
Phone phone = new SamsungGalaxy6();

// Add contacts to the phone
phone.addContact("1", "phone number", "first name", "last name");
phone.addContact("2", "second phone number", "second first name", "second last name");

// Get the first and last contacts
phone.getFirstContact();
phone.getLastContact();

// Send a message to the first contact
phone.sendMessage("phone number", "message content");

// Get the first and second messages for a specific contact
phone.getFirstMessage("phone number");
phone.getSecondMessage("phone number");

// Make a call to the second contact
phone.call("second phone number");

// View call history
phone.viewHistory();
```

## Battery Usage

The application tracks battery life and usage as follows:

- Sending a message consumes one hour of battery life.
- Making a call consumes two hours of battery life.

## Phone Hierarchy

The application implements a hierarchy of Phone classes to handle different phone brands and models. Each phone has certain properties, including battery life (non-configurable), color, material, and instance-specific IMEI.

## Acknowledgments

- The Phone Application was developed by Mihaita Hingan.
- This project was inspired by the need for a simple phone application with basic contact management, messaging, and calling capabilities.
