# Singleton Design Pattern

### Why Use Singleton?
1. Controlled Access to a Single Instance: Use it when only one instance of a class is needed, e.g., 
    managing a shared resource like a database connection pool, configuration settings, or a logging service.
2. Global Access Point: The singleton provides a centralized way to access the instance.
3. Lazy Initialization: Ensures the object is created only when it’s needed, saving memory if not immediately required.

### Real-World Use Cases:

1. Configuration Management (e.g., java.util.Properties)
2. Caching
3. Logging Frameworks (e.g., Log4j uses Singleton)
4. Database Connection Managers