### CREATE STUDENT

### BASE_URL : https://company.com


```json
{
  "students": {
    "endpoints": [
      {
        "method": "GET",
        "path": "/api/v1/students",
        "description": "Retrieve a list of all students.",
        "responses": {
          "200": {
            "description": "A list of students.",
            "content": {
              "application/json": {
                "example": [
                  {
                    "id": "string",
                    "firstName": "string",
                    "lastName": "string",
                    "email": "string",
                    "dateOfBirth": "YYYY-MM-DD"
                  }
                ]
              }
            }
          },
          "400": {
            "description": "Invalid request parameters."
          },
          "500": {
            "description": "Internal server error."
          }
        }
      },
      {
        "method": "POST",
        "path": "/api/v1/students",
        "description": "Create a new student.",
        "requestBody": {
          "required": true,
          "content": {
            "application/json": {
              "example": {
                "firstName": "string",
                "lastName": "string",
                "email": "string",
                "dateOfBirth": "YYYY-MM-DD"
              }
            }
          }
        },
        "responses": {
          "201": {
            "description": "Student created successfully.",
            "content": {
              "application/json": {
                "example": {
                  "id": "string",
                  "firstName": "string",
                  "lastName": "string",
                  "email": "string",
                  "dateOfBirth": "YYYY-MM-DD"
                }
              }
            }
          },
          "400": {
            "description": "Invalid input data."
          },
          "500": {
            "description": "Internal server error."
          }
        }
      }
    ]
  },
  "courses": {
    "endpoints": [
      {
        "method": "GET",
        "path": "/api/v1/courses",
        "description": "Retrieve a list of all courses.",
        "responses": {
          "200": {
            "description": "A list of courses.",
            "content": {
              "application/json": {
                "example": [
                  {
                    "id": "string",
                    "title": "string",
                    "description": "string",
                    "credits": "integer"
                  }
                ]
              }
            }
          },
          "400": {
            "description": "Invalid request parameters."
          },
          "500": {
            "description": "Internal server error."
          }
        }
      },
      {
        "method": "POST",
        "path": "/api/v1/courses",
        "description": "Create a new course.",
        "requestBody": {
          "required": true,
          "content": {
            "application/json": {
              "example": {
                "title": "string",
                "description": "string",
                "credits": "integer"
              }
            }
          }
        },
        "responses": {
          "201": {
            "description": "Course created successfully.",
            "content": {
              "application/json": {
                "example": {
                  "id": "string",
                  "title": "string",
                  "description": "string",
                  "credits": "integer"
                }
              }
            }
          },
          "400": {
            "description": "Invalid input data."
          },
          "500": {
            "description": "Internal server error."
          }
        }
      }
    ]
  },
  "enrollments": {
    "endpoints": [
      {
        "method": "GET",
        "path": "/api/v1/enrollments",
        "description": "Retrieve a list of all enrollments.",
        "responses": {
          "200": {
            "description": "A list of enrollments.",
            "content": {
              "application/json": {
                "example": [
                  {
                    "id": "string",
                    "studentId": "string",
                    "courseId": "string",
                    "enrollmentDate": "YYYY-MM-DD"
                  }
                ]
              }
            }
          },
          "400": {
            "description": "Invalid request parameters."
          },
          "500": {
            "description": "Internal server error."
          }
        }
      },
      {
        "method": "POST",
        "path": "/api/v1/enrollments",
        "description": "Enroll a student in a course.",
        "requestBody": {
          "required": true,
          "content": {
            "application/json": {
              "example": {
                "studentId": "string",
                "courseId": "string"
              }
            }
          }
        },
        "responses": {
          "201": {
            "description": "Enrollment created successfully.",
            "content": {
              "application/json": {
                "example": {
                  "id": "string",
                  "studentId": "string",
                  "courseId": "string",
                  "enrollmentDate": "YYYY-MM-DD"
                }
              }
            }
          },
          "400": {
            "description": "Invalid input data."
          },
          "500": {
            "description": "Internal server error."
          }
        }
      }
    ]
  }
}
``` 

