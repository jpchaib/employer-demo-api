# Java SpringBoot API for Employer Entity Management

This is a Java SpringBoot API application that manages employer entities in a MySQL local database.

## Getting Started

### Prerequisites

To run this application, you will need to have Java 11 and MySQL installed on your computer.

### Database Configuration

1. Create a new database in your MySQL instance.

2. Open the file `src/main/resources/application.properties` and replace the database name, username, and password with your own:

`spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name_here
spring.datasource.username=your_username_here
spring.datasource.password=your_password_here`

### Running the Application

To run the application, navigate to the project directory in a terminal and run the following command:

`./mvnw spring-boot:run`

This will start the SpringBoot application on port 8080.

### Endpoints

The following endpoints are available for managing employer entities:

- `GET /employers`: Returns a list of all employers in the database.

- `POST /employers`: Creates a new employer.

- `PATCH /employers/{id}`: Updates the employer with the specified ID.

- `DELETE /employers/{id}`: Deletes the employer with the specified ID.

### Data Model

The employer entity has the following fields:

- `id`: The ID of the employer.
- `firstname`: The name of the employer.
- `lastname`: The name of the employer.
- `email`: The email of the employer.
- `number`: The phone number of the employer.
- `address`: The address of the employer.
- `ispermanent`: Boolean property. True if employer is permanent.
- `isfulltime`: Boolean property. True if employer is working under a full-time regime.
- `startdate`: Date that the employer start working.
- `finishdate`: Date that the employer finish working.

## Built With

- [Java SpringBoot](https://spring.io/projects/spring-boot) - A framework for building web applications.

- [MySQL](https://www.mysql.com/) - An open-source relational database management system.

- [Maven](https://maven.apache.org/) - A build automation tool used for managing dependencies and building the project.

## Authors

- [Your Name](https://github.com/yourusername) - Initial work

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
