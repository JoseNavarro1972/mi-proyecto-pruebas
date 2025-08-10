# Proyecto de Pruebas Automatizadas (Java + Maven + JUnit 5)

Este repositorio demuestra un proyecto de pruebas automatizadas en **Java** usando **Maven** y **JUnit 5**, con control de versiones en **Git**.

---

## 1) Cómo clonar el repositorio

> Reemplaza `<tu-usuario>` por tu usuario real de GitHub si lo publicas.

```bash
git clone https://github.com/<tu-usuario>/mi-proyecto-pruebas.git
cd mi-proyecto-pruebas
```

---

## 2) Instalar dependencias con Maven

Maven descarga automáticamente las dependencias al ejecutar los tests (no hace falta un comando extra):
```bash
mvn -q test
```

Requisitos previos:
- Java 21 (o LTS compatible)
- Maven 3.9+
- Git

---

## 3) Ejecutar los tests automatizados

```bash
mvn clean test
```
Salida esperada (ejemplo):
```
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

---

## 4) Estructura del proyecto

```
mi-proyecto-pruebas/
│ pom.xml
├─ README.md
├─ .gitignore
├─ src
│  ├─ main
│  │  └─ java/
│  └─ test
│     └─ java
│        └─ com/ejemplo/pruebas
│           ├─ AppTest.java       # Test de ejemplo (suma)
│           └─ SumaDosTest.java   # (opcional) otro test de ejemplo
└─ docs/
   └─ capturas/                   # guarda aquí tus evidencias (screenshots)
```

### Archivos clave
- **pom.xml**: Modelo del proyecto (Project Object Model). Define **dependencias**, **plugins** y **propiedades** (p. ej. versión de Java).
- **src/main/java**: Código de aplicación (si corresponde).
- **src/test/java**: Pruebas automatizadas con **JUnit 5**.
- **.gitignore**: Archivos y carpetas que no se versionan (p. ej. `target/`).
- **README.md**: Esta guía de uso, instalación y evidencias.

---

## 5) ¿Qué es Maven y para qué sirve `pom.xml`?

**Maven** es una herramienta de construcción (build) y gestión de dependencias para proyectos Java. Automatiza compilar, probar y empaquetar la aplicación.

El archivo **`pom.xml`** describe el proyecto: dependencias (p. ej., JUnit o Selenium), plugins (p. ej., Surefire para ejecutar tests), propiedades (versión de Java) y cómo construir/ejecutar el proyecto.

---

## 6) Flujo de Git (inicializar repo, ramas y commits)

> Si ya clonaste un repo remoto, este paso ya viene listo. Si vas a iniciar local:

```bash
# Dentro de la carpeta del proyecto
git init
git branch -M main

# Primer commit
git add .
git commit -m "chore: proyecto base Maven con JUnit 5"

# Rama de desarrollo para el primer test
git checkout -b feature/primer-test

# (opcional) crear un segundo test y commitear
git add src/test/java/com/ejemplo/pruebas/SumaDosTest.java
git commit -m "test: agrega segundo test de suma"
```

Convención de mensajes de commit sugerida (Conventional Commits):
- `feat:` nueva funcionalidad
- `fix:` corrección de bug
- `test:` pruebas automatizadas
- `docs:` documentación
- `chore:` tareas varias
- `refactor:` refactorización sin cambios funcionales

---

## 7) Evidencias (capturas y/o comandos)

Crea la carpeta para evidencias:
```bash
mkdir -p docs/capturas
```

Inserta aquí tus capturas (o pega salidas de consola) y enlázalas en el README. Por ejemplo:

- **Inicializar repositorio**  
  Comando:
  ```bash
  git init
  git branch -M main
  git add .
  git commit -m "chore: proyecto base Maven con JUnit 5"
  ```
  Captura: `![Init](docs/capturas/01-init.png)`

- **Crear rama y realizar commit**  
  Comando:
  ```bash
  git checkout -b feature/primer-test
  git add src/test/java/com/ejemplo/pruebas/AppTest.java
  git commit -m "test: agrega test de suma básica con JUnit 5"
  ```
  Captura: `![Ramas y commits](docs/capturas/02-rama-commit.png)`

- **Ejecutar tests y resultados**  
  Comando:
  ```bash
  mvn clean test
  ```
  Captura: `![Tests](docs/capturas/03-tests.png)`

> Tip: también puedes adjuntar texto de comandos con su salida usando bloques de código en Markdown.

---

## 8) Problemas comunes (FAQ)

- **“LF will be replaced by CRLF”**: aviso normal en Windows. Puedes configurar:
  ```bash
  git config --global core.autocrlf true
  ```

- **Maven no se reconoce**: instala Maven y agrega `C:\Program Files\apache-maven-3.9.x\bin` al `PATH`.

- **Java no se encuentra**: configura `JAVA_HOME` (ej.: `C:\Program Files\Java\jdk-21`) y agrega `%JAVA_HOME%\bin` al `PATH`.

---

## 9) Comandos útiles

```bash
# Ejecutar pruebas
mvn clean test

# Ver ramas y commits
git branch
git log --oneline --decorate --graph --all

# Actualizar dependencias en local (descarga/actualiza)
mvn -q dependency:resolve
```
