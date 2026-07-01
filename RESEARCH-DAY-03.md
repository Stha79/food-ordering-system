## Menu API

### Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/menu | Create a menu |
| GET | /api/menu | Get all menus |
| GET | /api/menu/{id} | Get menu by id |

### Sample Response

```json
{
  "statusCode": 200,
  "message": "Menu retrieved successfully",
  "data": {
    "id": 1,
    "name": "Chicken Burger",
    "price": 55.00,
    "categoryName": "Burgers"
  },
  "timestamp": "2026-07-01T19:20:10"
}
```