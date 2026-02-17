# TODO.md - Todo Application (Spring Boot + React)

## Project Overview
Build a Full-Stack Todo Application with:
- **Backend**: Spring Boot REST API
- **Frontend**: React

---

## Backend (Spring Boot) - Phase 1

### 1. Project Setup
- [ ] Create Maven project structure for Spring Boot
- [ ] Add dependencies: Spring Web, Spring Data JPA, H2 Database, Validation

### 2. Domain Model
- [ ] Create `Todo` entity with fields: id, title, description, completed, createdAt

### 3. Repository Layer
- [ ] Create `TodoRepository` interface with JPA methods
- [ ] Add custom query for filtering by completed status

### 4. Service Layer
- [ ] Create `TodoService` with CRUD operations
- [ ] Add validation for title (mandatory)
- [ ] Implement business logic

### 5. Controller Layer
- [ ] Create `TodoController` with REST endpoints:
  - POST `/api/todos` - Create todo
  - GET `/api/todos` - Get all todos (with optional filter)
  - GET `/api/todos/{id}` - Get todo by ID
  - PUT `/api/todos/{id}` - Update todo
  - DELETE `/api/todos/{id}` - Delete todo

### 6. Configuration
- [ ] Configure application.properties for H2 database
- [ ] Enable CORS for frontend-backend communication

---

## Frontend (React) - Phase 2

### 1. Project Setup
- [ ] Create React application using Create React App or Vite
- [ ] Install dependencies: axios

### 2. Components
- [ ] Create `TodoList` component to display todos
- [ ] Create `TodoItem` component for individual todo
- [ ] Create `TodoForm` component for adding/editing todos

### 3. State Management
- [ ] Use useState and useEffect hooks
- [ ] Manage todo state (loading, error, data)

### 4. API Integration
- [ ] Create API service with axios
- [ ] Implement CRUD operations (create, read, update, delete)

### 5. UI/UX
- [ ] Basic clean styling with CSS
- [ ] Display todos with completed/incomplete toggle
- [ ] Inline edit or modal for updating todos

---

## Integration - Phase 3

### 1. Connect Frontend to Backend
- [ ] Configure API base URL
- [ ] Test all CRUD operations
- [ ] Handle errors gracefully

### 2. Final Testing
- [ ] Test create todo
- [ ] Test get all todos
- [ ] Test update todo (toggle complete, edit)
- [ ] Test delete todo
- [ ] Test optional filter by completed status

---

## Project Structure

```
todo_project/
├── backend/                 # Spring Boot Application
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com/
│   │       │       └── todo/
│   │       │           └── app/
│   │       │               ├── TodoAppApplication.java
│   │       │               ├── controller/
│   │       │               │   └── TodoController.java
│   │       │               ├── service/
│   │       │               │   └── TodoService.java
│   │       │               ├── repository/
│   │       │               │   └── TodoRepository.java
│   │       │               ├── model/
│   │       │               │   └── Todo.java
│   │       │               └── dto/
│   │       │                   └── TodoRequest.java
│   │       └── resources/
│   │           └── application.properties
│   └── pom.xml
│
├── frontend/                # React Application
│   ├── public/
│   ├── src/
│   │   ├── components/
│   │   │   ├── TodoList.js
│   │   │   ├── TodoItem.js
│   │   │   └── TodoForm.js
│   │   ├── services/
│   │   │   └── api.js
│   │   ├── App.js
│   │   ├── App.css
│   │   └── index.js
│   ├── package.json
│   └── README.md
│
└── README.md
