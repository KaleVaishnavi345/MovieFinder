# 🎬 MovieFinder

MovieFinder is a Spring Boot MVC web application that allows users to search and view movie shows stored in a MySQL database. The application provides a simple web interface where users can search for movies by name and display details such as show information, theater, date, and time.

## 📌 Features

* Search movies by movie name
* Display all available movie shows
* Case-insensitive movie search
* View movie show details including:

  * Show ID
  * Show Name
  * Movie Name
  * Theater Name
  * Show Date
  * Show Time
* Dynamic web pages using Thymeleaf
* MySQL database integration using Spring Data JPA
* Responsive user interface built with Bootstrap 5

## 🛠️ Technologies Used

### Backend

* Java 17
* Spring Boot 3.5
* Spring MVC
* Spring Data JPA
* Hibernate

### Frontend

* HTML5
* Thymeleaf
* Bootstrap 5

### Database

* MySQL (MySQL Workbench)

### Build Tool

* Maven

## 📂 Project Structure

```text
moviefinder
├── src
│   ├── main
│   │   ├── java
│   │   ├── resources
│   │   │   ├── templates
│   │   │   │── index.html
│   │   │   └── application.properties
│   └── test
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## ⚙️ Database Configuration

Configure your MySQL database in:

```text
src/main/resources/application.properties
```

Example configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/moviefinderdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

Create a MySQL database named:

```text
moviefinderdb
```

and import your required tables before running the application.

## ▶️ How to Run

Clone the repository:

```bash
git clone https://github.com/KaleVaishnavi345/MovieFinder.git
```

Navigate to the project folder:

```bash
cd MovieFinder
```

Run the application:

Windows

```bash
mvnw.cmd spring-boot:run
```

or

```bash
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

## 🔍 Search Functionality

Users can search for movie shows by entering a movie name in the search box.

The application performs a **case-insensitive search** and displays matching movie shows from the MySQL database.

## 📷 Application Interface

The home page includes:

* Search bar
* List of available movie shows
* Movie details
* Theater information
* Show date
* Show time

If no matching records are found, the application displays:

> No shows available in the database.

## 📌 Future Enhancements

* Add movie posters
* Filter movies by theater
* Filter by show date
* Online seat booking
* User authentication
* Admin dashboard for managing movies and shows
* Pagination for large datasets
* REST API support

## 👩‍💻 Developer

**Vaishnavi Kale**

GitHub: https://github.com/KaleVaishnavi345
