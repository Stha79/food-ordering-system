Question 1. What does CRUD stand for?

CRUD means to Create, Read, Update and Delete the data in an applications.

Question 2. Difference between POST, PUT, PATCH and DELETE?

POST is when you create the new resource.

PUT means to replace or updates an existing resource.

PATCH means to update only a specific fields of an existing resource.

DELETE removes a resource from the system.

Question 3. Correct HTTP Status Codes

a. A new category was created

201 Created

b. A category was deleted successfully

204 No Content

c. The id requested does not exist

404 Not Found

d. The request body is missing a required field

400 Bad Request

e. The user is logged in but not allowed

403 Forbidden

Question 4. Difference between @RequestBody, @RequestParam and @PathVariable
@RequestBody

Used to receive JSON data from the request body.

Example:

@PostMapping
public CategoryDto create(@RequestBody CategoryDto dto) { }
@RequestParam

Used to receive values from the URL query string.

Example:

@GetMapping("/search")
public String search(@RequestParam String name) { }

URL:

/search?name=Pizza
@PathVariable

Used to receive values directly from the URL path.

Example:

@GetMapping("/{id}")
public CategoryDto getById(@PathVariable Long id) { }

URL:

/api/category/1

Question 5. What is Jakarta Bean Validation?

Jakarta Bean Validation is used to validate user input before it reaches the service layer.

@Valid
Triggers validation on an object.

@NotBlank
Makes sure a string is not null, empty or only spaces.

@Size
Checks that the value is within a minimum and maximum length.

Question 6. Why return a DTO instead of the Entity?

A DTO hides database fields that should not be exposed to clients.
A DTO keeps the API separate from the database structure, making the application easier to maintain.

Question 7. What is Optional<T>? Why does findById return Optional?

Optional<T> is a container that may contain a value or be empty.

findById returns Optional because the requested record might not exist. This helps avoid NullPointerException and allows the application to handle missing data safely.

SELF-QUIZ

Question 1. Why use ResponseEntity instead of returning the object?

ResponseEntity allows us to return both the response body and the correct HTTP status code, along with headers if needed.

Question 2. What status should a successful DELETE return? Why?

A successful DELETE should return 204 No Content because the resource has been deleted and there is no response body to return.

Question 3. Update only one field — PUT or PATCH? Defend your answer.

PATCH is the better choice because it updates only the specified field without replacing the entire resource.

Question 4. What happens if you forget @Valid on the controller?

The validation annotations such as @NotBlank and @Size will not be checked, allowing invalid data to be accepted.

Question 5. Why must update/delete have {id} in the URL but create does not?

Update and delete need the resource ID to identify which record should be modified or removed. Create does not need an ID because the database generates it when the new record is saved.

