# ⚽ KickCrew – Football Pitch Booking & Social Platform

An intelligent web application that helps players **book football pitches, organize matches, and manage teams** — all in one place.  
KickCrew combines a **Spring Boot (Java 11, MySQL 8.4)** backend with a **React (Create React App)** frontend for a seamless, modern experience.

---

## 🚀 Features

- 🏟️ **Pitch Booking System** – Browse and reserve fields with real-time availability  
- 👥 **Team Management** – Create or join teams, invite friends, manage rosters  
- 🗓️ **Match Scheduling** – Plan and coordinate matches directly in the app  
- 🧑‍💼 **Admin Dashboard** – Manage users, bookings, and payments easily  
- 📘 **Swagger API Docs** – Interactively explore REST endpoints  
- 💻 **Responsive Frontend** – Optimized for desktop and mobile devices  

---

## 🏗️ Architecture

KickCrew follows a simple **full-stack MVC** pattern with clear separation between frontend and backend:

| Layer | Technology | Description |
|-------|-------------|-------------|
| Frontend | React 18 (CRA) | User-facing interface |
| Backend | Spring Boot 2.2.2 (Java 11) | RESTful API and business logic |
| Database | MySQL 8.4 | Persistent data storage |
| Docs | SpringDoc OpenAPI 3 + Swagger UI | API documentation |

Kick-Crew/
├── kick-crew-backend/ # Spring Boot backend
│ ├── src/main/java/... # Controllers, services, repositories
│ ├── src/main/resources/ # application.properties
│ └── pom.xml
│
├── frontend/
│ └── kick-crew-frontend/ # React frontend (CRA)
│ ├── src/ # Components, pages, assets
│ ├── package.json
│ └── public/
│
├── .gitignore
└── README.md


---

## 📋 Prerequisites

Before running KickCrew locally, make sure you have:

- ☕ Java 11  
- 🧱 Maven 3.9+  
- 🐬 MySQL 8.4  
- 🧩 Node.js 18+ / npm 10+  

---

## ⚙️ Installation

### 1️⃣ Clone the repository

git clone https://github.com/SeifSalehh/Kick-Crew.git
cd Kick-Crew
2️⃣ Backend Setup

cd kick-crew-backend
mvn clean package
java -jar target/*.jar
🔗 Swagger URLs
Swagger UI: http://localhost:8080/swagger-ui.html

OpenAPI JSON: http://localhost:8080/v3/api-docs

💾 Database Config (application.properties)
properties

spring.datasource.url=jdbc:mysql://localhost:3306/kickcrew
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
server.port=8080
3️⃣ Frontend Setup


cd frontend/kick-crew-frontend
npm install
npm start
Runs at http://localhost:3000 and connects to http://localhost:8080.

🌐 Optional .env

REACT_APP_API_URL=http://localhost:8080
🔍 Example Usage
🧾 Backend (API)
GET /api/pitches → list all pitches

POST /api/bookings → create a new booking

GET /api/teams → fetch team info

💻 Frontend
Register and log in

Browse and book pitches

Create or join teams

View schedules and upcoming matches

🧠 Tech Stack Summary
Layer	Tools
Frontend	React, React Router, Axios
Backend	Spring Boot, Java 11
Database	MySQL 8.4
Build Tools	Maven, npm
Docs	SpringDoc + Swagger UI

🧩 Troubleshooting
Issue	Fix
Backend not starting	Check MySQL credentials in application.properties
CORS errors	Enable CORS in backend or use proxy for frontend
Swagger 404	Add dependency springdoc-openapi-ui:1.7.0
Port conflicts	Stop other processes using port 8080 or 3000

📊 Performance Highlights
⚡ Startup Time: ~2s (Spring Boot)

🚀 API Response Time: <100ms locally

📱 Responsive React UI

🤝 Contributing
Fork this repository

Create a new branch (feature/xyz)

Commit your changes

Open a Pull Request

⚖️ Copyright
© 2025 Seifeldin Saleh — All rights reserved.
This project and its source code may not be copied, modified, or distributed without explicit permission from the author.

🙏 Acknowledgments

Built by Seifeldin Saleh

Powered by Spring Boot, React, and MySQL
