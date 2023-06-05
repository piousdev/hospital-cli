# Hospital Registration CLI Application

This is a simple command-line interface (CLI) application designed for managing hospital visitor registrations. The application allows visitors to register for a visit to a doctor or to visit a patient. It's built using Spring Framework and showcases the usage of Spring Application Context for Dependency Injection.

## Features
- Register a visitor for a doctor visit or patient visit.
- Display a report of all registered visitors.

## How to Use

### Prerequisites
Ensure you have the following installed on your machine:
- Java JDK 17 or later
- Maven (prefered but not necessary)

### Running the Application
1. Clone the repository to your local machine.
```bash
git clone https://github.com/username/hospital-cli.git
```

2. Navigate to the project directory.
```bash
cd hospital-cli
```

3. Run the application using Maven.
```bash
mvn spring-boot:run
```

### User Commands
After running the application, you will be prompted to enter a command. The following commands are supported:

- **register**: This command initiates the visitor registration process. You will be prompted to enter your first name, last name, and choose a doctor (or opt for patient visit).

- **report**: This command displays a list of all registered visitors, including the visitor's name, purpose of visit, and the time of their registration.

- **exit**: This command ends the application.


## License

This project is [MIT licensed](LICENSE.md).

## Contact
If you have any questions, feel free to open an issue or contact the maintainers directly.

*This is a re-upload of a class project at Becode*
