# RESEARCH-DAY-02

## Q1. What is a Java generic type? Why is `<T>` useful?

A generic type allows a class or method to work with different data types while keeping type safety. Using `<T>` lets one class be reused with many object types without writing duplicate code.

---

## Q2. What does Lombok `@Builder` generate behind the scenes?

`@Builder` automatically generates a builder class with methods for setting each field and a `build()` method that creates the object. It removes the need to write long constructors manually.

---

## Q3. What is the Builder design pattern? When should it be used?

The Builder pattern is used to create complex objects step by step. It makes object creation easier and improves code readability, especially when a class has many fields or optional values.

---

## Q4. What is `LocalDateTime`? How is it different from `Date`?

`LocalDateTime` is part of the Java Time API and represents a date and time without a time zone. It is more modern, easier to use, immutable, and safer than the older `Date` class.

---

## Q5. Why does a consistent response format matter to frontend developers?

A consistent response format makes it easier for frontend applications to process API responses. Developers always know where to find the status, message, returned data, and timestamp, reducing errors and simplifying development.

---

## Q6. What does `@JsonInclude(JsonInclude.Include.NON_NULL)` do?

It tells Jackson not to include fields that have `null` values when converting Java objects into JSON. This produces cleaner and smaller API responses.

---

## Q7. What is a static factory method? Why use `Response.success(...)` instead of `new Response<>()`?

A static factory method is a static method that creates and returns an object. Using `Response.success(...)` keeps object creation consistent, reduces repeated code, and makes the code easier to read.

---

# Self Quiz

## Q1. Why use generic `<T>` instead of `Object` for the data field?

Using `<T>` provides compile-time type safety and eliminates the need for casting, making the code safer and easier to maintain.

---

## Q2. Difference between `Response<T>` and `ResponseEntity<T>`? Can you have both at once?

`Response<T>` is the custom object that contains the API response data, while `ResponseEntity<T>` is a Spring class used to control the HTTP response status, headers, and body. Yes, they can be used together, for example `ResponseEntity<Response<CategoryDto>>`.

---

## Q3. If a request fails, what statusCode does `Response` hold?

The `Response` object should contain the appropriate error status code, such as 400 for a bad request, 404 for a missing resource, or 500 for an internal server error.

---

## Q4. Why add a timestamp?

A timestamp helps developers know exactly when a response was generated. It is useful for debugging, logging, monitoring, and troubleshooting API requests.
