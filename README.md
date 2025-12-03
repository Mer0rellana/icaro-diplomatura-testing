# 📘 Proyecto Final – Automatización Web con Selenium, Cucumber & Java

Diplomatura en Testing – ICARO

## 📝 Descripción del Proyecto

Este proyecto contiene la automatización de pruebas funcionales para dos aplicaciones web distintas:

1. **OpenCart** – Actividad de automatización de flujo de login, búsqueda y agregado de productos al carrito.
2. **Documentación de Selenium** – Actividad de automatización de funcionalidades del sitio oficial de documentación de Selenium.

Las pruebas están implementadas con:

* **Java 17**
* **Selenium WebDriver 4**
* **Cucumber BDD**
* **TestNG**
* **POM (Page Object Model)**
* **Maven**
* **WebDriverManager**

---

## 📂 Estructura del Proyecto

```
src
 ├── main
 │    └── java
 │         ├── actividadUno.openCart
 │         │     ├── CartPage
 │         │     ├── HomePage
 │         │     ├── LoginPage
 │         │     └── TabletsPage
 │         └── actividadDos.SeleniumPage
 │               ├── DownloadPage
 │               ├── MavenPage
 │               └── SeleniumPage
 └── test
      ├── java
      │    ├── driverFactory
      │    ├── hooks
      │    ├── runner
      │    └── steps
      └── resources
           └── features
                ├── 1_login.feature
                ├── 2_addProduct.feature
                └── 3_SearchDoc.feature
```

---

## ▶️ Ejecución del Proyecto

### Ejecutar todos los tests

Desde IntelliJ:

```
Right click → RunnerTest → Run
```

Desde consola:

```bash
mvn clean test
```

---

## 🧪 Funcionalidades Automatizadas

### ✅ **Actividad 1 – OpenCart**

#### 1. Login en OpenCart

**Feature:** `1_login.feature`

* El usuario ingresa al login.
* Completa el email y password.
* Accede correctamente al dashboard.

#### 2. Agregar producto al carrito

**Feature:** `2_addProduct.feature`

* El usuario navega a "Tablets".
* Selecciona *Samsung Galaxy Tab 10.1*.
* Lo agrega al carrito.
* Verifica que el producto se muestre en el carrito mediante su **título**.

---

## 🌐 Actividad 2 – Automatización de la página de documentación de Selenium

### 🔎 **1. Búsqueda de documentación (Maven Search)**

**Feature:** `3_SearchDoc.feature`
**Scenario: Maven search**

**Pasos automatizados:**

* El usuario accede a la página principal de documentación de Selenium.
* Hace clic en la barra de búsqueda.
* Escribe **“Maven”** y selecciona el resultado sugerido.
* Se verifica que el usuario visualice el **título de la documentación de Maven**.

### 📥 **2. Descarga de documentación (Download Documentation)**

**Feature:** `3_SearchDoc.feature`
**Scenario: Download documentation**

**Pasos automatizados:**

* El usuario hace clic en la opción **Downloads** del navbar.
* Visualiza los **Selenium Clients** disponibles.
* Verifica que existe la opción de descargar **otros lenguajes** (Java, Python, JS, Ruby, etc.).

---

## 🔧 Tecnologías Utilizadas

| Herramienta        | Uso                          |
| ------------------ | ---------------------------- |
| Selenium WebDriver | Automatización del navegador |
| Cucumber           | Estructura BDD               |
| TestNG             | Ejecutor de pruebas          |
| Maven              | Gestión de dependencias      |
| Java 17            | Lenguaje principal           |
| WebDriverManager   | Manejo automático de drivers |

---

## 🧱 Arquitectura

El proyecto sigue el patrón **Page Object Model (POM)** para mantener los scripts organizados, escalables y fáciles de mantener.
Cada página del sitio tiene su clase propia con sus elementos y métodos.

---

## 👩‍💻 Autor

**Mercedes Pilar Orellana**
 - QA Trainee
