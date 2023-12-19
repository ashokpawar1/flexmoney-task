# flexmoney-task

The project follows a standard Spring Boot MVC architecture for web applications. The main controller, AdmissionController, handles various endpoints for navigation and form submissions. Thymeleaf templates are used for frontend rendering. The User entity represents user data and is managed by the UserRepository interface, which extends JpaRepository for database operations. The UserServices class provides business logic, including saving new user data and updating admission information. The project incorporates features like user enrollment, payment renewal, and error handling. JavaScript is utilized for asynchronous calls in the payment renewal section. Overall, the project maintains a clean separation of concerns, making it scalable and easy to understand.
