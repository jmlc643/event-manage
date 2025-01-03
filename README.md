<h1>Registro de Eventos</h1>

Hola soy José María Luyo Campos, creador de esta API para el registro de eventos en el cual se puede registrar eventos con título, fecha y descripción, almacenar los datos en una Base de Datos y ver estos mismos.

He usado GitHub Copilot para ahorrar tiempo en algunas partes del desarrollo.

## Tecnologías Utilizadas

- **Spring Boot**: Para el desarrollo del backend.
- **Gradle con Kotlin**: Para la gestión de dependencias y construcción del proyecto.
- **H2 Database**: Base de datos en memoria para pruebas.
- **GitHub Desktop**: Para el control de versiones en la plataforma GitHub.

## Requisitos Previos

- Java Development Kit (JDK) 17.
- Gradle.
- Git y GitHub Desktop.

## Configuración del Proyecto

1. Clona el repositorio:

    ```sh
    git clone https://github.com/jmlc643/event-manage.git
    cd event-manage
    ```

2. Configura las propiedades de la aplicación:

    - Abre el archivo [application.properties](http://_vscodecontentref_/1) y asegúrate de que las propiedades de conexión a la base de datos sean correctas.

    ```properties
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.h2.console.enabled=true
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    server.address=192.168.1.160
    server.port=8080
    ```

3. Compila y ejecuta la aplicación:

    ```sh
    ./gradlew clean build
    ./gradlew bootRun
    ```

4. Accede a la API:

    - La API estará disponible en `http://192.168.1.160:8080`.

## Endpoints Disponibles

- **GET /event/list/?page=0**: Lista todos los eventos.
- **GET /event/{id}**: Obtiene un evento por su ID.
- **POST /event/create/**: Crea un nuevo evento.
- **GET /event/search-title/?{titulo}**: Lista todos los eventos.
- **GET /event/search-date/?{fecha}**: Obtiene un evento por su ID.
